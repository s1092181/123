package tw.edu.pu.s1092181.a123

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tw.edu.pu.s1092181.a123.ui.theme.余汶芯123Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            余汶芯123Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                   Myself()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun Myself( modifier: Modifier = Modifier) {
        Column (
            modifier=modifier.padding(16.dp),
            horizontalAlignment=Alignment.CenterHorizontally)
            {
            Text(
                text = "410921812 余汶芯",
                modifier = modifier
            )
            Image(
                painter= painterResource(id = R.drawable.map) ,
                contentDescription=null,
                modifier= Modifier.padding(top = 16.dp)
            )
            Box(
                modifier = modifier
                    .fillMaxSize()
                    .padding(top = 16.dp)
            ){
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val canvasWidth = size.width
                    val canvasHeight = size.height
                    drawRect(
                        color= Color.Blue,
                        topLeft = Offset(
                            x = canvasWidth - 1100f,
                            y = canvasHeight - 800f),
                        size= Size(width = 50f, height = 50f)
                    )
                    drawRect(
                        color= Color.Blue,
                        topLeft = Offset(
                            x = canvasWidth - 250f,
                            y = canvasHeight - 150f),
                        size= Size(width = 50f, height = 50f)
                    )
                }
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    余汶芯123Theme {
        Greeting("Android")
    }
}