package com.example.composetestapp.ui.editrecipe

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetestapp.R
import com.example.composetestapp.ui.widgets.TextBody


@Composable
fun HowToCookStep(description: String, itemNumber: Int) {
    Row {

        Box(
            modifier = Modifier
                .width(24.dp)
                .height(24.dp)
                .border(
                    width = 1.dp, color = colorResource(
                        id = R.color.jungle_green,
                    ), shape = RoundedCornerShape(50)
                )
        ) {
            Text(
                fontSize = 11.sp,
                modifier = Modifier.align(Alignment.Center),
                text = itemNumber.toString(),
                color = colorResource(
                    id = R.color.jungle_green
                )
            )
        }

        Spacer(Modifier.padding(16.dp))

        TextBody(
            text = description,
            modifier = Modifier.padding()
        )
    }
}