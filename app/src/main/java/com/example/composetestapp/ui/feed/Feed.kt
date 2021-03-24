package com.example.composetestapp.ui.feed

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun Feed() {


    val pagerState: PagerState = remember { PagerState() }

    pagerState.maxPage = (4 - 1).coerceAtLeast(0)
    val modifier = Modifier
        .padding(start = 24.dp, top = 16.dp, end = 24.dp)
        .fillMaxWidth()
        .height(200.dp)




    Pager(
        state = pagerState,
        modifier = modifier
    ) {
//        val (podcast, lastEpisodeDate) = items[page]


        Column(
            Modifier
                .padding(4.dp)
                .fillMaxHeight()
                .padding(horizontal = 12.dp, vertical = 8.dp)
                .background(color = Color.Blue)
        ) {
            Box(
                Modifier
                    .weight(1f)
                    .align(Alignment.CenterHorizontally)
                    .aspectRatio(1f)
            ) {
               
                
                
                Box {
                    Text(text = "😁 Alireza >>>>")
                }

               
            }

           
        }
        
        
    }
}