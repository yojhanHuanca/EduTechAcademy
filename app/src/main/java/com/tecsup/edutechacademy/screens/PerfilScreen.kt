package com.tecsup.edutechacademy.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.tecsup.edutechacademy.navigation.Screen

@Composable
fun PerfilScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Perfil del Usuario")

        Button(onClick = { navController.navigate(Screen.Login.route) }) {
            Text(text = "Ver Cursos")
        }
    }

}
