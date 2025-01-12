package dev.josegaldamez.tareanavegacion.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun RightScreen(navController: NavHostController) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue)){

        Text(text = "Volver", modifier = Modifier.clickable {
            // TODO
            navController.popBackStack()
        } )

    }
    
}