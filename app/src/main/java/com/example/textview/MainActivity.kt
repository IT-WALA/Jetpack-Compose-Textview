package com.example.textview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontSynthesis
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.intl.LocaleList
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Device
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.textview.ui.theme.TextviewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextviewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    showTextview()
                }
            }
        }
    }
}

@Composable
fun showTextview() {

    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        var modifier = Modifier.padding(16.dp)

        Text(
            modifier = modifier,
            text = "1. Color, fontsize, font style italic, font weight thin, Text centered using the modifier & text align properties.",
            color = Color.LightGray,
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
        )

        Text(
            modifier = modifier.fillMaxWidth(),
            text = "Textview 1",
            color = Color.Green,
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Thin,
            textAlign = TextAlign.Center
        )

        Divider(
            thickness = 1.dp
        )

        Text(
            modifier = modifier,
            text = "2. Font style normal, font weight bold",
            color = Color.LightGray,
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Text(
            modifier = modifier,
            text = "Textview 2",
            color = Color.Red,
            fontSize = 20.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold
        )

        Divider(
            thickness = 1.dp
        )

        Text(
            modifier = modifier,
            text = "3. Font weight W500, letter spacing, text decoration underline",
            color = Color.LightGray,
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Text(
            modifier = modifier,
            text = "Textview 3",
            color = Color.Blue,
            fontSize = 20.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.W500,
            letterSpacing = 10.sp,
            textDecoration = TextDecoration.Underline
        )

        Divider(
            thickness = 1.dp
        )

        Text(
            modifier = modifier,
            text = "4. text decoration line through strike",
            color = Color.LightGray,
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Text(
            modifier = modifier,
            text = "Textview 4",
            color = Color.Cyan,
            fontSize = 20.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.W500,
            textDecoration = TextDecoration.LineThrough
        )

        Divider(
            thickness = 1.dp
        )

        Text(
            modifier = modifier,
            text = "5. text decoration combination of underline & line through strike",
            color = Color.LightGray,
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Text(
            modifier = modifier,
            text = "Textview 5",
            color = Color.Magenta,
            fontSize = 20.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.W500,
            textDecoration = TextDecoration.combine(
                listOf(
                    TextDecoration.LineThrough,
                    TextDecoration.Underline
                )
            )
        )

        Divider(
            thickness = 1.dp
        )

        Text(
            modifier = modifier,
            text = "6. Max line size as 1, text overflow Ellipse",
            color = Color.LightGray,
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Text(
            modifier = modifier,
            text = "Textview 123456789, 123456789, 123456789, 123456789, 123456789, 123456789, 123456789",
            color = Color.Green,
            fontSize = 20.sp,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )


        Divider(
            thickness = 1.dp
        )

        Text(
            modifier = modifier,
            text = "7. Max line size as 1, text overflow Clip",
            color = Color.LightGray,
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Text(
            modifier = modifier,
            text = "Textview 123456789, 123456789, 123456789, 123456789, 123456789, 123456789, 123456789",
            color = Color.Red,
            fontSize = 20.sp,
            overflow = TextOverflow.Clip,
            maxLines = 1
        )


        Divider(
            thickness = 1.dp
        )

        Text(
            modifier = modifier,
            text = "8. Max line size as 1, softwrap as true",
            color = Color.LightGray,
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Text(
            modifier = modifier,
            text = "Textview 123456789, 123456789, 123456789, 123456789, 123456789, 123456789, 123456789",
            color = Color.Blue,
            fontSize = 20.sp,
            softWrap = true,
            maxLines = 1
        )


        Divider(
            thickness = 1.dp
        )

        Text(
            modifier = modifier,
            text = "9. Color set via style attribute",
            color = Color.LightGray,
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Text(
            modifier = modifier,
            text = "Textview 6",
            fontSize = 20.sp,
            style = TextStyle(color = Color.Cyan)
        )


        Divider(
            thickness = 1.dp
        )

        Text(
            modifier = modifier,
            text = "10. Font as cursive",
            color = Color.LightGray,
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
        )

        Text(
            modifier = modifier,
            text = "Textview 7",
            fontSize = 20.sp,
            style = TextStyle(color = Color.Cyan),
            fontFamily = FontFamily.Cursive
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, device = Devices.PIXEL_4_XL)
@Composable
fun DefaultPreview() {
    TextviewTheme {
        showTextview()
    }
}