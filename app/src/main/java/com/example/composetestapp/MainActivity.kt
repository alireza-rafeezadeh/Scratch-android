package com.example.composetestapp


import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.composetestapp.ui.Splash
import com.example.composetestapp.ui.editrecipe.EditRecipe
import com.example.composetestapp.ui.login.login
import com.example.composetestapp.ui.recipe.MyRecipe
import com.example.composetestapp.ui.recipe.detail.RecipeDetail
import com.example.composetestapp.ui.search.Search
import com.example.composetestapp.ui.theme.ComposeTestAppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppNavigator()
        }
    }


}

@Composable
fun AppNavigator() {

    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            AppBottomNav(navController)
        },
    ) {

        NavHost(navController, startDestination = "Search") {
            composable("login") { login(onNavigationClicked = { }, navController) }
            composable("MyRecipe") {
                MyRecipe(navController,
                    onNavigationEvent = { },
                    onCookNavigationEvent = { })
            }

            composable("RecipeDetail") { RecipeDetail() }
            composable("EditRecipe") { EditRecipe() }
            composable("Search") { Search() }

        }
    }
}

@Composable
private fun AppBottomNav(navController: NavHostController) {


    BottomNavigation {
        BottomNavigationItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_play_white),
                    contentDescription = null
                )
            },
            label = { Text(text = "sdsf") },
            selected = false,
            //                            alwaysShowLabels = false, // This hides the title for the unselected items
            onClick = {
                navController.navigate("MyRecipe")
            }
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestAppTheme {
        Splash()
    }
}






