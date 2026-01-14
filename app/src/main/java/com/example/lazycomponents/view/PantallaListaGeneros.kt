package com.example.lazycomponents.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.lazycomponents.model.GeneroVideojuego
import com.example.lazycomponents.view.ItemGeneroVideojuego
import com.example.lazycomponents.viewmodel.GeneroVideojuegoViewModel


@Composable
fun PantallaListaGeneros(
    onGeneroClick: (GeneroVideojuego) -> Unit
) {
    val viewModel: GeneroVideojuegoViewModel = viewModel()
    val listaGeneros by viewModel.listaGeneros.observeAsState(initial = emptyList<GeneroVideojuego>())

    LazyColumn {
        items(listaGeneros) { genero ->
            ItemGeneroVideojuego(
                generoVideojuego = genero
            ) {
                onGeneroClick(genero)
            }
        }
    }
}

