package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column (
        Modifier.fillMaxWidth()
            ) {
        Row(Modifier.weight(1f)) {
            BuildComposeQuadrant(
                title = stringResource(R.string.textComposable),
                text = stringResource(id = R.string.text1),
                backgroundColor = Color.Green,
                modifier = Modifier.weight(1f)
            )
            BuildComposeQuadrant(
                title = stringResource(R.string.ImageComposable),
                text = stringResource(id = R.string.text2),
                backgroundColor = Color.Yellow,
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            BuildComposeQuadrant(
                title = stringResource(R.string.RowComposable),
                text = stringResource(id = R.string.text3),
                backgroundColor = Color.Cyan,
                modifier = Modifier.weight(1f)
            )
            BuildComposeQuadrant(
                title = stringResource(R.string.ColumnComposable),
                text = stringResource(id = R.string.text4),
                backgroundColor = Color.LightGray,
                modifier = Modifier.weight(1f)
            )
        }
    }
    }
@Composable
fun BuildComposeQuadrant(
    title: String,
    text: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column (
        modifier = modifier
        .fillMaxSize()
        .padding(16.dp)
        .background(backgroundColor),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = text,
            textAlign = TextAlign.Justify
        )
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrantApp()
    }
}