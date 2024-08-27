package com.example.sellapy.ui.theme.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.movableContentOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.R
import com.example.sellapy.ui.theme.blue
import com.example.sellapy.ui.theme.yellow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController){

    Column (modifier = Modifier.fillMaxSize()) {
        //TopAppBar
        TopAppBar(
            title = { Text(text = "SellAppy", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(blue),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.White
                    )

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notifications",
                        tint = Color.White
                    )
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "Shoppingcart",
                        tint = Color.White
                    )
                }
            }


        )
        //End of topappbar
        Spacer(modifier = Modifier.height(10.dp))


        //Searchbar
        var search by remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search"
                )
            },
            placeholder = { Text(text = "Browse your product..") }

        )
        //End of searchbar

        Spacer(modifier = Modifier.height(10.dp))

       Box (modifier = Modifier
           .fillMaxWidth()
           .height(200.dp), contentAlignment = Alignment.Center){
           Image(
               painter = painterResource(id = R.drawable.clothe1),
               contentDescription ="",
               modifier = Modifier.fillMaxSize(),
               contentScale = ContentScale.Crop
           )
           Icon(
               imageVector =Icons.Default.Favorite ,
               contentDescription ="favorite",
               modifier = Modifier
                   .align(Alignment.TopEnd)
                   .padding(20.dp),
               tint = Color.Blue
           )
           Text(
               text = "Your best online shop",
               fontSize = 30.sp,
               color = Color.Blue,
               fontWeight = FontWeight.ExtraBold
           )

       }
        //End if image
        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text ="More Products",
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
            )
        Spacer(modifier = Modifier.height(10.dp))

        //Row 1

        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Spacer(modifier = Modifier.width(20.dp))
            //card
            Card(
                modifier = Modifier
                    .height(160.dp)
                    .width(130.dp)
            ) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.img_3),
                        contentDescription ="",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop


                    )

                }



            }
            //end of card
            Spacer(modifier = Modifier.width(20.dp))
            Card(
                modifier = Modifier
                    .height(160.dp)
                    .width(130.dp)
            ) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.img_1),
                        contentDescription ="",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop


                    )

                }



            }
            Spacer(modifier = Modifier.width(20.dp))


            Card(
                modifier = Modifier
                    .height(160.dp)
                    .width(130.dp)
            ) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.img_2),
                        contentDescription ="",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop


                    )

                }



            }
            Card(
                modifier = Modifier
                    .height(160.dp)
                    .width(130.dp)
            ) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.clothe1),
                        contentDescription ="",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop


                    )

                }



            }
        }


        //End of row 1
        Spacer(modifier = Modifier.height(10.dp))



        Text(
            text ="Additional Information",
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Row {
            Card(
                modifier = Modifier
                    .height(160.dp)
                    .width(200.dp)
            ) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.img_3),
                        contentDescription ="",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop


                    )

                }



            }
            //end of card
            Spacer(modifier = Modifier.width(30.dp))

            Column {
                Text(text = "Shop : Sellapy", fontSize = 20.sp)
                Text(text = "Brand : Alison", fontSize = 18.sp)
                Text(text = "Location : Westlands", fontSize = 15.sp)
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(yellow),
                    shape = RoundedCornerShape(10.dp)

                    ) {
                    Text(text = "Call")
                    
                }


            }

        }














    }



}

@Composable
@Preview(showBackground = true)
fun AboutScreenPreview(){
    DetailsScreen(rememberNavController())
}
