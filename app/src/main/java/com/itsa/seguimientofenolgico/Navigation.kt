package com.itsa.seguimientofenolgico

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.itsa.seguimientofenolgico.home.Home
import com.itsa.seguimientofenolgico.home.Register
import com.itsa.seguimientofenolgico.login.LoginScreen
import com.itsa.seguimientofenolgico.login.LoginViewModel
import com.itsa.seguimientofenolgico.login.SignUpScreen
import com.itsa.seguimientofenolgico.login.SplashScreen
import com.itsa.seguimientofenolgico.Destinations.*

enum class LoginRoutes {
    Signup,
    SignIn
}

enum class HomeRoutes {
    Home
}

@Composable
fun Navigation(
    navController: NavHostController = rememberNavController(),
    loginViewModel: LoginViewModel,
) {
    NavHost(
        navController = navController,
        startDestination = "splash_screen"
        //startDestination = LoginRoutes.SignIn.name
    ) {
        
        composable("splash_screen"){
            SplashScreen(navController = navController)
        }
        
        composable(route = LoginRoutes.SignIn.name) {
            LoginScreen(onNavToHomePage = {
                navController.navigate(HomeRoutes.Home.name) {
                    launchSingleTop = true
                    popUpTo(route = LoginRoutes.SignIn.name) {
                        inclusive = true
                    }
                }
            },
                loginViewModel = loginViewModel

            ) {
                navController.navigate(LoginRoutes.Signup.name) {
                    launchSingleTop = true
                    popUpTo(LoginRoutes.SignIn.name) {
                        inclusive = true
                    }
                }
            }
        }

        composable(route = LoginRoutes.Signup.name) {
            SignUpScreen(onNavToHomePage = {
                navController.navigate(HomeRoutes.Home.name) {
                    popUpTo(LoginRoutes.Signup.name) {
                        inclusive = true
                    }
                }
            },
                loginViewModel = loginViewModel
            ) {
                navController.navigate(LoginRoutes.SignIn.name)
            }

        }

        composable(route = HomeRoutes.Home.name) {
            Home(
                navegarRegistrar = {
                    navController.navigate(Register.routes)
                }
            )
        }

        composable(Register.routes){
            Register()
        }

    }
}

