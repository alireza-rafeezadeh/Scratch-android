package com.example.composetestapp.ui.editrecipe

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composetestapp.R
import com.example.composetestapp.ui.widgets.*


@ExperimentalMaterialApi
@Composable
fun EditRecipesFooter() {

    Column(
        modifier = Modifier
            .padding(start = 24.dp, end = 24.dp)
            .fillMaxWidth()
    ) {

        TextGray(text = "Save To", modifier = Modifier.padding())

        Spacer(modifier = Modifier.padding(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Spacer(modifier = Modifier.padding(start = 16.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .weight(5f)
                    .align(Alignment.CenterVertically)
            ) {
                TextLead(
                    text = "Western (5)",
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                )

                Image(
                    modifier = Modifier
                        .padding(0.dp)
                        .align(Alignment.CenterVertically),
                    painter = painterResource(id = R.drawable.ic_arrow_down_gray),
                    contentDescription = null
                )
            }

            Spacer(modifier = Modifier.padding(start = 32.dp))

            OutlinedButton(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(4f)
                    .height(50.dp),
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(8.dp),
                border = BorderStroke(
                    width = 2.dp, color = colorResource(
                        id = R.color.jungle_green
                    )
                )
            ) {
                ButtonText(
                    text = "Save Recipe", modifier = Modifier.padding(0.dp),
                )
            }
        }

        Spacer(modifier = Modifier.padding(24.dp))

        ActionButton(text = "Post To Feed", modifier = Modifier.padding())
        Spacer(modifier = Modifier.padding(16.dp))


        Row(Modifier.align(Alignment.CenterHorizontally)) {

            Image(
                modifier = Modifier.align(Alignment.CenterVertically),
                painter = painterResource(id = R.drawable.ic_trash),
                contentDescription = null
            )

            Spacer(modifier = Modifier.padding(8.dp))

            TextBody(
                modifier = Modifier.align(Alignment.CenterVertically),
                text = "Remove from Cookbook",
            )
        }

        Spacer(modifier = Modifier.padding(40.dp))

    }
}