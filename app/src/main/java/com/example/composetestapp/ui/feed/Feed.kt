package com.example.composetestapp.ui.feed

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetestapp.R
import com.example.composetestapp.nunitoFamily
import com.example.composetestapp.ui.widgets.*

@Composable
fun Feed() {


    val pagerState: PagerState = remember { PagerState() }



    pagerState.maxPage = (4 - 1).coerceAtLeast(0)
    val modifier = Modifier
        .padding(start = 30.dp, top = 16.dp, end = 30.dp, bottom = 130.dp)
        .fillMaxWidth()
        .fillMaxHeight()





    Column {
        FeedToolbar()

        Spacer(modifier = Modifier.padding(top = 50.dp))

        Pager(
            state = pagerState,
            modifier = modifier
        ) {
//        val (podcast, lastEpisodeDate) = items[page]


            Card(
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxHeight()
                    .padding(horizontal = 8.dp, vertical = 8.dp),
//                    .background(color = Color.Gray)
                elevation = 12.dp,
                shape = RoundedCornerShape(size = 8.dp)
            ) {


                Column(
                    Modifier
                        .weight(1f)
//                        .align(Alignment.CenterHorizontally)
                        // TODO: Change this aspect ratio accordingly
                        .aspectRatio(0.6f)
                ) {

                    CardContent()


                }


            }


        }
    }
}


@Composable
fun CardContent() {
    Column {
        Row(modifier = Modifier.padding(start = 16.dp)) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = null,
                modifier = Modifier
                    .height(45.dp)
                    .align(Alignment.CenterVertically)
            )

            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 8.dp)
            ) {
                TextBody(text = "Profile Name", modifier = Modifier.padding(0.dp))
                TextGray(text = "2h ago", modifier = Modifier.padding(0.dp))
            }
        }

        Spacer(modifier = Modifier.padding(top = 16.dp))

        Image(
            painter = painterResource(id = R.drawable.feed_slider), contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(330.dp),
            contentScale = ContentScale.Crop
        )

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp, end = 16.dp)
                .fillMaxWidth()
        ) {
            CardTitle(
                text = "Red Wine and Mint Soufflé",
                modifier = Modifier.align(Alignment.CenterVertically)
            )

            Image(
                painter = painterResource(id = R.drawable.ic_heart),
                contentDescription = null,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }

        TextSublte(
            text = "Apparently we had reached a great height in the atmosphere, for the sky was …",
            modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 8.dp)
        )

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(
                    start = 16.dp, end = 16.dp
                )
                .fillMaxWidth()
        ) {
            Row(Modifier.align(Alignment.CenterVertically)) {

                TextGray(text = "32 likes", modifier = Modifier.align(Alignment.CenterVertically))
                Image(
                    painter = painterResource(id = R.drawable.ic_dot),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 8.dp, end = 8.dp)
                        .align(Alignment.CenterVertically)
                )
                TextGray(text = "8 Comments", modifier = Modifier.align(Alignment.CenterVertically))
            }

            OutlinedButton(
                modifier = Modifier.align(Alignment.CenterVertically),
                onClick = { /*TODO*/ },
                border = BorderStroke(1.dp, colorResource(id = R.color.jungle_green))
            ) {
                ButtonText(text = "Save", modifier = Modifier.padding(0.dp))
            }
        }

    }
}

@Composable
fun FeedToolbar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp, start = 24.dp, end = 24.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Row(
            modifier = Modifier
                .align(Alignment.CenterVertically)
        ) {

            Image(
                painter = painterResource
                    (id = R.drawable.ic_scratch_logo),
                contentDescription = null,
                Modifier
                    .height(26.dp)
                    .width(26.dp)

            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                "scratch", fontSize = 20.sp,
                color = colorResource(id = R.color.text_color),
                fontFamily = nunitoFamily,
                fontWeight = FontWeight.Bold,
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }

        Row(modifier = Modifier.align(Alignment.CenterVertically)) {
            Image(
                painter = painterResource(id = R.drawable.ic_bell),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.padding(start = 24.dp))
            Image(
                modifier = Modifier
                    .align(Alignment.CenterVertically),
                painter = painterResource(id = R.drawable.ic_letter),
                contentDescription = null
            )
        }

    }
}