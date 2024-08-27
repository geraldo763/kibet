package com.example.sellapy.ui.theme.screens.splash

import android.annotation.SuppressLint
import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.R
import com.example.sellapy.navigation.ROUT_DASHBOARD
import com.example.sellapy.navigation.ROUT_DETAILS
import com.example.sellapy.ui.theme.blue
import com.example.sellapy.ui.theme.yellow
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize()) {

        //Navigation code for splashscreen

        val coroutine = rememberCoroutineScope()
        coroutine.launch {

            delay(3000)
            navController.navigate(ROUT_DASHBOARD)
        }






        Card (
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            shape = RoundedCornerShape(bottomStart = 50.dp),
            colors = CardDefaults.cardColors(blue)

            ){
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ){

                Image(
                    painter = painterResource(id = R.drawable.img_10) ,
                    contentDescription ="product",
                    modifier = Modifier.size(100.dp)

                )
                Text(
                    text ="Welcome to SellAppy",
                    fontSize = 30.sp,
                    color = Color.White,
                    fontFamily = FontFamily.Cursive
                )
                Text(
                    text ="Home of fashion",
                    fontSize = 30.sp,
                    color = Color.White,

                )


            }




        }
        Spacer(modifier = Modifier.height(50.dp))


        Text(
            text ="\n" +
                    "An ecommerce website is an online store where customers can find products, browse offerings, and place purchases online. It facilitates the transaction between a buyer and seller.",
            fontSize = 20.sp,
           modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))


        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(blue),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)


        ){
            Text(text = "LET'S BEGIN")

        }







    }



}

@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}
