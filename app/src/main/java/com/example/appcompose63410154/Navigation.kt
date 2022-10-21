package com.example.appcompose63410154

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Nav(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "ListPage"){
        composable(route = "ListPage"){
            ListPage(navController = navController)
        }
        composable(route = "DetailPagec1"){
            DetailPagec1(navController = navController)
        }
        composable(route = "DetailPagec2"){
            DetailPagec2(navController = navController)
        }
        composable(route = "DetailPagec3"){
            DetailPagec3(navController = navController)
        }
        composable(route = "DetailPagec4"){
            DetailPagec4(navController = navController)
        }
        composable(route = "DetailPagec5"){
            DetailPagec5(navController = navController)
        }
        composable(route = "DetailPagec6"){
            DetailPagec6(navController = navController)
        }
        composable(route = "DetailPagec7"){
            DetailPagec7(navController = navController)
        }
    }
}