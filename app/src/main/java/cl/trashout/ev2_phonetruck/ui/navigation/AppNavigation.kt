package cl.trashout.ev2_phonetruck.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cl.trashout.ev2_phonetruck.ui.screens.LoginScreen

@Composable
fun AppNavigation (){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppScreens.LoginScreen.route
    ){
        composable(route= AppScreens.LoginScreen.route){
            LoginScreen(navController= navController)
        }
    }

}