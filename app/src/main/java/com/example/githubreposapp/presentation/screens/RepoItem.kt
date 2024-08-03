package com.example.githubreposapp.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.githubreposapp.R

@Composable
fun RepoItem() {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.DarkGray)
        
        
    ){
        Image(painter = painterResource(id = R.drawable.ic_launcher_background ), contentDescription ="description" )
    }
}