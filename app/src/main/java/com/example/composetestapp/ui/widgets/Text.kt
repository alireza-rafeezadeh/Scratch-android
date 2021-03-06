package com.example.composetestapp.ui.widgets

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composetestapp.R
import com.example.composetestapp.nunitoFamily
import com.example.composetestapp.ui.theme.ComposeTestAppTheme

/**
 * Created by alirezarafeezadeh on 3/12/21.
 */

@Composable
fun TextCardTitle(text: String, modifier: Modifier) {
    Text(
        text = text,
        fontFamily = nunitoFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        modifier = modifier,
        color = colorResource(id = R.color.midnight_moss)
    )

}


@Composable
fun TextLead(text: String, modifier: Modifier) {
    Text(
        text = text,
        fontFamily = nunitoFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        modifier = modifier,
        color = colorResource(id = R.color.midnight_moss)
    )

}


@Composable
fun TextBody(text: String, modifier: Modifier) {
    Text(
        text = text,
        fontFamily = nunitoFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        modifier = modifier,
        color = colorResource(id = R.color.midnight_moss)
    )

}

@Composable
fun TextGray(text: String, modifier: Modifier) {
    Text(
        text = text,
        fontFamily = nunitoFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        modifier = modifier,
        color = colorResource(id = R.color.scorpion)
    )

}

@Composable
fun TextSublte(text: String, modifier: Modifier) {
    Text(
        text = text,
        fontFamily = nunitoFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        modifier = modifier,
        color = colorResource(id = R.color.silver_chalice)
    )

}


@Composable
fun TextCaption(text: String, modifier: Modifier) {
    Text(
        text = text,
        fontFamily = nunitoFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        modifier = modifier,
        color = colorResource(id = R.color.boulder)
    )

}

@Composable
fun ButtonText(text: String, modifier: Modifier) {
    Text(
        text = text,
        fontFamily = nunitoFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        modifier = modifier,
        color = colorResource(id = R.color.jungle_green)
    )
}


@Composable
fun H3Text(text: String, modifier: Modifier, color : Color = colorResource(id = R.color.midnight_moss)) {
    Text(
        text = text,
        fontFamily = nunitoFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        modifier = modifier,
        color = color
    )
}

@Composable
fun H5Text(text: String, modifier: Modifier) {
    Text(
        text = text,
        fontFamily = nunitoFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        modifier = modifier,
        color = colorResource(id = R.color.midnight_moss)
    )
}

@Composable
fun CardTitle(text: String, modifier: Modifier) {
    Text(
        text = text,
        fontFamily = nunitoFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        modifier = modifier,
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestAppTheme {

    }
}
