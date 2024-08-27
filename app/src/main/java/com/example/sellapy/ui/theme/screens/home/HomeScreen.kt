package com.example.sellapy.ui.theme.screens.home


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.R
import com.example.sellapy.navigation.ROUT_DETAILS
import com.example.sellapy.ui.theme.blue
import com.example.sellapy.ui.theme.yellow


@Composable
fun HomeScreen(navController:NavController){

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(blue),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ){

        Image(
            painter = painterResource(id =R.drawable.img) ,
            contentDescription ="product",
            modifier = Modifier.size(300.dp)
        )

       Spacer(modifier = Modifier.height(10.dp))


       Text(
           text = "SellApy",
           fontSize = 40.sp,
           fontFamily = FontFamily.Cursive,
           color = Blue
       )
        Spacer(modifier = Modifier.height(10.dp))



        Button(
            onClick = { navController.navigate(ROUT_DETAILS) },
            colors = ButtonDefaults.buttonColors(yellow),
            shape = RoundedCornerShape(10.dp)


            ) {
            Text(text = "Continue")
            
        }

        
        


    }







}




@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){

    HomeScreen(navController = rememberNavController())

}