package com.example.sellapy.data


import android.app.ProgressDialog
import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation.NavController
import com.example.sellapy.navigation.ADD_PRODUCTS_URL
import com.example.sellapy.navigation.VIEW_PRODUCTS_URL
import com.example.sellapy.data.AuthViewModel
import com.example.sellapy.models.Product
import com.example.sellapy.navigation.ROUT_LOGIN
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.storage.FirebaseStorage

class StudentViewModel<Student>(var navController: NavController, var context: Context) {
    var authViewModel: AuthViewModel
    var progress: ProgressDialog
    init {
        authViewModel = AuthViewModel(navController, context)
        if (!authViewModel.isLoggedIn()){
            navController.navigate(ROUT_LOGIN)
        }
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }

    fun uploadStudent(name:String, email:String, age:String,filePath: Uri){
        val studentId = System.currentTimeMillis().toString()
        val storageRef = FirebaseStorage.getInstance().getReference()
            .child("Students/$studentId")
        progress.show()
        storageRef.putFile(filePath).addOnCompleteListener{
            progress.dismiss()
            if (it.isSuccessful){
                // Save data to db
                storageRef.downloadUrl.addOnSuccessListener {
                    var imageUrl = it.toString()
                    var students = com.example.sellapy.models.Student(name,email,age,imageUrl,studentId)
                    var databaseRef = FirebaseDatabase.getInstance().getReference()
                        .child("Students/$studentId")
                    databaseRef.setValue(students).addOnCompleteListener {
                        if (it.isSuccessful){
                            navController.navigate(VIEW_PRODUCTS_URL)
                            Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                        }else{
                            Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }else{
                Toast.makeText(this.context, "Upload error", Toast.LENGTH_SHORT).show()
            }
        }
    }




    fun allProducts(
        product: MutableState<Product>,
        products: SnapshotStateList<Product>):SnapshotStateList<Product>{
        progress.show()
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Products")
        ref.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                products.clear()
                for (snap in snapshot.children){
                    var retrievedProduct = snap.getValue(Product::class.java)
                    product.value = retrievedProduct!!
                    products.add(retrievedProduct)
                }
                progress.dismiss()
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, "DB locked", Toast.LENGTH_SHORT).show()
            }
        })
        return products
    }




    fun updateStudents(studentId:String){
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Students/$studentId")
        ref.removeValue()
        navController.navigate(ADD_PRODUCTS_URL)
    }


    fun deleteStudent(studentId:String){
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Students/$studentId")
        ref.removeValue()
        Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
    }
}


