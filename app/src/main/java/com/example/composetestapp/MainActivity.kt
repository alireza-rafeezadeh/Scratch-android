package com.example.composetestapp


import android.os.Bundle
import android.os.Handler
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.composetestapp.ui.Splash
import com.example.composetestapp.ui.editrecipe.EditRecipe
import com.example.composetestapp.ui.feed.Feed
import com.example.composetestapp.ui.login.Register
import com.example.composetestapp.ui.login.login
import com.example.composetestapp.ui.profile.Profile
import com.example.composetestapp.ui.recipe.MyRecipe
import com.example.composetestapp.ui.recipedetail.RecipeDetail
import com.example.composetestapp.ui.search.Search
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import com.example.composetestapp.util.Screen
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
//            BottomSheet()
            LoginNavigator()
//            AppNavigator()
//            TestUI()
//            Feed()
//            RecipeDetail()
        }
    }


}


@ExperimentalMaterialApi
@Composable
fun LoginNavigator() {
    val navController = rememberNavController()

    Scaffold {

        NavHost(navController, startDestination = Screen.Splash.route) {
            composable(Screen.Splash.route) {
                Splash()
                Handler().postDelayed({
                    navController.navigate(Screen.Splash.route)
                }, 1500)
            }
            composable(Screen.Splash.route) { login(navController) }
            composable(Screen.AppNavigator.route) {
                AppNavigator()
            }

            composable(Screen.Register.route) {
                Register(navController)
            }


        }
    }

}

@ExperimentalMaterialApi
@Composable
fun AppNavigator() {

    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            AppBottomNav(navController)
        },
    ) {

        NavHost(navController, startDestination = Screen.Search.route) {
            composable(Screen.Login.route) { login(navController) }
            composable(Screen.MyRecipe.route) {
                MyRecipe(navController)
            }

            composable(Screen.RecipeDetail.route) { RecipeDetail() }
            composable(Screen.EditRecipe.route) {
//                EditRecipeNavigator()
                EditRecipe()
            }
            composable(Screen.Search.route) { Search() }
            composable(Screen.Profile.route) { Profile(navController) }
            composable(Screen.Feed.route) { Feed() }

        }
    }
}

/*@ExperimentalMaterialApi
@Composable
fun EditRecipeNavigator() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
        },
    ) {
        NavHost(navController, startDestination = "EditRecipe") {
            composable("EditRecipe") { EditRecipe() }
        }
    }
}*/

@Composable
private fun AppBottomNav(navController: NavHostController) {

    val bottomNavItems = listOf(
        Screen.Search,
        Screen.Feed,
        Screen.Profile
    )

    BottomNavigation(backgroundColor = Color.White) {

        bottomNavItems.forEach { screen ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = painterResource(id = screen.drawableId),
                        contentDescription = null
                    )
                },
                label = { Text(text = "") },
                selected = false,
                //                            alwaysShowLabels = false, // This hides the title for the unselected items
                onClick = {
                    navController.navigate(screen.route)
                }
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestAppTheme {
        Splash()
    }
}

