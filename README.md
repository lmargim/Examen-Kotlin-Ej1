Ejercicio 1: Lista de Videojuegos
Objetivo: Crear una pantalla que muestre una lista de videojuegos, cada uno con una imagen,
un nombre y un precio.

Pasos:
1. Define una data class con name, price y imageUrl.
2. Usa LazyColumn para mostrar la lista de productos.
3. Cada elemento de la lista debe mostrar una AsyncImage, un Text para el nombre de
mayor tamaño y otro Text para el precio.
4. La imagen de cada uno se obtendrá de
https://loremflickr.com/400/400/seville?lock=1, cambiando el número para que sean
distintas.


Dependencias:
coil = { group = "io.coil-kt", name = "coil-compose", version.ref = "2.2.2" }
