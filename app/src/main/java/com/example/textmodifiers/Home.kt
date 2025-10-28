package com.example.textmodifiers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Home(){

    Row(verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Absolute.Right,
        modifier = Modifier.fillMaxSize().background(Color.White)){
       Text("Alignment ")
        Text("Arrangement ")
    }
}

@Preview
@Composable
fun HomePreview(){
    Home()
}