package com.itsa.seguimientofenolgico.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.itsa.seguimientofenolgico.ui.theme.SeguimientoFenológicoTheme

@Composable
fun Home(
    navegarRegistrar: () -> Unit
){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.size(30.dp))
        Text(
            text = "Inicio",
            style = MaterialTheme.typography.h3,
            fontWeight = FontWeight.Black,
            color = Color.Green,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.size(70.dp))
        Button(
            colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.secondary,
                disabledBackgroundColor = MaterialTheme.colors.onBackground
                    .copy(alpha = 0.2f)
                    .compositeOver(MaterialTheme.colors.background)
                // Also contentColor and disabledContentColor
            ),
            onClick = { navegarRegistrar() },
            // Uses ButtonDefaults.ContentPadding by default
            contentPadding = PaddingValues(
                start = 100.dp,
                top = 15.dp,
                end = 100.dp,
                bottom = 15.dp
            )
        ) {
            // Inner content including an icon and a text label
            Icon(
                Icons.Filled.Add,
                contentDescription = "Registrar",
                modifier = Modifier.size(30.dp)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text(
                "Registrar",
                style = MaterialTheme.typography.h5,
                fontWeight = FontWeight.Black,
                fontStyle = FontStyle.Italic,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.size(30.dp))
        Button(
            colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.secondary,
                disabledBackgroundColor = MaterialTheme.colors.onBackground
                    .copy(alpha = 0.2f)
                    .compositeOver(MaterialTheme.colors.background)
                // Also contentColor and disabledContentColor
            ),
            onClick = { /* ... */ },
            // Uses ButtonDefaults.ContentPadding by default
            contentPadding = PaddingValues(
                start = 90.dp,
                top = 15.dp,
                end = 105.dp,
                bottom = 15.dp
            )
        ) {
            // Inner content including an icon and a text label
            Icon(
                Icons.Filled.Search,
                contentDescription = "Consultar",
                modifier = Modifier.size(30.dp)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text(
                "Consultar",
                style = MaterialTheme.typography.h5,
                fontWeight = FontWeight.Black,
                fontStyle = FontStyle.Italic,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.size(30.dp))
        Button(
            colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.secondary,
                disabledBackgroundColor = MaterialTheme.colors.onBackground
                    .copy(alpha = 0.2f)
                    .compositeOver(MaterialTheme.colors.background)
                // Also contentColor and disabledContentColor
            ),
            onClick = { /* ... */ },
            // Uses ButtonDefaults.ContentPadding by default
            contentPadding = PaddingValues(
                start = 55.dp,
                top = 15.dp,
                end = 55.dp,
                bottom = 15.dp
            )
        ) {
            // Inner content including an icon and a text label
            Icon(
                Icons.Filled.Info,
                contentDescription = "Generar Reportes",
                modifier = Modifier.size(30.dp)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text(
                "Generar Reportes",
                style = MaterialTheme.typography.h5,
                fontWeight = FontWeight.Black,
                fontStyle = FontStyle.Italic,
                color = Color.White
            )
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun PrevHome(){
    SeguimientoFenológicoTheme {
       Home(){
       }
    }
}

