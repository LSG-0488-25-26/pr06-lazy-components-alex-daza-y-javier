package com.example.lazycomponents.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lazycomponents.model.GeneroVideojuego

class GeneroVideojuegoViewModel : ViewModel() {

    //Lista para controlar los datos
    val listaGeneros = MutableLiveData<List<GeneroVideojuego>>()

    //Lista para observa la vista
    val lista_Generos: LiveData<List<GeneroVideojuego>> = listaGeneros

    init {
        cargarGeneros()
    }

    fun cargarGeneros() {
        listaGeneros.value = listOf(
            GeneroVideojuego(
                "God of War",
                "Acción",
                "https://upload.wikimedia.org/wikipedia/en/a/a7/God_of_War_4_cover.jpg",
                "Videojuego centrado en el combate y la acción constante."
            ),
            GeneroVideojuego(
                "Final Fantasy VII",
                "RPG",
                "https://upload.wikimedia.org/wikipedia/en/c/c2/Final_Fantasy_VII_Box_Art.jpg",
                "Juego de rol con historia profunda y evolución de personajes."
            ),
            GeneroVideojuego(
                "Call of Duty",
                "Shooter",
                "https://upload.wikimedia.org/wikipedia/en/5/5f/Call_of_Duty_Modern_Warfare_2_cover.jpg",
                "Juego de disparos en primera persona."
            ),
            GeneroVideojuego(
                "The Legend of Zelda",
                "Aventura",
                "https://upload.wikimedia.org/wikipedia/en/1/1d/The_Legend_of_Zelda_Breath_of_the_Wild.jpg",
                "Exploración, puzzles y aventura."
            ),
            GeneroVideojuego(
                "Super Mario Bros",
                "Plataformas",
                "https://upload.wikimedia.org/wikipedia/en/0/03/Super_Mario_Bros._box.png",
                "Juego basado en saltos y niveles de plataformas."
            ),
            GeneroVideojuego(
                "FIFA",
                "Deportes",
                "https://upload.wikimedia.org/wikipedia/en/a/a1/FIFA_23_Cover.jpg",
                "Simulación de fútbol con equipos reales."
            ),
            GeneroVideojuego(
                "Need for Speed",
                "Carreras",
                "https://upload.wikimedia.org/wikipedia/en/0/0c/NFS_Unbound_cover_art.jpg",
                "Carreras de coches a gran velocidad."
            ),
            GeneroVideojuego(
                "Resident Evil",
                "Terror",
                "https://upload.wikimedia.org/wikipedia/en/d/d8/Resident_Evil_2_Remake.jpg",
                "Juego de terror y supervivencia."
            )
        )
    }
}
