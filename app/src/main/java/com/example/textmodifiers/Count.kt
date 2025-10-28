package com.example.textmodifiers

import android.widget.Toast
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.textmodifiers.ui.theme.DarkBlue


@Composable
fun Count(){
    LearnTopAppBar()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LearnTopAppBar() {
    val context = LocalContext.current
    TopAppBar(
        title = {
            Text("RelaySMS")
        },
        navigationIcon = {
            IconButton(
                onClick = { Toast.makeText(context, "RelaySMS", Toast.LENGTH_SHORT).show() }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "RelaySMS icon",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(24.dp)

                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = DarkBlue,
                    titleContentColor = Color.White,
            navigationIconContentColor = Color.White
            ),
        actions = {
            IconButton(
                onClick = { Toast.makeText(context, "Profile", Toast.LENGTH_SHORT).show() }
            ){
                Icon(imageVector = Icons.Filled.Person , contentDescription = "profile", tint =Color.White)
            }
            IconButton(
                onClick = { Toast.makeText(context, "notification", Toast.LENGTH_SHORT).show() }
            ){
                Icon(imageVector = Icons.Filled.Notifications , contentDescription = "notification", tint =Color.White)
            }
            IconButton(
                onClick = { Toast.makeText(context, "shoppingcart", Toast.LENGTH_SHORT).show() }
            ){
                Icon(imageVector = Icons.Filled.ShoppingCart , contentDescription = "Chart", tint =Color.White)
            }
        }
    )
}


@Preview
@Composable
fun CountPreview(){
    Count()
}