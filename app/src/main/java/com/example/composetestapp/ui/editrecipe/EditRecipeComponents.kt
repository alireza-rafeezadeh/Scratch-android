package com.example.composetestapp.ui.editrecipe

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomSheetScaffoldState
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetestapp.R
import com.example.composetestapp.ui.widgets.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@Composable
fun EditRecipeCardHeader(title: String) {


    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        H5Text(
            text = title, modifier = Modifier.align(Alignment.CenterVertically)
        )


        Image(
            modifier = Modifier.align(Alignment.CenterVertically),
            painter = painterResource(id = R.drawable.ic_edit),
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
    }
}


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
