package com.example.composetestapp.ui.recipe.edit

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composetestapp.R
import com.example.composetestapp.ui.widgets.TextBody


@Composable
fun IngredientsItem() {

    Card(
        elevation = 24.dp,
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 24.dp, end = 24.dp)
    ) {


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp)
        ) {

            Spacer(Modifier.padding(8.dp))

            EditRecipeCardHeader(
                title = "Ingredients",
            )

            Spacer(modifier = Modifier.padding(20.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    modifier = Modifier.weight(1f),
                    painter = painterResource(id = R.drawable.ingredient_1),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.padding(4.dp))

                Image(
                    modifier = Modifier.weight(1f),
                    painter = painterResource(id = R.drawable.ingredient_2),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.padding(4.dp))

                Image(
                    modifier = Modifier.weight(1f),
                    painter = painterResource(id = R.drawable.ingredient_3),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.padding(4.dp))

                Image(
                    modifier = Modifier.weight(1f),
                    painter = painterResource(id = R.drawable.ingredient_4),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.padding(4.dp))

                Image(
                    modifier = Modifier.weight(1f),
                    painter = painterResource(id = R.drawable.ingredient_5),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }


            Spacer(modifier = Modifier.padding(12.dp))

            TextBody(
                text = "Lemonade, coconut, peppers, egg + 5 more",
                modifier = Modifier.padding(0.dp)
            )

            Spacer(modifier = Modifier.padding(12.dp))

        } // end of column
    }
}
