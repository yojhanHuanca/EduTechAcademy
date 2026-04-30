package com.tecsup.edutechacademy.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.NavType
import com.tecsup.edutechacademy.screens.*
import com.tecsup.edutechacademy.screens.PerfilScreen
import com.tecsup.edutechacademy.screens.HomeScreen
import com.tecsup.edutechacademy.screens.CursosScreen
import com.tecsup.edutechacademy.screens.DetalleCursoScreen
import com.tecsup.edutechacademy.screens.PerfilScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ){
        composable(Screen.Login.route ){
            LoginScreen(navController)
        }

        composable(Screen.Home.route) {
            HomeScreen(navController)
        }

        composable(Screen.Cursos.route) {
            CursosScreen(navController)
        }

        composable(Screen.Perfil.route) {
            PerfilScreen(navController)
        }

        composable(
            route = Screen.DetalleCurso.route,
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) { backStackEntry ->
            val cursoId = backStackEntry.arguments?.getInt("id")
            DetalleCursoScreen(navController, cursoId)
        }
    }
}

