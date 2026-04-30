package com.tecsup.edutechacademy.navigation

sealed class Screen(val route: String) {

    object Login : Screen(route = "Login")

    object Home : Screen(route = "home")

    object Cursos : Screen(route = "cursos")

    object Perfil : Screen(route = "perfil")

    object  DetalleCurso : Screen("detalle/{id}"){
        fun createRoute(id: Int): String{
            return "detalle/$id"
        }
    }
}