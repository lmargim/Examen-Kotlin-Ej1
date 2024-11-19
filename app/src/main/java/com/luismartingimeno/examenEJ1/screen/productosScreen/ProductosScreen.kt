package com.luismartingimeno.examenEJ1.screen.productosScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.luismartingimeno.examenEJ1.model.Videojuego

@Composable
fun ProductosScreen() {
    val listaProductos = listOf<Videojuego>(
        Videojuego("Super Mario Odyssey", 60.0, "https://loremflickr.com/400/400/seville?lock=1"),
        Videojuego(
            "The Legend of Zelda: Breath of the Wild",
            45.0,
            "https://loremflickr.com/400/400/seville?lock=2"
        ),
        Videojuego(
            "The Legend of Zelda: Link's Awakening",
            30.0,
            "https://loremflickr.com/400/400/seville?lock=3"
        ),
        Videojuego("Super Mario 64", 50.0, "https://loremflickr.com/400/400/seville?lock=4"),
        Videojuego(
            "The Legend of Zelda: Ocarina of Time",
            40.0,
            "https://loremflickr.com/400/400/seville?lock=5"
        ),
        Videojuego("Super Mario 3D World", 40.0, "https://loremflickr.com/400/400/seville?lock=6"),
        Videojuego(
            "The Legend of Zelda: A Link to the Past",
            35.0,
            "https://loremflickr.com/400/400/seville?lock=7"
        ),
        Videojuego("Super Mario 3D Land", 35.0, "https://loremflickr.com/400/400/seville?lock=8"),
        Videojuego(
            "The Legend of Zelda: Skyward Sword",
            40.0,
            "https://loremflickr.com/400/400/seville?lock=9"
        ),
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(listaProductos) { videojuego ->

            AsyncImage(
                model = videojuego.imageUrl, contentDescription = videojuego.name
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = videojuego.name, fontSize = 15.sp
                )

                Spacer(modifier = Modifier.width(10.dp))

                Text(
                    text = "${videojuego.price}€",
                    fontSize = 15.sp,
                    color = Color.Gray,
                )

            }

        }
    }
}