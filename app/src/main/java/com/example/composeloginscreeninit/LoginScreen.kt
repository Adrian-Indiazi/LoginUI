package com.example.composeloginscreeninit

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeloginscreeninit.ui.theme.Black
import com.example.composeloginscreeninit.ui.theme.BlueGray


@Preview
@Composable
fun App(){
    LoginScreen()
}
@Composable
fun LoginScreen() {
    Surface () {
    Column (modifier = Modifier.fillMaxSize()) {
        TopSection()
        Spacer(modifier = Modifier.height(36.dp))
        BottomSection()


    }
    }
}

@Composable
private fun TopSection() {
    val uiColor = if (isSystemInDarkTheme()) Color.White else Color.Black

    Box(contentAlignment = Alignment.TopCenter) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = .46f),
            painter = painterResource(id = R.drawable.shape),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
        Row(
            modifier = Modifier.padding(top = 80.dp),
            verticalAlignment = CenterVertically
        ) {
            Icon(
                modifier = Modifier.size(42.dp),
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                tint = uiColor
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(
                    text = stringResource(id = R.string.to_let),
                    style = MaterialTheme.typography.headlineMedium,
                    color = uiColor
                )
                Text(
                    text = stringResource(id = R.string.get_house),
                    style = MaterialTheme.typography.titleMedium,
                    color = uiColor
                )
            }
        }

    }
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = stringResource(id = R.string.login),
            modifier = Modifier
                .padding(bottom = 10.dp),
            style = MaterialTheme.typography.headlineLarge,
            color = uiColor
        )
    }
}

@Composable
fun BottomSection() {
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 30.dp)) {
        LoginTextField(label = "Email", trailing = "", modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.height(15.dp))
        LoginTextField(label = "Password", trailing = "", modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(15.dp))
        Button(modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            ,onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = if(isSystemInDarkTheme()) BlueGray else Black,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(4.dp)
            ) {
            Text(text = stringResource(id = R.string.login),
                style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Medium))
        }
    }

    
}