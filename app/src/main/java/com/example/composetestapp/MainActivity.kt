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

        NavHost(navController, startDestination = "Splash") {
            composable("Splash") {
                Splash()
                Handler().postDelayed({
                    navController.navigate("Login")
                }, 1500)
            }
            composable("Login") { login(navController) }
            composable("AppNavigator") {
                AppNavigator()
            }

            composable("Register") {
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

        NavHost(navController, startDestination = "Search") {
            composable("Login") { login(navController) }
            composable("MyRecipe") {
                MyRecipe(navController)
            }

            composable("RecipeDetail") { RecipeDetail() }
            composable("EditRecipe") {
//                EditRecipeNavigator()
                EditRecipe()
            }
            composable("Search") { Search() }
            composable("Profile") { Profile(navController) }
            composable("Feed") { Feed() }

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

    BottomNavigation(backgroundColor = Color.White) {
        BottomNavigationItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = null
                )
            },
            label = { Text(text = "") },
            selected = false,
            //                            alwaysShowLabels = false, // This hides the title for the unselected items
            onClick = {
                navController.navigate("Search")

            }
        )

        BottomNavigationItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_feed),
                    contentDescription = null
                )
            },
            label = { Text(text = "") },
            selected = false,
            //                            alwaysShowLabels = false, // This hides the title for the unselected items
            onClick = {
                navController.navigate("Feed")
            }
        )

        BottomNavigationItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_my_kitchen),
                    contentDescription = null
                )
            },
            label = { Text(text = "") },
            selected = false,
            //                            alwaysShowLabels = false, // This hides the title for the unselected items
            onClick = {
                navController.navigate("Profile")
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

