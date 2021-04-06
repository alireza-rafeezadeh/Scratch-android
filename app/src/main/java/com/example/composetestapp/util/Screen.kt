package com.example.composetestapp.util

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.composetestapp.R

sealed class Screen(val route: String, @StringRes val resourceId: Int, @DrawableRes val drawableId : Int) {
    object Search : Screen("Search", R.string.search,R.drawable.ic_search)
    object Feed : Screen("Feed", R.string.feed,R.drawable.ic_feed)
    object Profile : Screen("Profile", R.string.profile,R.drawable.ic_my_kitchen)
}
