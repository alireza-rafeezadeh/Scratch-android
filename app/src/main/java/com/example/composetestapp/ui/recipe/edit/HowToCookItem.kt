package com.example.composetestapp.ui.recipe.edit

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.composetestapp.R


@Composable
fun HowToCookItem() {

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

            Spacer(Modifier.padding(16.dp))

            HowToCookStep(
                description = stringResource(R.string.cook_item_1),
                itemNumber = 1
            )

            Spacer(Modifier.padding(16.dp))


            HowToCookStep(
                description = stringResource(R.string.cook_item_2),
                itemNumber = 2
            )

            Spacer(Modifier.padding(16.dp))

            HowToCookStep(
                description = stringResource(R.string.cook_item_3),
                itemNumber = 3
            )

            Spacer(Modifier.padding(24.dp))

        }
    }


}