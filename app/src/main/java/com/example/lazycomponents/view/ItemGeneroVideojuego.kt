package com.example.lazycomponents.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.lazycomponents.model.GeneroVideojuego

@Composable
fun ItemGeneroVideojuego(
    generoVideojuego: GeneroVideojuego,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable { onClick() }
    ) {
        Row(modifier = Modifier.padding(12.dp)) {

            AsyncImage(
                model = generoVideojuego.imagenUrl,
                contentDescription = generoVideojuego.nombreJuego,
                modifier = Modifier.size(90.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(
                    text = generoVideojuego.nombreJuego,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(text = "Género: ${generoVideojuego.genero}")
            }
        }
    }
}
