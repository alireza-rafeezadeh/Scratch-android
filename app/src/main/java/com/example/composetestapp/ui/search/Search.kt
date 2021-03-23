package com.example.composetestapp.ui.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetestapp.R
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import com.example.composetestapp.ui.widgets.H5Text
import com.example.composetestapp.ui.widgets.TextLead
import com.example.composetestapp.ui.widgets.TextSublte
import java.nio.file.WatchEvent


@Composable
fun Search() {


    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxWidth()
    ) {

        Spacer(modifier = Modifier.padding(top  = 12.dp))

        SearchBar()

        Spacer(modifier = Modifier.padding(top = 32.dp))

        LazyColumn(content = {

            item {
                Column {
                    H5Text(text = "Trending Recipes", modifier = Modifier.padding(start = 24.dp))
                    Spacer(modifier = Modifier.padding(top = 16.dp))
                    LazyRow(content = {
//                        items(list) {
//                            H5Text(text = "TrendingRecipes", modifier = Modifier.padding(0.dp))
//                        }

                        item {
                            Spacer(modifier = Modifier.padding(start = 24.dp))
                        }
                        items(getTrendingRecipes()) { item ->
                            Column {
                                Image(
                                    modifier = Modifier
                                        .height(200.dp)
                                        .width(140.dp),
                                    contentScale = ContentScale.Crop,
                                    painter = painterResource(id = item.image),
                                    contentDescription = null
                                )
                                Spacer(modifier = Modifier.padding(top = 8.dp))
                                TextLead(text = item.name, modifier = Modifier.width(140.dp))


                            }

                            Spacer(modifier = Modifier.padding(start = 16.dp))
                        }


                    })
                }
            }

            item {
                Column {
                    H5Text(
                        text = "What can I make with..",
                        modifier = Modifier.padding(start = 24.dp)
                    )
                    Spacer(modifier = Modifier.padding(top = 16.dp))
                    LazyRow(content = {
//                        items(list) {
//                            H5Text(text = "TrendingRecipes", modifier = Modifier.padding(0.dp))
//                        }

                        item {
                            Spacer(modifier = Modifier.padding(start = 24.dp))
                        }
                        items(getWhatCanIMake()) { item ->
                            Column {
                                Image(
                                    modifier = Modifier
                                        .height(200.dp)
                                        .width(140.dp),
                                    contentScale = ContentScale.Crop,
                                    painter = painterResource(id = item.image),
                                    contentDescription = null
                                )
                                Spacer(modifier = Modifier.padding(top = 8.dp))
                                TextLead(text = item.name, modifier = Modifier.width(140.dp))


                            }

                            Spacer(modifier = Modifier.padding(start = 16.dp))
                        }


                    })
                }
            }

            item {
                Column {
                    H5Text(text = "Trending Recipes", modifier = Modifier.padding(start = 24.dp))
                    Spacer(modifier = Modifier.padding(top = 16.dp))
                    LazyRow(content = {
//                        items(list) {
//                            H5Text(text = "TrendingRecipes", modifier = Modifier.padding(0.dp))
//                        }

                        item {
                            Spacer(modifier = Modifier.padding(start = 24.dp))
                        }
                        items(getTrendingRecipes()) { item ->
                            Column {
                                Image(
                                    modifier = Modifier
                                        .height(200.dp)
                                        .width(140.dp),
                                    contentScale = ContentScale.Crop,
                                    painter = painterResource(id = item.image),
                                    contentDescription = null
                                )
                                Spacer(modifier = Modifier.padding(top = 8.dp))
                                TextLead(text = item.name, modifier = Modifier.width(140.dp))


                            }

                            Spacer(modifier = Modifier.padding(start = 16.dp))
                        }


                    })
                }
            }

            item {
                Column {
                    H5Text(text = "Trending Recipes", modifier = Modifier.padding(start = 24.dp))
                    Spacer(modifier = Modifier.padding(top = 16.dp))
                    LazyRow(content = {
//                        items(list) {
//                            H5Text(text = "TrendingRecipes", modifier = Modifier.padding(0.dp))
//                        }

                        item {
                            Spacer(modifier = Modifier.padding(start = 24.dp))
                        }
                        items(getTrendingRecipes()) { item ->
                            Column {
                                Image(
                                    modifier = Modifier
                                        .height(200.dp)
                                        .width(140.dp),
                                    contentScale = ContentScale.Crop,
                                    painter = painterResource(id = item.image),
                                    contentDescription = null
                                )
                                Spacer(modifier = Modifier.padding(top = 8.dp))
                                TextLead(text = item.name, modifier = Modifier.width(140.dp))


                            }

                            Spacer(modifier = Modifier.padding(start = 16.dp))
                        }


                    })
                }
            }

            item {
                Spacer(modifier = Modifier.padding(top = 88.dp))
            }
        })
    }
}


@Composable
fun SearchBar() {
    Card(
        elevation = 16.dp,
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(45.dp)
            .padding(start = 24.dp, end = 24.dp)
    ) {
        Row() {
            Image(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(1f),
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = null
            )
            TextSublte(
                text = "Search recipe, people, or tag",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(8f)
            )

            Image(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(1f),
                painter = painterResource(id = R.drawable.ic_filter),
                contentDescription = null
            )
        }
    }
}


@Preview
@Composable
fun PreviewSearch() {
    ComposeTestAppTheme {
        Search()
    }
}