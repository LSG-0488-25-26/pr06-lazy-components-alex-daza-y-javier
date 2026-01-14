package com.example.lazycomponents.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lazycomponents.R
import com.example.lazycomponents.model.GeneroVideojuego

class GeneroVideojuegoViewModel : ViewModel() {

    private val _listaGeneros = MutableLiveData<List<GeneroVideojuego>>()
    val listaGeneros: LiveData<List<GeneroVideojuego>> = _listaGeneros

    init {
        cargarGeneros()
    }

    private fun cargarGeneros() {
        _listaGeneros.value = listOf(
            GeneroVideojuego(
                "God of War",
                "Acción",
                R.drawable.god_of_war,
                "Videojuego centrado en el combate y la acción constante."
            ),
            GeneroVideojuego(
                "Final Fantasy VII",
                "RPG",
                R.drawable.final_fantasy_vii,
                "Juego de rol con historia profunda y evolución de personajes."
            ),
            GeneroVideojuego(
                "Call of Duty",
                "Shooter",
                R.drawable.call_of_duty,
                "Juego de disparos en primera persona."
            ),
            GeneroVideojuego(
                "The Legend of Zelda",
                "Aventura",
                R.drawable.zelda,
                "Exploración, puzzles y aventura."
            ),
            GeneroVideojuego(
                "Super Mario Bros",
                "Plataformas",
                R.drawable.mario,
                "Juego basado en saltos y niveles de plataformas."
            ),
            GeneroVideojuego(
                "FIFA",
                "Deportes",
                R.drawable.fifa,
                "Simulación de fútbol con equipos reales."
            ),
            GeneroVideojuego(
                "Need for Speed",
                "Carreras",
                R.drawable.need_for_speed,
                "Carreras de coches a gran velocidad."
            ),
            GeneroVideojuego(
                "Resident Evil",
                "Terror",
                R.drawable.resident_evil,
                "Juego de terror y supervivencia."
            )
        )
    }
}
