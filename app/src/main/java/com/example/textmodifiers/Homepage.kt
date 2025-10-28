package com.example.textmodifiers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Homepage(){

//    COLUMN LAYOUT
//    Column(modifier = Modifier
//        .fillMaxSize()
//        .background(Color.White),
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.CenterHorizontally){
//        Text("Hello")
//        Text("hello hi!")
//        Text("bye bye")
//        Text("Hello welcome")
//    }


//    ROW LAYOUT
//Row(modifier = Modifier.fillMaxSize().background(Color.White),
//    verticalAlignment = Alignment.CenterVertically,
//    horizontalArrangement = Arrangement.SpaceEvenly){
//    Text("Hello")
//    Text("hello hi!")
//}


    //    BOX LAYOUT

    Box(modifier = Modifier.fillMaxSize().background(Color.LightGray), contentAlignment = Alignment.Center){
        Box(modifier = Modifier.height(300.dp).width(300.dp).background(Color.Gray)){
            Text(
                text = "It's a box layout",
                modifier = Modifier.align(Alignment.Center),
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
fun homepagePreview(){
    Homepage()
}