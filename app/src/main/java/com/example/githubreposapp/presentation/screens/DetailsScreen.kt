package com.example.githubreposapp.presentation.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.githubreposapp.R


@Suppress("ResourceAsColor")
@Composable
fun DetailsScreen() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(color = Color.White)

        , horizontalAlignment = Alignment.CenterHorizontally


    ) {

        Image(painter = painterResource(id = R.drawable.download), contentDescription ="Google Picture", modifier = Modifier
            .padding(all = Dp(30f))
            .size(Dp(150F))
            .clip(CircleShape) )
        Text("Language", style = TextStyle(fontWeight = FontWeight.Bold, color = Color.White, fontSize = 26.sp ))
        Row (
            Modifier
                .padding(20.dp)
                .fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
            Text("1926",
                Modifier
                    .scale(1.5F)
                    .padding(end = 20.dp))
            Image(painter = painterResource(id = R.drawable.star), contentDescription = "Star",
                Modifier
                    .width(50.dp)
                    .height(60.dp))
            Text("Python",
                Modifier
                    .scale(1.5F)
                    .padding(start = 20.dp))
            Image(painter = painterResource(id = R.drawable.bluecircle), contentDescription ="Google Picture", modifier = Modifier
                .padding(start = 30.dp)
                .size(Dp(20F))
                .clip(CircleShape) )
            Text("137",
                Modifier
                    .scale(1.5F)
                    .padding(start = 20.dp))
            Image(painter = painterResource(id = R.drawable.github_fork), contentDescription ="Google Picture", modifier = Modifier
                .padding(start = 20.dp)
                .width(50.dp)
                .height(60.dp) )

        }
        Text(text = "Shared repository for open-sourced projects from the Google AI Language team.",
            Modifier
                .scale(1.5F)
                .padding(start = 80.dp, end = 80.dp)
                .fillMaxWidth())

           Button(onClick = { /*TODO*/ },Modifier.padding(vertical = 200.dp).width(300.dp).scale(1.25F)) {
               Text(text = "Show issues")
           }

    }
}


@Preview
@Composable
fun DetailsScreenView()
{
    DetailsScreen()
}