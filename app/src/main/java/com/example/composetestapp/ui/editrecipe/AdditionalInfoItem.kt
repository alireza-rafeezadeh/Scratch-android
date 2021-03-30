package com.example.composetestapp.ui.editrecipe

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import com.example.composetestapp.ui.widgets.TextBody
import com.example.composetestapp.ui.widgets.TextSublte


@Composable
fun InfoStep(title : String , content : String) {


    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start
    ) {
        TextSublte(
            text = title, modifier = Modifier.padding(0.dp).weight(3f),
        )

        TextBody(text = content, modifier = Modifier.padding(0.dp).weight(5f))
    }
}


@Composable
fun AdditionalInfoItem() {
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
                title = "Additional Info",
            )

            Spacer(Modifier.padding(16.dp))

            InfoStep(title = "Serving Time", content = "12 Mins")

            Spacer(Modifier.padding(16.dp))

            InfoStep(
                title = "Nutrition Facts", content = "222 calories\n" +
                        "6.2 g fat\n" +
                        "7.2 g carbohydrates\n" +
                        "28.6 g protein\n" +
                        "68 mg cholesterol\n" +
                        "268 mg sodium"
            )

            Spacer(Modifier.padding(16.dp))

            InfoStep(
                title = "Tags",
                content = "Sweet, Coconut, Quick, Easy, Homemade"
            )

            Spacer(Modifier.padding(16.dp))


        }
    }
}


@Preview
@Composable
fun additionalInfoItemPreview() {
    ComposeTestAppTheme {
        AdditionalInfoItem()
    }

}