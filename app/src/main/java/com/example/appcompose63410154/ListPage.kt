package com.example.appcompose63410154

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.appcompose63410154.ui.theme.AppCompose63410154Theme

@Composable
fun ListPage(navController: NavController) {
    Column( modifier = Modifier
        .padding(5.dp)
        .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp, 30.dp, 20.dp, 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(text = "Home", fontWeight = FontWeight.Bold, fontSize = 30.sp)
            Image(
                painter = painterResource(R.drawable.bell),
                contentDescription = "bell icon",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(0.dp, 10.dp)
                    .width(22.dp)
                    .height(30.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(7.dp, 5.dp, 0.dp, 7.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Spacer(
                modifier = Modifier
                    .width(5.dp)
            )
            Image(
                painter = painterResource(R.drawable.plus),
                contentDescription = "plus icon",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(22.dp)
                    .height(22.dp)
            )
            Text(text = "For you")
            Text(text = "Following", fontWeight = FontWeight(2))
            Text(text = "Technology", fontWeight = FontWeight(2))
            Text(text = "Programming", fontWeight = FontWeight(2))
        }
        Column {
            Box() {
                Divider()
                Divider(startIndent = 56.dp, thickness = 2.dp, color = Color.Black)
                Divider(startIndent = 105.dp, thickness = 4.dp, color = Color.White)
                Divider(startIndent = 105.dp)
            }

        }
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Column(modifier = Modifier
                .padding(20.dp)
                .clickable { navController.navigate("DetailPagec1") }
            ) {
                Row {
                    Image(
                        painter = painterResource(R.drawable.ryan),
                        contentDescription = "ryan icon",
                        modifier = Modifier
                            .padding(0.dp)
                            .width(33.dp)
                            .height(33.dp)
                    )
                    Text(
                        modifier = Modifier
                            .padding(10.dp, 7.dp),
                        text = "Ryan Holiday"
                    )
                }
                Row() {
                    Column(
                        modifier = Modifier
                            .width(
                                210.dp
                            )
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(0.dp, 5.dp),
                            text = "This is the Most Important \nDecision of Your Life",
                            fontWeight = FontWeight.ExtraBold
                        )
                        Row() {
                            Text(text = "6 days ago", color = Color.Gray, fontSize = 13.sp)
                            Text(text = " • ", color = Color.Gray, fontSize = 13.sp)
                            Text(text = "5 min read", color = Color.Gray, fontSize = 13.sp)
                            Image(
                                painter = painterResource(R.drawable.star),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 2.dp)
                                    .width(12.dp)
                                    .height(12.dp)
                            )
                        }
                        Text(
                            modifier = Modifier
                                .padding(0.dp, 10.dp),
                            text = "Selected for you",
                            color = Color.Gray,
                            fontSize = 11.sp
                        )
                    }
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.c1),
                            contentDescription = "star icon",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(30.dp, 0.dp, 10.dp, 0.dp)
                                .width(100.dp)
                                .height(65.dp)
                        )
                        Row(
                            modifier = Modifier
                                .padding(20.dp, 15.dp, 0.dp, 0.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.bookmark),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 20.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                            Image(
                                painter = painterResource(R.drawable.remove),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 20.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                            Image(
                                painter = painterResource(R.drawable.menu),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 0.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                        }
                    }
                }
            }
            /////////////////////////////////////////////////////////////
            Column {
                Box() {
                    Divider()
                }

            }
            Column(modifier = Modifier
                .padding(20.dp)
                .clickable { navController.navigate("DetailPagec2") }
            ) {
                Row {
                    Image(
                        painter = painterResource(R.drawable.alex),
                        contentDescription = "ryan icon",
                        modifier = Modifier
                            .padding(0.dp)
                            .width(33.dp)
                            .height(33.dp)
                    )
                    Text(
                        modifier = Modifier
                            .padding(10.dp, 7.dp),
                        text = "Alex Mathers"
                    )
                }
                Row() {
                    Column(
                        modifier = Modifier
                            .width(210.dp)
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(0.dp, 5.dp),
                            text = "7 subtle behaviours \nthat are highly attractive",
                            fontWeight = FontWeight.ExtraBold
                        )
                        Row() {
                            Text(text = "Sep 28", color = Color.Gray, fontSize = 13.sp)
                            Text(text = " • ", color = Color.Gray, fontSize = 13.sp)
                            Text(text = "4 min read", color = Color.Gray, fontSize = 13.sp)
                            Image(
                                painter = painterResource(R.drawable.star),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 2.dp)
                                    .width(12.dp)
                                    .height(12.dp)
                            )
                        }
                        Text(
                            modifier = Modifier
                                .padding(0.dp, 10.dp),
                            text = "Selected for you",
                            color = Color.Gray,
                            fontSize = 11.sp
                        )
                    }
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.c2),
                            contentDescription = "star icon",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(30.dp, 0.dp, 10.dp, 0.dp)
                                .width(120.dp)
                                .height(65.dp)
                        )
                        Row(
                            modifier = Modifier
                                .padding(20.dp, 15.dp, 0.dp, 0.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.bookmark),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 20.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                            Image(
                                painter = painterResource(R.drawable.remove),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 20.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                            Image(
                                painter = painterResource(R.drawable.menu),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 0.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                        }
                    }
                }
            }
            /////////////////////////////////////////////////////////////
            Column {
                Box() {
                    Divider()
                }

            }
            Column(modifier = Modifier
                .padding(20.dp)
                .clickable { navController.navigate("DetailPagec3") }
            ) {
                Row {
                    Image(
                        painter = painterResource(R.drawable.tony),
                        contentDescription = "ryan icon",
                        modifier = Modifier
                            .padding(0.dp)
                            .width(33.dp)
                            .height(33.dp)
                    )
                    Text(
                        modifier = Modifier
                            .padding(10.dp, 7.dp),
                        text = "Tony Fahkry"
                    )
                }
                Row() {
                    Column(
                        modifier = Modifier
                            .width(210.dp)
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(0.dp, 5.dp),
                            text = "How To Get Out Of Your \nHead And Start Enjoying",
                            fontWeight = FontWeight.ExtraBold
                        )
                        Row() {
                            Text(text = "Sep 28", color = Color.Gray, fontSize = 13.sp)
                            Text(text = " • ", color = Color.Gray, fontSize = 13.sp)
                            Text(text = "5 min read", color = Color.Gray, fontSize = 13.sp)
                            Image(
                                painter = painterResource(R.drawable.star),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 2.dp)
                                    .width(12.dp)
                                    .height(12.dp)
                            )
                        }
                        Text(
                            modifier = Modifier
                                .padding(0.dp, 10.dp),
                            text = "Selected for you",
                            color = Color.Gray,
                            fontSize = 11.sp
                        )
                    }
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.c3),
                            contentDescription = "star icon",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(30.dp, 0.dp, 10.dp, 0.dp)
                                .width(100.dp)
                                .height(65.dp)
                        )
                        Row(
                            modifier = Modifier
                                .padding(20.dp, 15.dp, 0.dp, 0.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.bookmark),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 20.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                            Image(
                                painter = painterResource(R.drawable.remove),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 20.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                            Image(
                                painter = painterResource(R.drawable.menu),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 0.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                        }
                    }
                }
            }
            /////////////////////////////////////////////////////////////
            Column {
                Box() {
                    Divider()
                }

            }
            Column(modifier = Modifier
                .padding(20.dp)
                .clickable { navController.navigate("DetailPagec4") }
            ) {
                Row {
                    Image(
                        painter = painterResource(R.drawable.above),
                        contentDescription = "ryan icon",
                        modifier = Modifier
                            .padding(0.dp)
                            .width(33.dp)
                            .height(33.dp)
                    )
                    Text(
                        modifier = Modifier
                            .padding(10.dp, 7.dp),
                        text = "Above The Middle in ILLUMINATION"
                    )
                }
                Row() {
                    Column(
                        modifier = Modifier
                            .width(210.dp)
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(0.dp, 5.dp),
                            text = "How Depamine Is Distracting\nYou From The Life You Want",
                            fontWeight = FontWeight.ExtraBold
                        )
                        Row() {
                            Text(text = "6 days ago", color = Color.Gray, fontSize = 13.sp)
                            Text(text = " • ", color = Color.Gray, fontSize = 13.sp)
                            Text(text = "5 min read", color = Color.Gray, fontSize = 13.sp)
                            Image(
                                painter = painterResource(R.drawable.star),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 2.dp)
                                    .width(12.dp)
                                    .height(12.dp)
                            )
                        }
                        Text(
                            modifier = Modifier
                                .padding(0.dp, 10.dp),
                            text = "Selected for you",
                            color = Color.Gray,
                            fontSize = 11.sp
                        )
                    }
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.c4),
                            contentDescription = "star icon",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(30.dp, 0.dp, 10.dp, 0.dp)
                                .width(100.dp)
                                .height(65.dp)
                        )
                        Row(
                            modifier = Modifier
                                .padding(20.dp, 15.dp, 0.dp, 0.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.bookmark),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 20.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                            Image(
                                painter = painterResource(R.drawable.remove),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 20.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                            Image(
                                painter = painterResource(R.drawable.menu),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 0.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                        }
                    }
                }
            }
            /////////////////////////////////////////////////////////////
            Column {
                Box() {
                    Divider()
                }

            }
            Column(modifier = Modifier
                .padding(20.dp)
                .clickable { navController.navigate("DetailPagec5") }
            ) {
                Row {
                    Image(
                        painter = painterResource(R.drawable.alfret),
                        contentDescription = "ryan icon",
                        modifier = Modifier
                            .padding(0.dp)
                            .width(33.dp)
                            .height(33.dp)
                    )
                    Text(
                        modifier = Modifier
                            .padding(10.dp, 7.dp),
                        text = "Alfred l."
                    )
                }
                Row() {
                    Column(
                        modifier = Modifier
                            .width(210.dp)
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(0.dp, 5.dp),
                            text = "I Spent 2000 Hours Leaning\nHow To Learn: Part4",
                            fontWeight = FontWeight.ExtraBold
                        )
                        Row() {
                            Text(text = "Sep 27", color = Color.Gray, fontSize = 13.sp)
                            Text(text = " • ", color = Color.Gray, fontSize = 13.sp)
                            Text(text = "3 min read", color = Color.Gray, fontSize = 13.sp)
                        }
                        Text(
                            modifier = Modifier
                                .padding(0.dp, 10.dp),
                            text = "Selected for you",
                            color = Color.Gray,
                            fontSize = 11.sp
                        )
                    }
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.c5),
                            contentDescription = "star icon",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(30.dp, 0.dp, 10.dp, 0.dp)
                                .width(100.dp)
                                .height(65.dp)
                        )
                        Row(
                            modifier = Modifier
                                .padding(20.dp, 15.dp, 0.dp, 0.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.bookmark),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 20.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                            Image(
                                painter = painterResource(R.drawable.remove),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 20.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                            Image(
                                painter = painterResource(R.drawable.menu),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 0.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                        }
                    }
                }
            }
            /////////////////////////////////////////////////////////////
            Column {
                Box() {
                    Divider()
                }

            }
            Column(modifier = Modifier
                .padding(20.dp)
                .clickable { navController.navigate("DetailPagec6") }
            ) {
                Row {
                    Image(
                        painter = painterResource(R.drawable.scott),
                        contentDescription = "ryan icon",
                        modifier = Modifier
                            .padding(0.dp)
                            .width(33.dp)
                            .height(33.dp)
                    )
                    Text(
                        modifier = Modifier
                            .padding(10.dp, 7.dp),
                        text = "Scott H. Young in Better Humans"
                    )
                }
                Row() {
                    Column(
                        modifier = Modifier
                            .width(210.dp)
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(0.dp, 5.dp),
                            text = "10 Mental Models for\nLarning Anything",
                            fontWeight = FontWeight.ExtraBold
                        )
                        Row() {
                            Text(text = "Sep 28", color = Color.Gray, fontSize = 13.sp)
                            Text(text = " • ", color = Color.Gray, fontSize = 13.sp)
                            Text(text = "5 min read", color = Color.Gray, fontSize = 13.sp)
                            Image(
                                painter = painterResource(R.drawable.star),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 2.dp)
                                    .width(12.dp)
                                    .height(12.dp)
                            )
                        }
                        Text(
                            modifier = Modifier
                                .padding(0.dp, 10.dp),
                            text = "Selected for you",
                            color = Color.Gray,
                            fontSize = 11.sp
                        )
                    }
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.c6),
                            contentDescription = "star icon",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(30.dp, 0.dp, 10.dp, 0.dp)
                                .width(100.dp)
                                .height(65.dp)
                        )
                        Row(
                            modifier = Modifier
                                .padding(20.dp, 15.dp, 0.dp, 0.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.bookmark),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 20.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                            Image(
                                painter = painterResource(R.drawable.remove),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 20.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                            Image(
                                painter = painterResource(R.drawable.menu),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 0.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                        }
                    }
                }
            }
            /////////////////////////////////////////////////////////////
            Column {
                Box() {
                    Divider()
                }

            }
            Column(modifier = Modifier
                .padding(20.dp)
                .clickable { navController.navigate("DetailPagec7") }
            ) {
                Row {
                    Image(
                        painter = painterResource(R.drawable.cw),
                        contentDescription = "ryan icon",
                        modifier = Modifier
                            .padding(0.dp)
                            .width(33.dp)
                            .height(33.dp)
                    )
                    Text(
                        modifier = Modifier
                            .padding(10.dp, 7.dp),
                        text = "CW in Kopi Date"
                    )
                }
                Row() {
                    Column(
                        modifier = Modifier
                            .width(210.dp)
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(0.dp, 5.dp),
                            text = "The Psychology\nof Attraction",
                            fontWeight = FontWeight.ExtraBold
                        )
                        Row() {
                            Text(text = "Sep 28", color = Color.Gray, fontSize = 13.sp)
                            Text(text = " • ", color = Color.Gray, fontSize = 13.sp)
                            Text(text = "5 min read", color = Color.Gray, fontSize = 13.sp)
                        }
                        Text(
                            modifier = Modifier
                                .padding(0.dp, 10.dp),
                            text = "Selected for you",
                            color = Color.Gray,
                            fontSize = 11.sp
                        )
                    }
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.c7),
                            contentDescription = "star icon",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(30.dp, 0.dp, 10.dp, 0.dp)
                                .width(100.dp)
                                .height(65.dp)
                        )
                        Row(
                            modifier = Modifier
                                .padding(20.dp, 15.dp, 0.dp, 0.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.bookmark),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 20.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                            Image(
                                painter = painterResource(R.drawable.remove),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 20.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                            Image(
                                painter = painterResource(R.drawable.menu),
                                contentDescription = "star icon",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp, 0.dp, 0.dp, 0.dp)
                                    .width(22.dp)
                                    .height(22.dp)
                            )
                        }
                    }
                }
            }
            Divider()
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, 15.dp, 20.dp, 15.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Image(
                    painter = painterResource(R.drawable.home),
                    contentDescription = "star icon",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp, 0.dp, 0.dp, 0.dp)
                        .width(30.dp)
                        .height(30.dp)
                )
                Image(
                    painter = painterResource(R.drawable.search),
                    contentDescription = "star icon",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp, 0.dp, 0.dp, 0.dp)
                        .width(30.dp)
                        .height(30.dp)
                )
                Image(
                    painter = painterResource(R.drawable.bookmarklist),
                    contentDescription = "star icon",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp, 0.dp, 0.dp, 0.dp)
                        .width(30.dp)
                        .height(30.dp)
                )
                Image(
                    painter = painterResource(R.drawable.account),
                    contentDescription = "star icon",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp, 0.dp, 0.dp, 0.dp)
                        .width(30.dp)
                        .height(30.dp)
                )
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    AppCompose63410154Theme {
//        ListPage("DetailPage")
//    }
//}