package com.example.composetestapp


import android.os.Bundle
import android.os.Handler
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.composetestapp.ui.Splash
import com.example.composetestapp.ui.editrecipe.EditRecipe
import com.example.composetestapp.ui.login.Register
import com.example.composetestapp.ui.login.login
import com.example.composetestapp.ui.recipe.MyRecipe
import com.example.composetestapp.ui.recipe.detail.RecipeDetail
import com.example.composetestapp.ui.search.Search
import com.example.composetestapp.ui.theme.ComposeTestAppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LoginNavigator()
//            AppNavigator()
        }
    }


}

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
            composable("Login") { login(onNavigationClicked = { }, navController) }
            composable("AppNavigator") {
                AppNavigator()
            }

            composable("Register") {
                Register(navController)
            }


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
            composable("Login") { login(onNavigationClicked = { }, navController) }
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
                navController.navigate("MyRecipe")
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
                navController.navigate("Login")
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






