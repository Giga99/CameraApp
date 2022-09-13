package com.medium.cameraapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MainScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { navController.navigate(Route.IMAGE) }) {
            Text(text = "Try out Image Capture")
        }
        Button(
            modifier = Modifier.padding(top = 20.dp),
            onClick = { navController.navigate(Route.VIDEO) }
        ) {
            Text(text = "Try out Video Capture")
        }
    }
}
