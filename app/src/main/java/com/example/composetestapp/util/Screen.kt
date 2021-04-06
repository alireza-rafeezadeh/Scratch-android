package com.example.composetestapp.util

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.composetestapp.R

sealed class Screen(
    val route: String,
    @StringRes val resourceId: Int,
    @DrawableRes val drawableId: Int = R.drawable.ic_search,
) {
    object Search : Screen("Search", R.string.search, R.drawable.ic_search)
    object Feed : Screen("Feed", R.string.feed, R.drawable.ic_feed)
    object Profile : Screen("Profile", R.string.profile, R.drawable.ic_my_kitchen)
    object Login : Screen("Login", R.string.login)
    object MyRecipe : Screen("MyRecipe", R.string.my_recipe)
    object RecipeDetail : Screen("RecipeDetail", R.string.my_recipe)
    object EditRecipe : Screen("EditRecipe", R.string.edit_recipe)
    object Splash : Screen("Splash", R.string.splash)
    object AppNavigator : Screen("AppNavigator", R.string.app_navigator)
    object Register : Screen("Register", R.string.register)
}
