package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            login()
        }
    }
}

@Composable
fun login() {
    val usernameValue = remember { mutableStateOf(TextFieldValue()) }
    val passwordValue = remember { mutableStateOf(TextFieldValue()) }
    Column {
        OutlinedTextField(
            value = usernameValue.value,
            onValueChange = {
                usernameValue.value = it
            },
            placeholder = { Text(text = "Username") },
            modifier = Modifier
                .padding(all = 16.dp)
                .fillMaxWidth(),
        )
        OutlinedTextField(
            value = passwordValue.value,
            onValueChange = { passwordValue.value = it },
            placeholder = { Text(text = "Password") },
            modifier = Modifier
                .padding(all = 16.dp)
                .fillMaxWidth(),
        )
        Button(
            onClick = {
            }, Modifier
                .padding(all = 16.dp)
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text("Login")
        }
    }
}
