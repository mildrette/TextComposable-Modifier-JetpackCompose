package com.example.textmodifiers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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

//    Row alignment and arrangement
//    Row(verticalAlignment = Alignment.Bottom,
//        horizontalArrangement = Arrangement.Absolute.Right,
//        modifier = Modifier.fillMaxSize().background(Color.White)){
//       Text("Alignment ")
//        Text("Arrangement ")
//    }



//     Column arrangement and alignment
//    Column(modifier = Modifier.fillMaxSize().background(Color.White),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.SpaceEvenly){
//        Text("Alignment")
//        Text("Arrangement ")
//    }


//    Box Alignment: TopStart, TopCenter, TopEnd, BottomCenter, BottomEnd, BottomStart, Center, CenterStart, CenterEnd

    Box(modifier = Modifier.fillMaxSize().background(Color.Gray), contentAlignment = Alignment.CenterEnd

    ){
        Text("Box Alignment", modifier = Modifier.align(Alignment.Center))
    }
}

@Preview
@Composable
fun HomePreview(){
    Home()
}