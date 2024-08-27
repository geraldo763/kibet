package com.example.sellapy.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.R
import com.example.sellapy.navigation.ROUT_DASHBOARD
import com.example.sellapy.navigation.ROUT_HOME
import com.example.sellapy.navigation.ROUT_INTENT
import com.example.sellapy.ui.theme.blue
import com.example.sellapy.ui.theme.yellow


@Composable
fun dashboardScreen(navController: NavController){

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(blue),
        horizontalAlignment = Alignment.CenterHorizontally

    ){


        Image(
            painter = painterResource(id = R.drawable.img) ,
            contentDescription ="product",
            modifier = Modifier.size(100.dp)

        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text ="Your Best Online Shop",
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))

        Column {
            Card(
                modifier = Modifier.fillMaxWidth()
                    .height(700.dp)
                    .clickable { navController.navigate(ROUT_HOME) },
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                colors = CardDefaults.cardColors(yellow)
            ) {
                //Row1
                Row(modifier = Modifier.padding(20.dp)) {
                    //card1
                    Card(modifier = Modifier.width(160.dp).height(180.dp)) {

                        Column {
                            Spacer(modifier = Modifier.height(20.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_6),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Text(
                                text = "Home",
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }

                    }
                    //end of card1

                    Spacer(modifier = Modifier.width(20.dp))



                    //card1
                    Card(modifier = Modifier.width(160.dp).height(180.dp)) {
                        Column {
                            Spacer(modifier = Modifier.height(20.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_7),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Text(
                                text = "Messages",
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }


                    }
                    //end of card1

                }
                //End of row1
                Row(modifier = Modifier.padding(20.dp)) {
                    //card1
                    Card(modifier = Modifier.width(160.dp).height(180.dp)) {

                        Column {
                            Spacer(modifier = Modifier.height(20.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_8),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Text(
                                text = "Profile",
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }

                    }
                    //end of card1

                    Spacer(modifier = Modifier.width(20.dp))



                    //card1
                    Card(modifier = Modifier.width(160.dp).height(180.dp)) {
                        Column {
                            Spacer(modifier = Modifier.height(20.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_9),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Text(
                                text = "Settings",
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }


                    }
                    //end of card1

                }
                Row(modifier = Modifier.padding(20.dp)) {
                    //card1
                    Card(modifier = Modifier.width(160.dp)
                        .height(180.dp)
                        .clickable { navController.navigate(ROUT_DASHBOARD) }) {

                        Column {
                            Spacer(modifier = Modifier.height(20.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_10),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Text(
                                text = "Clothes",
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }

                    }
                    //end of card1

                    Spacer(modifier = Modifier.width(20.dp))



                    //card1
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable { navController.navigate(ROUT_INTENT) }) {
                        Column {
                            Spacer(modifier = Modifier.height(20.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_6),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Text(
                                text = "Home",
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }


                    }
                    //end of card1

                }


            }
        }


    }



}

@Composable
@Preview(showBackground = true)
fun dashboardScreenPreview(){
   dashboardScreen(rememberNavController())
}
