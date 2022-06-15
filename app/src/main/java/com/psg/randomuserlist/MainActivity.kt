package com.psg.randomuserlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.psg.randomuserlist.ui.theme.RandomUserListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RandomUserListTheme {
                ContentView()
            }
        }
    }
}

@Composable
fun ContentView(){
    // A surface container using the 'background' color from the theme
    Surface(
        color = MaterialTheme.colors.background
    ) {
        Scaffold(backgroundColor = Color.White,
        topBar = { MyAppBar() }
        ) {
            Text(text = "안녕하세요")
        }
    }
}

@Composable
fun MyAppBar(){
    TopAppBar() {
        Text(
            text = stringResource(id = R.string.app_name),
            modifier = Modifier.padding(8.dp)
                .align(Alignment.CenterVertically),
            fontSize = 18.sp,
            fontWeight = FontWeight.Black
            )

    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RandomUserListTheme {
        ContentView()
    }
}