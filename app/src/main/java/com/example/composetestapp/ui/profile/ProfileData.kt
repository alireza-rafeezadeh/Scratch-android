package com.example.composetestapp.ui.profile

import com.example.composetestapp.R
import com.example.composetestapp.ui.search.ImageItem

fun getProfileRecipes() =
    mutableListOf<Pair<ImageItem, ImageItem>>().apply {
        add(
            Pair(
                ImageItem(R.drawable.sweets, "Sweets"),
                ImageItem(R.drawable.italian, "Italian")
            )
        )
        add(
            Pair(
                ImageItem(R.drawable.desserts, "Desserts"),
                ImageItem(R.drawable.chocolates, "Chocolates")
            )
        )

        add(
            Pair(
                ImageItem(R.drawable.soups, "Soups"),
                ImageItem(R.drawable.pasta, "Pasta")
            )
        )

        add(
            Pair(
                ImageItem(R.drawable.sweets, "Sweets"),
                ImageItem(R.drawable.italian, "Italian")
            )
        )
        add(
            Pair(
                ImageItem(R.drawable.desserts, "Desserts"),
                ImageItem(R.drawable.chocolates, "Chocolates")
            )
        )
    }


