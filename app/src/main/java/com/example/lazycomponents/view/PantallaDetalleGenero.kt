package com.example.lazycomponents.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.lazycomponents.model.GeneroVideojuego

@Composable
fun PantallaDetalleGenero(generoVideojuego: GeneroVideojuego) {

    Column(modifier = Modifier.padding(16.dp)) {

        AsyncImage(
            model = generoVideojuego.imagenUrl,
            contentDescription = generoVideojuego.nombreJuego,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = generoVideojuego.nombreJuego,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(text = "Género: ${generoVideojuego.genero}")

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = generoVideojuego.descripcion)
    }
}
