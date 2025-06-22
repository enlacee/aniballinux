package com.anibalcopitan.aniballinux

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.anibalcopitan.aniballinux.ui.theme.AnibalLinuxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnibalLinuxTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = stringResource(id = R.string.app_name), fontWeight = FontWeight.Bold, fontSize = 28.sp)
        Spacer(modifier = Modifier.height(14.dp))
        Text(
            text = "\uD83D\uDC68\u200D\uD83D\uDCBB Hola, soy Anibal Copitan\n" +
                    "Soy desarrollador fullstack y amante del software libre.\n" +
                    "Estas son algunas herramientas que he creado:" +
                    "\n",
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = "- OkeyPay: Verifica pagos de Yape fácilmente.\n" +
                    "- ReservaTotal: Reserva en minutos.\n" +
                    "\n" +
                    "\uD83D\uDCF1 Contáctame: hola@anibalcopitan.com  \n" +
                    "\uD83D\uDD17 TikTok: @aniballinux",
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.primary
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AnibalLinuxTheme {
        Greeting("Android")
    }
}