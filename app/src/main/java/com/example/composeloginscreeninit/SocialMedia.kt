package com.example.composeloginscreeninit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeloginscreeninit.ui.theme.BlueGray
import com.example.composeloginscreeninit.ui.theme.LightBlueWhite

@Composable
fun SocialMedia(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    text: String,
    onClick: () -> Unit,
    ) {
        Row (modifier = modifier
            .clip(RoundedCornerShape(4.dp))
            .socialMedia()
            .clickable { onClick() }
            .height(40.dp),
            verticalAlignment = androidx.compose.ui.Alignment.CenterVertically,
            horizontalArrangement = Center

        ){
            Image(painter = painterResource(id = icon), contentDescription = null,
                modifier = Modifier.size(16.dp),
                )
            Spacer(modifier = Modifier.size(8.dp))
            Text(text = text,
                style = MaterialTheme.typography.labelMedium.copy(color = Color(0xff647488))
            )
        }
}



fun Modifier.socialMedia() : Modifier = composed {
    if (isSystemInDarkTheme()) {
        background(Color.Transparent).border(1.dp, BlueGray, RoundedCornerShape(4.dp))
    } else {
        background(LightBlueWhite)
    }
}