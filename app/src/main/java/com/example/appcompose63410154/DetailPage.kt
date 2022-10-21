package com.example.appcompose63410154

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.appcompose63410154.ui.theme.AppCompose63410154Theme

//@Composable
//fun DetailPagec1(navController: NavController) {
//    Column( modifier = Modifier
//        .padding(5.dp)
//        .background(Color.White)
//        .verticalScroll(rememberScrollState())
//    ) {
//        TopAppBar(title =  {
//            Row( modifier = Modifier
//                .fillMaxWidth()
//                .padding(20.dp),
//                horizontalArrangement = Arrangement.SpaceBetween
//            ){
//                Image(
//                    painter = painterResource(R.drawable.back),
//                    contentDescription = "ryan icon",
//                    modifier = Modifier
//                        .padding(0.dp, 0.dp, 170.dp, 0.dp)
//                        .width(21.dp)
//                        .height(21.dp)
//                        .clickable { navController.navigate("ListPage") }
//                )
//                Image(
//                    painter = painterResource(R.drawable.play),
//                    contentDescription = "ryan icon",
//                    modifier = Modifier
//                        .padding(0.dp)
//                        .width(21.dp)
//                        .height(21.dp)
//                )
//                Image(
//                    painter = painterResource(R.drawable.bookmark),
//                    contentDescription = "ryan icon",
//                    modifier = Modifier
//                        .padding(0.dp)
//                        .width(21.dp)
//                        .height(21.dp)
//                )
//                Image(
//                    painter = painterResource(R.drawable.share),
//                    contentDescription = "ryan icon",
//                    modifier = Modifier
//                        .padding(0.dp)
//                        .width(21.dp)
//                        .height(21.dp)
//                )
//                Image(
//                    painter = painterResource(R.drawable.menu),
//                    contentDescription = "ryan icon",
//                    modifier = Modifier
//                        .padding(0.dp)
//                        .width(21.dp)
//                        .height(21.dp)
//                )
//
//            }
//            Divider()
//        })
//        Column(modifier = Modifier
//            .padding(20.dp)
//        ) {
//            Row(){
//                Column() {
//                    Image(
//                        painter = painterResource(R.drawable.ryan),
//                        contentDescription = "ryan icon",
//                        modifier = Modifier
//                            .padding(0.dp)
//                            .width(50.dp)
//                            .height(50.dp)
//                    )
//                }
//                Column() {
//                    Row {
//                        Text(modifier = Modifier
//                            .padding(10.dp, 0.dp),
//                            text = "Ryan Holiday"
//                        )
//                        Image(
//                            painter = painterResource(R.drawable.follow),
//                            contentDescription = "button",
//                            modifier = Modifier
//                                .padding(0.dp)
//                                .width(50.dp)
//                                .height(25.dp)
//                        )
//                    }
//                    Row(modifier = Modifier
//                        .padding(10.dp, 0.dp)) {
//                        Text(text = "6 days ago", color = Color.Gray, fontSize = 13.sp)
//                        Text(text = " • ", color = Color.Gray, fontSize = 13.sp)
//                        Text(text = "5 min read", color = Color.Gray, fontSize = 13.sp)
//                        Image(
//                            painter = painterResource(R.drawable.star),
//                            contentDescription = "star icon",
//                            contentScale = ContentScale.Crop,
//                            modifier = Modifier
//                                .padding(5.dp, 2.dp)
//                                .width(12.dp)
//                                .height(12.dp)
//                        )
//                    }
//                }
//            }
//        }
//        Column(modifier = Modifier
//            .padding(20.dp)) {
//            Text(text = "This is the Most Important\nDecision of Your Life",
//                fontWeight = FontWeight.ExtraBold,
//                fontSize = 25.sp)
//            Image(
//                painter = painterResource(R.drawable.c1),
//                contentDescription = "star icon",
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .padding(0.dp, 20.dp)
//            )
//            Text(modifier = Modifier
//                .padding(0.dp, 20.dp),
//                text = "It was long ago new that Hercules came\nto the crossroads.",
//                fontSize = 18.sp)
//            Text(modifier = Modifier
//                .padding(0.dp, 5.dp),
//                text = "At a quiet intersection in teh hills of\n" +
//                        "Greece, in the shade of knobby pine\n" +
//                        "trees, the great hero of Greek myth first\n" +
//                        "met his destiny.",
//                fontSize = 18.sp)
//            Text(modifier = Modifier
//                .padding(0.dp, 5.dp),
//                text = "Where exactly it was or when, no one\n" +
//                        "knows. We hear of this moment in\n" +
//                        "the stories of Scrates. We can see it\n" +
//                        "captured in the most beautiful art of the\n" +
//                        "Renaissance. We can feel his budding\n" +
//                        "energy, his strapping muscles, and his\n" +
//                        "anguish in the classic Bach cantata. If\n" +
//                        "John Adams had had his way in 1776,\n" +
//                        "Hercules at the crossroads would have\n" +
//                        "been immortalized on the official seal of\n" +
//                        "the newly founded United States.",
//                fontSize = 18.sp)
//            Text(modifier = Modifier
//                .padding(0.dp, 5.dp),
//                text = "Because there, before the man's undying fame, before the twelve labors, before he changed the would, Hercules faced a crisis, one as life-changing and real as any of us have ever faced.",
//                fontSize = 18.sp)
//            Text(modifier = Modifier
//                .padding(0.dp, 5.dp),
//                text = "Where was he headed? Where was he trying to go? That's the point of the story. Alone, unknown, unsure, Hercules, like so many, did not know.",
//                fontSize = 18.sp)
//            Text(modifier = Modifier
//                .padding(0.dp, 5.dp),
//                text = "Where the road diverged lay a beautiful goddess who offered him every temptation he could imagine. Adorned in finery, she promised him a life of ease. She swore he'd never taste want or unhappiness or fear or pain. Follow her, she said, and his every desire would be fulfilled.",
//                fontSize = 18.sp)
//            Text(modifier = Modifier
//                .padding(0.dp, 5.dp),
//                text = "",
//                fontSize = 18.sp)
//        }
//    }
//}

@Composable
fun DetailPagec1(navController: NavController) {
    Column( modifier = Modifier
        .padding(5.dp)
        .background(Color.White)
    ) {
            Row( modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Image(
                    painter = painterResource(R.drawable.back),
                    contentDescription = "ryan icon",
                    modifier = Modifier
                        .padding(0.dp, 0.dp, 170.dp, 0.dp)
                        .width(21.dp)
                        .height(21.dp)
                        .clickable { navController.navigate("ListPage") }
                )
                Image(
                    painter = painterResource(R.drawable.play),
                    contentDescription = "ryan icon",
                    modifier = Modifier
                        .padding(0.dp)
                        .width(21.dp)
                        .height(21.dp)
                )
                Image(
                    painter = painterResource(R.drawable.bookmark),
                    contentDescription = "ryan icon",
                    modifier = Modifier
                        .padding(0.dp)
                        .width(21.dp)
                        .height(21.dp)
                )
                Image(
                    painter = painterResource(R.drawable.share),
                    contentDescription = "ryan icon",
                    modifier = Modifier
                        .padding(0.dp)
                        .width(21.dp)
                        .height(21.dp)
                )
                Image(
                    painter = painterResource(R.drawable.menu),
                    contentDescription = "ryan icon",
                    modifier = Modifier
                        .padding(0.dp)
                        .width(21.dp)
                        .height(21.dp)
                )

            }
            Divider()
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Row() {
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.ryan),
                            contentDescription = "ryan icon",
                            modifier = Modifier
                                .padding(0.dp)
                                .width(50.dp)
                                .height(50.dp)
                        )
                    }
                    Column() {
                        Row {
                            Text(
                                modifier = Modifier
                                    .padding(10.dp, 0.dp),
                                text = "Ryan Holiday"
                            )
                            Image(
                                painter = painterResource(R.drawable.follow),
                                contentDescription = "button",
                                modifier = Modifier
                                    .padding(0.dp)
                                    .width(50.dp)
                                    .height(25.dp)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .padding(10.dp, 0.dp)
                        ) {
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
                    }
                }
            }
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Text(
                    text = "This is the Most Important\nDecision of Your Life",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 25.sp
                )
                Image(
                    painter = painterResource(R.drawable.c1),
                    contentDescription = "star icon",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(0.dp, 20.dp)
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 20.dp),
                    text = "It was long ago new that Hercules came\nto the crossroads.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "At a quiet intersection in teh hills of\n" +
                            "Greece, in the shade of knobby pine\n" +
                            "trees, the great hero of Greek myth first\n" +
                            "met his destiny.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Where exactly it was or when, no one\n" +
                            "knows. We hear of this moment in\n" +
                            "the stories of Scrates. We can see it\n" +
                            "captured in the most beautiful art of the\n" +
                            "Renaissance. We can feel his budding\n" +
                            "energy, his strapping muscles, and his\n" +
                            "anguish in the classic Bach cantata. If\n" +
                            "John Adams had had his way in 1776,\n" +
                            "Hercules at the crossroads would have\n" +
                            "been immortalized on the official seal of\n" +
                            "the newly founded United States.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Because there, before the man's undying fame, before the twelve labors, before he changed the would, Hercules faced a crisis, one as life-changing and real as any of us have ever faced.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Where was he headed? Where was he trying to go? That's the point of the story. Alone, unknown, unsure, Hercules, like so many, did not know.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Where the road diverged lay a beautiful goddess who offered him every temptation he could imagine. Adorned in finery, she promised him a life of ease. She swore he'd never taste want or unhappiness or fear or pain. Follow her, she said, and his every desire would be fulfilled.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "",
                    fontSize = 18.sp
                )
            }
        }
    }
}


@Composable
fun DetailPagec2(navController: NavController) {
    Column( modifier = Modifier
        .padding(5.dp)
        .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(R.drawable.back),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp, 0.dp, 170.dp, 0.dp)
                    .width(21.dp)
                    .height(21.dp)
                    .clickable { navController.navigate("ListPage") }
            )
            Image(
                painter = painterResource(R.drawable.play),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )
            Image(
                painter = painterResource(R.drawable.bookmark),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )
            Image(
                painter = painterResource(R.drawable.share),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )
            Image(
                painter = painterResource(R.drawable.menu),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )

        }
        Divider()
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Row() {
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.alex),
                            contentDescription = "ryan icon",
                            modifier = Modifier
                                .padding(0.dp)
                                .width(50.dp)
                                .height(50.dp)
                        )
                    }
                    Column() {
                        Row {
                            Text(
                                modifier = Modifier
                                    .padding(10.dp, 0.dp),
                                text = "Alex Mathers"
                            )
                            Image(
                                painter = painterResource(R.drawable.follow),
                                contentDescription = "button",
                                modifier = Modifier
                                    .padding(0.dp)
                                    .width(50.dp)
                                    .height(25.dp)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .padding(10.dp, 0.dp)
                        ) {
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
                    }
                }
            }
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Text(
                    text = "7 subtle behaviours that are highly attractive to the most people.",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 25.sp
                )
                Image(
                    painter = painterResource(R.drawable.c2),
                    contentDescription = "star icon",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(0.dp, 20.dp)
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 20.dp),
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eget eleifend orci. Nunc consectetur purus in nibh tincidunt finibus. In pretium vehicula accumsan. Phasellus non odio vel nibh sagittis vulputate ut vitae mauris. Morbi mollis erat lectus, in ullamcorper est mollis id. Sed vitae urna consequat, cursus velit id, porttitor orci. Quisque ullamcorper luctus felis, nec aliquet mi egestas sit amet. Sed justo tortor, hendrerit a tincidunt sit amet, mattis in erat.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Mauris molestie metus eget luctus mattis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer mi nulla, laoreet ac nibh nec, placerat viverra nulla. Vivamus non volutpat massa, vel rhoncus felis. Integer scelerisque finibus placerat. Aenean dapibus pellentesque sem nec pellentesque. Ut tristique mi quis consectetur lobortis. In et fermentum quam, eu convallis nunc. Nulla facilisi. Donec bibendum mauris sit amet neque rutrum molestie. Donec luctus tempor erat. Nunc suscipit quam nec nibh semper iaculis. Aenean sagittis, nisi at placerat congue, odio magna sodales risus, vel convallis arcu quam non justo. Praesent enim ipsum, volutpat sed hendrerit ut, imperdiet id elit.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Suspendisse sed consectetur tellus. Etiam tempor nec eros eu consectetur. Ut aliquam a mi a laoreet. Donec leo erat, ultrices sed consectetur id, varius nec magna. Vestibulum cursus arcu ac mi euismod, eu efficitur nunc convallis. Aliquam blandit non neque aliquam pretium. Mauris massa diam, semper id nibh a, imperdiet lacinia massa.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Pellentesque pharetra volutpat lorem, a dictum sem euismod a. Integer id urna vel metus blandit gravida vel tempus erat. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed aliquet nisl congue tristique aliquet. Praesent mollis lorem sit amet dui mattis, sed egestas enim finibus. Fusce sit amet tempus diam. Cras euismod tempus nibh, ac tempus magna lacinia at. Integer in libero dapibus, dictum magna eu, semper mi. Ut vitae pretium eros, eu finibus sapien. Nulla facilisi. Nulla blandit quam eu sollicitudin porta.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Maecenas nec purus mi. Mauris eros elit, aliquet non elit ac, posuere interdum mi. Quisque faucibus eget purus nec efficitur. Donec id augue tellus. Donec fermentum enim faucibus, convallis ex in, congue enim. Fusce congue imperdiet mi eu volutpat. Curabitur at fermentum nisi, id dapibus erat.",
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Composable
fun DetailPagec3(navController: NavController) {
    Column( modifier = Modifier
        .padding(5.dp)
        .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(R.drawable.back),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp, 0.dp, 170.dp, 0.dp)
                    .width(21.dp)
                    .height(21.dp)
                    .clickable { navController.navigate("ListPage") }
            )
            Image(
                painter = painterResource(R.drawable.play),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )
            Image(
                painter = painterResource(R.drawable.bookmark),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )
            Image(
                painter = painterResource(R.drawable.share),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )
            Image(
                painter = painterResource(R.drawable.menu),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )

        }
        Divider()
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Row() {
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.tony),
                            contentDescription = "ryan icon",
                            modifier = Modifier
                                .padding(0.dp)
                                .width(50.dp)
                                .height(50.dp)
                        )
                    }
                    Column() {
                        Row {
                            Text(
                                modifier = Modifier
                                    .padding(10.dp, 0.dp),
                                text = "Tony Fahkry"
                            )
                            Image(
                                painter = painterResource(R.drawable.follow),
                                contentDescription = "button",
                                modifier = Modifier
                                    .padding(0.dp)
                                    .width(50.dp)
                                    .height(25.dp)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .padding(10.dp, 0.dp)
                        ) {
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
                    }
                }
            }
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Text(
                    text = "How To Get Out Of Your Head And Start Enjoying Your Life.",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 25.sp
                )
                Image(
                    painter = painterResource(R.drawable.c3),
                    contentDescription = "star icon",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(0.dp, 20.dp)
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 20.dp),
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eget eleifend orci. Nunc consectetur purus in nibh tincidunt finibus. In pretium vehicula accumsan. Phasellus non odio vel nibh sagittis vulputate ut vitae mauris. Morbi mollis erat lectus, in ullamcorper est mollis id. Sed vitae urna consequat, cursus velit id, porttitor orci. Quisque ullamcorper luctus felis, nec aliquet mi egestas sit amet. Sed justo tortor, hendrerit a tincidunt sit amet, mattis in erat.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Mauris molestie metus eget luctus mattis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer mi nulla, laoreet ac nibh nec, placerat viverra nulla. Vivamus non volutpat massa, vel rhoncus felis. Integer scelerisque finibus placerat. Aenean dapibus pellentesque sem nec pellentesque. Ut tristique mi quis consectetur lobortis. In et fermentum quam, eu convallis nunc. Nulla facilisi. Donec bibendum mauris sit amet neque rutrum molestie. Donec luctus tempor erat. Nunc suscipit quam nec nibh semper iaculis. Aenean sagittis, nisi at placerat congue, odio magna sodales risus, vel convallis arcu quam non justo. Praesent enim ipsum, volutpat sed hendrerit ut, imperdiet id elit.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Suspendisse sed consectetur tellus. Etiam tempor nec eros eu consectetur. Ut aliquam a mi a laoreet. Donec leo erat, ultrices sed consectetur id, varius nec magna. Vestibulum cursus arcu ac mi euismod, eu efficitur nunc convallis. Aliquam blandit non neque aliquam pretium. Mauris massa diam, semper id nibh a, imperdiet lacinia massa.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Pellentesque pharetra volutpat lorem, a dictum sem euismod a. Integer id urna vel metus blandit gravida vel tempus erat. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed aliquet nisl congue tristique aliquet. Praesent mollis lorem sit amet dui mattis, sed egestas enim finibus. Fusce sit amet tempus diam. Cras euismod tempus nibh, ac tempus magna lacinia at. Integer in libero dapibus, dictum magna eu, semper mi. Ut vitae pretium eros, eu finibus sapien. Nulla facilisi. Nulla blandit quam eu sollicitudin porta.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Maecenas nec purus mi. Mauris eros elit, aliquet non elit ac, posuere interdum mi. Quisque faucibus eget purus nec efficitur. Donec id augue tellus. Donec fermentum enim faucibus, convallis ex in, congue enim. Fusce congue imperdiet mi eu volutpat. Curabitur at fermentum nisi, id dapibus erat.",
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Composable
fun DetailPagec4(navController: NavController) {
    Column( modifier = Modifier
        .padding(5.dp)
        .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(R.drawable.back),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp, 0.dp, 170.dp, 0.dp)
                    .width(21.dp)
                    .height(21.dp)
                    .clickable { navController.navigate("ListPage") }
            )
            Image(
                painter = painterResource(R.drawable.play),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )
            Image(
                painter = painterResource(R.drawable.bookmark),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )
            Image(
                painter = painterResource(R.drawable.share),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )
            Image(
                painter = painterResource(R.drawable.menu),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )

        }
        Divider()
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Row() {
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.above),
                            contentDescription = "ryan icon",
                            modifier = Modifier
                                .padding(0.dp)
                                .width(50.dp)
                                .height(50.dp)
                        )
                    }
                    Column() {
                        Row {
                            Text(
                                modifier = Modifier
                                    .padding(10.dp, 0.dp),
                                text = "Above The Middle in ILLUMINATION"
                            )
                            Image(
                                painter = painterResource(R.drawable.follow),
                                contentDescription = "button",
                                modifier = Modifier
                                    .padding(0.dp)
                                    .width(50.dp)
                                    .height(25.dp)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .padding(10.dp, 0.dp)
                        ) {
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
                    }
                }
            }
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Text(
                    text = "How Dopamine Is Distracting You From The Life You Want.",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 25.sp
                )
                Image(
                    painter = painterResource(R.drawable.c4),
                    contentDescription = "star icon",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(0.dp, 20.dp)
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 20.dp),
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eget eleifend orci. Nunc consectetur purus in nibh tincidunt finibus. In pretium vehicula accumsan. Phasellus non odio vel nibh sagittis vulputate ut vitae mauris. Morbi mollis erat lectus, in ullamcorper est mollis id. Sed vitae urna consequat, cursus velit id, porttitor orci. Quisque ullamcorper luctus felis, nec aliquet mi egestas sit amet. Sed justo tortor, hendrerit a tincidunt sit amet, mattis in erat.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Mauris molestie metus eget luctus mattis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer mi nulla, laoreet ac nibh nec, placerat viverra nulla. Vivamus non volutpat massa, vel rhoncus felis. Integer scelerisque finibus placerat. Aenean dapibus pellentesque sem nec pellentesque. Ut tristique mi quis consectetur lobortis. In et fermentum quam, eu convallis nunc. Nulla facilisi. Donec bibendum mauris sit amet neque rutrum molestie. Donec luctus tempor erat. Nunc suscipit quam nec nibh semper iaculis. Aenean sagittis, nisi at placerat congue, odio magna sodales risus, vel convallis arcu quam non justo. Praesent enim ipsum, volutpat sed hendrerit ut, imperdiet id elit.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Suspendisse sed consectetur tellus. Etiam tempor nec eros eu consectetur. Ut aliquam a mi a laoreet. Donec leo erat, ultrices sed consectetur id, varius nec magna. Vestibulum cursus arcu ac mi euismod, eu efficitur nunc convallis. Aliquam blandit non neque aliquam pretium. Mauris massa diam, semper id nibh a, imperdiet lacinia massa.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Pellentesque pharetra volutpat lorem, a dictum sem euismod a. Integer id urna vel metus blandit gravida vel tempus erat. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed aliquet nisl congue tristique aliquet. Praesent mollis lorem sit amet dui mattis, sed egestas enim finibus. Fusce sit amet tempus diam. Cras euismod tempus nibh, ac tempus magna lacinia at. Integer in libero dapibus, dictum magna eu, semper mi. Ut vitae pretium eros, eu finibus sapien. Nulla facilisi. Nulla blandit quam eu sollicitudin porta.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Maecenas nec purus mi. Mauris eros elit, aliquet non elit ac, posuere interdum mi. Quisque faucibus eget purus nec efficitur. Donec id augue tellus. Donec fermentum enim faucibus, convallis ex in, congue enim. Fusce congue imperdiet mi eu volutpat. Curabitur at fermentum nisi, id dapibus erat.",
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Composable
fun DetailPagec5(navController: NavController) {
    Column( modifier = Modifier
        .padding(5.dp)
        .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(R.drawable.back),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp, 0.dp, 170.dp, 0.dp)
                    .width(21.dp)
                    .height(21.dp)
                    .clickable { navController.navigate("ListPage") }
            )
            Image(
                painter = painterResource(R.drawable.play),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )
            Image(
                painter = painterResource(R.drawable.bookmark),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )
            Image(
                painter = painterResource(R.drawable.share),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )
            Image(
                painter = painterResource(R.drawable.menu),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )

        }
        Divider()
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Row() {
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.alfret),
                            contentDescription = "ryan icon",
                            modifier = Modifier
                                .padding(0.dp)
                                .width(50.dp)
                                .height(50.dp)
                        )
                    }
                    Column() {
                        Row {
                            Text(
                                modifier = Modifier
                                    .padding(10.dp, 0.dp),
                                text = "Alfred l."
                            )
                            Image(
                                painter = painterResource(R.drawable.follow),
                                contentDescription = "button",
                                modifier = Modifier
                                    .padding(0.dp)
                                    .width(50.dp)
                                    .height(25.dp)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .padding(10.dp, 0.dp)
                        ) {
                            Text(text = "Sep 27", color = Color.Gray, fontSize = 13.sp)
                            Text(text = " • ", color = Color.Gray, fontSize = 13.sp)
                            Text(text = "3 min read", color = Color.Gray, fontSize = 13.sp)
                        }
                    }
                }
            }
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Text(
                    text = "I Spent 2000 Hours Learning How To Learn: Part4",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 25.sp
                )
                Image(
                    painter = painterResource(R.drawable.c5),
                    contentDescription = "star icon",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(0.dp, 20.dp)
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 20.dp),
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eget eleifend orci. Nunc consectetur purus in nibh tincidunt finibus. In pretium vehicula accumsan. Phasellus non odio vel nibh sagittis vulputate ut vitae mauris. Morbi mollis erat lectus, in ullamcorper est mollis id. Sed vitae urna consequat, cursus velit id, porttitor orci. Quisque ullamcorper luctus felis, nec aliquet mi egestas sit amet. Sed justo tortor, hendrerit a tincidunt sit amet, mattis in erat.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Mauris molestie metus eget luctus mattis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer mi nulla, laoreet ac nibh nec, placerat viverra nulla. Vivamus non volutpat massa, vel rhoncus felis. Integer scelerisque finibus placerat. Aenean dapibus pellentesque sem nec pellentesque. Ut tristique mi quis consectetur lobortis. In et fermentum quam, eu convallis nunc. Nulla facilisi. Donec bibendum mauris sit amet neque rutrum molestie. Donec luctus tempor erat. Nunc suscipit quam nec nibh semper iaculis. Aenean sagittis, nisi at placerat congue, odio magna sodales risus, vel convallis arcu quam non justo. Praesent enim ipsum, volutpat sed hendrerit ut, imperdiet id elit.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Suspendisse sed consectetur tellus. Etiam tempor nec eros eu consectetur. Ut aliquam a mi a laoreet. Donec leo erat, ultrices sed consectetur id, varius nec magna. Vestibulum cursus arcu ac mi euismod, eu efficitur nunc convallis. Aliquam blandit non neque aliquam pretium. Mauris massa diam, semper id nibh a, imperdiet lacinia massa.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Pellentesque pharetra volutpat lorem, a dictum sem euismod a. Integer id urna vel metus blandit gravida vel tempus erat. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed aliquet nisl congue tristique aliquet. Praesent mollis lorem sit amet dui mattis, sed egestas enim finibus. Fusce sit amet tempus diam. Cras euismod tempus nibh, ac tempus magna lacinia at. Integer in libero dapibus, dictum magna eu, semper mi. Ut vitae pretium eros, eu finibus sapien. Nulla facilisi. Nulla blandit quam eu sollicitudin porta.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Maecenas nec purus mi. Mauris eros elit, aliquet non elit ac, posuere interdum mi. Quisque faucibus eget purus nec efficitur. Donec id augue tellus. Donec fermentum enim faucibus, convallis ex in, congue enim. Fusce congue imperdiet mi eu volutpat. Curabitur at fermentum nisi, id dapibus erat.",
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Composable
fun DetailPagec6(navController: NavController) {
    Column( modifier = Modifier
        .padding(5.dp)
        .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(R.drawable.back),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp, 0.dp, 170.dp, 0.dp)
                    .width(21.dp)
                    .height(21.dp)
                    .clickable { navController.navigate("ListPage") }
            )
            Image(
                painter = painterResource(R.drawable.play),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )
            Image(
                painter = painterResource(R.drawable.bookmark),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )
            Image(
                painter = painterResource(R.drawable.share),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )
            Image(
                painter = painterResource(R.drawable.menu),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )

        }
        Divider()
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Row() {
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.scott),
                            contentDescription = "ryan icon",
                            modifier = Modifier
                                .padding(0.dp)
                                .width(50.dp)
                                .height(50.dp)
                        )
                    }
                    Column() {
                        Row {
                            Text(
                                modifier = Modifier
                                    .padding(10.dp, 0.dp),
                                text = "Scott H. Young in Better Humans"
                            )
                            Image(
                                painter = painterResource(R.drawable.follow),
                                contentDescription = "button",
                                modifier = Modifier
                                    .padding(0.dp)
                                    .width(50.dp)
                                    .height(25.dp)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .padding(10.dp, 0.dp)
                        ) {
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
                    }
                }
            }
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Text(
                    text = "10 Mental Models for Learning Anything.",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 25.sp
                )
                Image(
                    painter = painterResource(R.drawable.c6),
                    contentDescription = "star icon",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(0.dp, 20.dp)
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 20.dp),
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eget eleifend orci. Nunc consectetur purus in nibh tincidunt finibus. In pretium vehicula accumsan. Phasellus non odio vel nibh sagittis vulputate ut vitae mauris. Morbi mollis erat lectus, in ullamcorper est mollis id. Sed vitae urna consequat, cursus velit id, porttitor orci. Quisque ullamcorper luctus felis, nec aliquet mi egestas sit amet. Sed justo tortor, hendrerit a tincidunt sit amet, mattis in erat.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Mauris molestie metus eget luctus mattis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer mi nulla, laoreet ac nibh nec, placerat viverra nulla. Vivamus non volutpat massa, vel rhoncus felis. Integer scelerisque finibus placerat. Aenean dapibus pellentesque sem nec pellentesque. Ut tristique mi quis consectetur lobortis. In et fermentum quam, eu convallis nunc. Nulla facilisi. Donec bibendum mauris sit amet neque rutrum molestie. Donec luctus tempor erat. Nunc suscipit quam nec nibh semper iaculis. Aenean sagittis, nisi at placerat congue, odio magna sodales risus, vel convallis arcu quam non justo. Praesent enim ipsum, volutpat sed hendrerit ut, imperdiet id elit.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Suspendisse sed consectetur tellus. Etiam tempor nec eros eu consectetur. Ut aliquam a mi a laoreet. Donec leo erat, ultrices sed consectetur id, varius nec magna. Vestibulum cursus arcu ac mi euismod, eu efficitur nunc convallis. Aliquam blandit non neque aliquam pretium. Mauris massa diam, semper id nibh a, imperdiet lacinia massa.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Pellentesque pharetra volutpat lorem, a dictum sem euismod a. Integer id urna vel metus blandit gravida vel tempus erat. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed aliquet nisl congue tristique aliquet. Praesent mollis lorem sit amet dui mattis, sed egestas enim finibus. Fusce sit amet tempus diam. Cras euismod tempus nibh, ac tempus magna lacinia at. Integer in libero dapibus, dictum magna eu, semper mi. Ut vitae pretium eros, eu finibus sapien. Nulla facilisi. Nulla blandit quam eu sollicitudin porta.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Maecenas nec purus mi. Mauris eros elit, aliquet non elit ac, posuere interdum mi. Quisque faucibus eget purus nec efficitur. Donec id augue tellus. Donec fermentum enim faucibus, convallis ex in, congue enim. Fusce congue imperdiet mi eu volutpat. Curabitur at fermentum nisi, id dapibus erat.",
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Composable
fun DetailPagec7(navController: NavController) {
    Column( modifier = Modifier
        .padding(5.dp)
        .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(R.drawable.back),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp, 0.dp, 170.dp, 0.dp)
                    .width(21.dp)
                    .height(21.dp)
                    .clickable { navController.navigate("ListPage") }
            )
            Image(
                painter = painterResource(R.drawable.play),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )
            Image(
                painter = painterResource(R.drawable.bookmark),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )
            Image(
                painter = painterResource(R.drawable.share),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )
            Image(
                painter = painterResource(R.drawable.menu),
                contentDescription = "ryan icon",
                modifier = Modifier
                    .padding(0.dp)
                    .width(21.dp)
                    .height(21.dp)
            )

        }
        Divider()
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Row() {
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.cw),
                            contentDescription = "ryan icon",
                            modifier = Modifier
                                .padding(0.dp)
                                .width(50.dp)
                                .height(50.dp)
                        )
                    }
                    Column() {
                        Row {
                            Text(
                                modifier = Modifier
                                    .padding(10.dp, 0.dp),
                                text = "CW in Kopi Date"
                            )
                            Image(
                                painter = painterResource(R.drawable.follow),
                                contentDescription = "button",
                                modifier = Modifier
                                    .padding(0.dp)
                                    .width(50.dp)
                                    .height(25.dp)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .padding(10.dp, 0.dp)
                        ) {
                            Text(text = "Sep 28", color = Color.Gray, fontSize = 13.sp)
                            Text(text = " • ", color = Color.Gray, fontSize = 13.sp)
                            Text(text = "5 min read", color = Color.Gray, fontSize = 13.sp)
                        }
                    }
                }
            }
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Text(
                    text = "The Psychology of Attraction",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 25.sp
                )
                Image(
                    painter = painterResource(R.drawable.c7),
                    contentDescription = "star icon",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(0.dp, 20.dp)
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 20.dp),
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eget eleifend orci. Nunc consectetur purus in nibh tincidunt finibus. In pretium vehicula accumsan. Phasellus non odio vel nibh sagittis vulputate ut vitae mauris. Morbi mollis erat lectus, in ullamcorper est mollis id. Sed vitae urna consequat, cursus velit id, porttitor orci. Quisque ullamcorper luctus felis, nec aliquet mi egestas sit amet. Sed justo tortor, hendrerit a tincidunt sit amet, mattis in erat.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Mauris molestie metus eget luctus mattis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer mi nulla, laoreet ac nibh nec, placerat viverra nulla. Vivamus non volutpat massa, vel rhoncus felis. Integer scelerisque finibus placerat. Aenean dapibus pellentesque sem nec pellentesque. Ut tristique mi quis consectetur lobortis. In et fermentum quam, eu convallis nunc. Nulla facilisi. Donec bibendum mauris sit amet neque rutrum molestie. Donec luctus tempor erat. Nunc suscipit quam nec nibh semper iaculis. Aenean sagittis, nisi at placerat congue, odio magna sodales risus, vel convallis arcu quam non justo. Praesent enim ipsum, volutpat sed hendrerit ut, imperdiet id elit.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Suspendisse sed consectetur tellus. Etiam tempor nec eros eu consectetur. Ut aliquam a mi a laoreet. Donec leo erat, ultrices sed consectetur id, varius nec magna. Vestibulum cursus arcu ac mi euismod, eu efficitur nunc convallis. Aliquam blandit non neque aliquam pretium. Mauris massa diam, semper id nibh a, imperdiet lacinia massa.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Pellentesque pharetra volutpat lorem, a dictum sem euismod a. Integer id urna vel metus blandit gravida vel tempus erat. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed aliquet nisl congue tristique aliquet. Praesent mollis lorem sit amet dui mattis, sed egestas enim finibus. Fusce sit amet tempus diam. Cras euismod tempus nibh, ac tempus magna lacinia at. Integer in libero dapibus, dictum magna eu, semper mi. Ut vitae pretium eros, eu finibus sapien. Nulla facilisi. Nulla blandit quam eu sollicitudin porta.",
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp),
                    text = "Maecenas nec purus mi. Mauris eros elit, aliquet non elit ac, posuere interdum mi. Quisque faucibus eget purus nec efficitur. Donec id augue tellus. Donec fermentum enim faucibus, convallis ex in, congue enim. Fusce congue imperdiet mi eu volutpat. Curabitur at fermentum nisi, id dapibus erat.",
                    fontSize = 18.sp
                )
            }
        }
    }
}