package com.example.composetestapp.ui.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetestapp.R
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import com.example.composetestapp.ui.widgets.*
import kotlinx.coroutines.flow.MutableStateFlow


@Composable
fun Profile() {

    var selectedCategory: ProfilePagerCategory = ProfilePagerCategory.Recipes

//    var state : MutableState<ProfilePagerCategory>

    val state = remember { mutableStateOf(ProfilePagerCategory.Recipes) }

//    private val selectedCategory = MutableStateFlow(ProfilePagerCategory.Recipes)
//    val selectedIndex = MutableStateFlow(0)
    val selectedIndex = remember { mutableStateOf(0) }


    Spacer(Modifier.padding(top = 12.dp))
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 24.dp, end = 24.dp)
    ) {
        ProfileToolBar()

        Spacer(modifier = Modifier.padding(top = 32.dp))

        ProfileInfo()

        Spacer(modifier = Modifier.padding(top = 24.dp))
        TabRow(
            selectedTabIndex = selectedIndex.value,
            indicator = { tabPositions ->
                TabRowDefaults.Indicator(modifier =
                    Modifier
                        .tabIndicatorOffset(tabPositions[selectedIndex.value]),
                    color = colorResource(id = R.color.jungle_green)
//                    Modifier.background(color = Color.Blue)

                )
            },
            contentColor = Color.White,
            backgroundColor = Color.White,
            modifier = Modifier.height(55.dp)
        ) {
            Tab(state.value == ProfilePagerCategory.Recipes,
//            unselectedContentColor = Color.White,
                onClick = {
//                selectedCategory = ProfilePagerCategory.Recipes
                    state.value = ProfilePagerCategory.Recipes
                    selectedIndex.value = 0
                }) {
                TextLead(text = "Recipes", modifier = Modifier.padding(0.dp))
//                state.value = ProfilePagerCategory.Recipes
            }

            Tab(state.value == ProfilePagerCategory.Saved, onClick = {
//                selectedCategory = ProfilePagerCategory.Saved
                state.value = ProfilePagerCategory.Saved
                selectedIndex.value = 1

            }) {
//                Text(text = "Saved")
                TextLead(text = "Saved", modifier = Modifier.padding(0.dp))
            }

            Tab(state.value == ProfilePagerCategory.Following, onClick = {
//                selectedCategory = ProfilePagerCategory.Saved
                state.value = ProfilePagerCategory.Following
                selectedIndex.value = 2

            }) {
//                Text(text = "Saved")
                TextLead(text = "Following", modifier = Modifier.padding(0.dp))
            }
        }

        when (state.value) {
            ProfilePagerCategory.Following -> {
                Text(text = "following")
            }
            ProfilePagerCategory.Recipes -> {
                Text(text = "recipes")
            }

            ProfilePagerCategory.Saved -> {
                Text(text = "Saved")
            }
        }

    }

}

@Composable
fun ProfileToolBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        H3Text(
            text = "My Kitchen",
            modifier = Modifier.align(Alignment.CenterVertically)
        )
        Row(modifier = Modifier.align(Alignment.CenterVertically)) {
            Image(
                modifier = Modifier.align(Alignment.CenterVertically),
                painter = painterResource(id = R.drawable.ic_settings),
                contentDescription = null
            )
            Spacer(Modifier.padding(4.dp))
            TextBody(text = "Settings", modifier = Modifier.align(Alignment.CenterVertically))

        }
    }
}

@Composable
fun ProfileInfo() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            modifier = Modifier.height(80.dp),
            painter = painterResource(id = R.drawable.profile_avatar),
            contentDescription = null
        )
        Spacer(modifier = Modifier.padding(start = 16.dp))
        Column {

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                H5Text(text = "Nick Evans", modifier = Modifier.padding())

                Image(
                    modifier = Modifier.align(Alignment.CenterVertically),
                    painter = painterResource(id = R.drawable.ic_edit),
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(color = colorResource(id = R.color.cape_cod))
                )
            }
            Spacer(modifier = Modifier.padding(top = 4.dp))

            TextGray(text = "Potato Master", modifier = Modifier.padding())
            Spacer(modifier = Modifier.padding(top = 12.dp))

            Row {
                TextGray(text = "584 followers", modifier = Modifier.padding())

                Image(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 10.dp, end = 10.dp),
                    painter = painterResource(id = R.drawable.ic_dot),
                    contentDescription = null
                )
                TextGray(text = "23k likes", modifier = Modifier.padding())
            }
        }

    }
}

@Preview
@Composable
fun previewProfile() {
    ComposeTestAppTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
        ) {
            Profile()
        }
    }
}


enum class ProfilePagerCategory {
    Recipes, Saved, Following
}