import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
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
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(generoVideojuego.imagenRes),
                contentDescription = generoVideojuego.nombreJuego,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(100.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = generoVideojuego.nombreJuego,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = generoVideojuego.genero,
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}
