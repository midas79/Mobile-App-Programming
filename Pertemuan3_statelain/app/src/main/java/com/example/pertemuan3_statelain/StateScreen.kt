package com.example.pertemuan3_statelain

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.HistoricalChange
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun StateScreen() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {

        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.7f)
                .align(Alignment.BottomCenter),
            color = Color(0XFF7218A5),
            shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp, vertical = 30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Spacer(modifier = Modifier.height(100.dp))

                Text(
                    text = "Log In",
                    fontSize = 22.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(24.dp))

                val textFieldHeight = 76.dp

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                ) {
                    // Email TextField
                    TextField(
                        value = email,
                        onValueChange = { email = it },
                        label = { Text("Email") },
                        placeholder = { Text("Masukkan email") },
                        colors = TextFieldDefaults.colors(
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(textFieldHeight)
                            .padding(vertical = 8.dp),
                        shape = RoundedCornerShape(8.dp)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Password TextField
                    TextField(
                        value = password,
                        onValueChange = { password = it },
                        label = { Text("Password") },
                        placeholder = { Text("Masukkan password") },
                        visualTransformation = PasswordVisualTransformation(),
                        colors = TextFieldDefaults.colors(
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(textFieldHeight)
                            .padding(vertical = 8.dp),
                        shape = RoundedCornerShape(8.dp)
                    )

                    Spacer(modifier = Modifier.height(32.dp))

                    // Login Button
                    Button(
                        modifier = Modifier
                            .fillMaxWidth(),
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RoundedCornerShape(50.dp)
                    ) {
                        Text(
                            modifier = Modifier.padding(8.dp),
                            text = "LOGIN",
                            fontSize = 18.sp,
                            color = Color(0XFF7218A5)
                        )
                    }

                    Spacer(modifier = Modifier.height(32.dp))
                }

                Text(
                    textAlign = TextAlign.Center,
                    text = "Forgot Password?",
                    fontSize = 18.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    textAlign = TextAlign.Center,
                    text = "or login with",
                    fontSize = 18.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Normal
                )

                Spacer(modifier = Modifier.height(24.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(9.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    // Google Button
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(48.dp)
                            .padding(horizontal = 8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.google_logo),
                            contentDescription = "Google"
                        )
                    }

                    // Facebook Button
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(48.dp)
                            .padding(horizontal = 8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.facebook_logo),
                            contentDescription = "Facebook"
                        )
                    }

                    // X Button
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(48.dp)
                            .padding(horizontal = 8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.twitter_logo),
                            contentDescription = "X"
                        )
                    }
                }
            }
        }

        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
                .align(Alignment.TopCenter),
            shape = RoundedCornerShape(bottomStart = 70.dp, bottomEnd = 70.dp),
            color = Color(0xFFFFFFFF)
        ) {
            Box(
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(10.dp)
                ) {
                    Image(
                        modifier = Modifier.size(150.dp),
                        painter = painterResource(id = R.drawable.onenote),
                        contentDescription = "picture"
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        modifier = Modifier.padding(horizontal = 50.dp),
                        text = "Microsoft OneNote",
                        fontSize = 20.sp,
                        color = Color(0XFF7218A5),
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        modifier = Modifier.padding(horizontal = 50.dp),
                        text = "Log in to your account to access the app",
                        fontSize = 15.sp,
                        color = Color(0XFF7218A5),
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}
