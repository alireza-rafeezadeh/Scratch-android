package com.example.composetestapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetestapp.ui.recipe.detail.RecipeDetail
import com.example.composetestapp.ui.recipe.edit.EditRecipe
import com.example.composetestapp.ui.theme.ComposeTestAppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        /*setContent {

            ComposeTestAppTheme {
                // A surface container using the 'background' color from the theme
                Surface {
//                    Greeting("Android")
//                    test()
//                    BoxExample()
//                    login()
//                    Register()
//                    MyRecipe()
//                    EditRecipe()
                    RecipeDetail()
                }
            }
        }*/
    }
}

@Composable
fun Greeting(name: String) {
    var state = mutableStateOf("")

    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Hello $name!")
//        Text(text = "wow" , style = TextStyle(fontSize = TextUnit.))
        TextField(value = "sdsf", onValueChange = { /*TODO*/ })
        OutlinedTextField(value = state.value, onValueChange = { state })
//        OutlinedTextField(value = "sdsf", onValueChange = { /*TODO*/ })

        Spacer(modifier = Modifier.height(100.dp))
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text(text = "press me!")
        }

//        Text(text = )

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestAppTheme {
//        Greeting("Android")
//        test()
        BoxExample()
    }
}


@Composable
fun test() {


    Column(modifier = Modifier.fillMaxSize()) {

        Spacer(modifier = Modifier.fillMaxSize())

        Image(
            painter = painterResource(id = R.drawable.splash_image),
            contentDescription = null,
            modifier = Modifier
                .height(270.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(4.dp)),
            contentScale = ContentScale.FillWidth

        )

//        TextFieldDemo()


    }

}


@Composable
fun TextFieldDemo() {
    Column(Modifier.padding(16.dp)) {
        val textState = remember { mutableStateOf(TextFieldValue()) }
        TextField(
            value = textState.value,
            onValueChange = { textState.value = it },
            label = {
                Text(text = "label")
            }
        )
        Text("The textfield has this text: " + textState.value.text)
    }
}


@Composable
fun BoxExample() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
//        Text("This text is drawn first", modifier = Modifier.align(Alignment.TopCenter))

        Row(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(bottom = 160.dp)
        ) {

            Image(
                painter = painterResource
                    (id = R.drawable.ic_scratch_logo),
                contentDescription = null,
                Modifier
                    .height(48.dp)
                    .width(48.dp)

            )

            Text(
                "Scratch", fontSize = 21.sp,
                color = colorResource(id = R.color.text_color),
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }

//            .align(Alignment.Center)


        Box(modifier = Modifier.align(Alignment.BottomCenter)) {


            Image(
                painter = painterResource(id = R.drawable.splash_image),
                contentDescription = null,
                modifier = Modifier
                    .alpha(0.8f)
                    .height(370.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(4.dp))
                    .align(Alignment.Center),
                contentScale = ContentScale.FillWidth

            )
            Box(
//                painter = painterResource(id = R.drawable.splash_fade_image)
//                , contentDescription = null,
                modifier = Modifier
//                    .background(shape = Rect)
                    .height(50.dp)
                    .fillMaxWidth()
                    .align(Alignment.TopCenter)

            )

            Box(
                modifier = Modifier
                    .height(140.dp)
                    .fillMaxWidth()
                    .background(
                        brush = Brush.linearGradient(
                            colors =
//                            listOf(Color.Red, colorResource(id = R.color.teal_200)),
                            listOf(Color.White, colorResource(id = R.color.blank)),
                            start = Offset(0.0f, 0.0f),
                            end = Offset(0.0f, 400.0f)
                        )
                    )
//                    .drawBackground(
//                        HorizontalGradient(
//                            0.0f to Color.Red,
//                            0.5f to Color.Green,
//                            1.0f to Color.Blue,
//                            startX = Px.Zero,
//                            endX = 500.dp.toPx()
//                        )
//                    )
            )

        }

    }
}
