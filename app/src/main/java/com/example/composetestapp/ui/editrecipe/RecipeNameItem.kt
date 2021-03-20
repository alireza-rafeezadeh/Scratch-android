package com.example.composetestapp.ui.editrecipe

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.composetestapp.R
import com.example.composetestapp.ui.widgets.EditableText
import com.example.composetestapp.ui.widgets.H5Text
import com.example.composetestapp.ui.widgets.TextSublte


@Composable
fun RecipeNameItem(recipeTextState: MutableState<TextFieldValue>) {

    Row(modifier = Modifier.padding(start = 24.dp, end = 24.dp)) {
        Image(
            modifier = Modifier
                .height(65.dp)
                .width(65.dp)
                .align(Alignment.CenterVertically),
            painter = painterResource(id = R.drawable.recipe_image),
            contentDescription = null
        )

        Spacer(modifier = Modifier.padding(start = 16.dp))

        Column(
            modifier = Modifier
                .align(Alignment.CenterVertically),
        ) {
            TextSublte(text = "Recipe Name", modifier = Modifier.padding())
            EditableText(textState = recipeTextState)
        }
    }
}

