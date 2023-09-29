package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.Dp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceScreen()
                }
            }
        }
    }
}

@Composable
fun ArtSpaceScreen(modifier: Modifier = Modifier) {
    val artworkList = listOf(
        R.drawable.llegada,
        R.drawable.rengarchikito,
        R.drawable.moonshita,
        R.drawable.renguitar,
        R.drawable.acompanando1,
        R.drawable.acompanando2,
        R.drawable.rengar,
        R.drawable.moonchikita,
        R.drawable.acompanando3,
        R.drawable.moon,
        R.drawable.vacaciones,
        R.drawable.moonaws,
        R.drawable.rengaru,
        R.drawable.lengua,
        R.drawable.castradito,
        R.drawable.juego1,
        R.drawable.juego2,
        R.drawable.juego3,
        R.drawable.esperando,
        R.drawable.maldades,
        R.drawable.juntos,

    )

    var currentArtworkIndex by remember { mutableStateOf(0) }
    var title by remember { mutableStateOf(R.string.llegada) }
    var year by remember { mutableStateOf(R.string.llegada_year) }
    var description by remember { mutableStateOf(R.string.llegada_description) }
    var nombre by remember { mutableStateOf(R.string.nombre_cod) }
    var imageResource by remember { mutableStateOf(artworkList[currentArtworkIndex]) }

    // Función para actualizar el título y el año en función del índice actual
    fun updateTitleAndYear() {
        title = when (currentArtworkIndex) {
            0 -> R.string.llegada
            1 -> R.string.rengarchikito
            2 -> R.string.moonshita
            3 -> R.string.renguitar
            4 -> R.string.acompanando1
            5 -> R.string.acompanando2
            6 -> R.string.rengar
            7 -> R.string.moonchikita
            8 -> R.string.acompanando3
            9 -> R.string.moon
            10 -> R.string.vacaciones
            11 -> R.string.moonaws
            12 -> R.string.rengaru
            13 -> R.string.lengua
            14 -> R.string.castradito
            15 -> R.string.juego1
            16 -> R.string.juego2
            17 -> R.string.juego3
            18 -> R.string.esperando
            19 -> R.string.maldades
            20 -> R.string.juntos
            else -> R.string.acompanando2
        }
        year = when (currentArtworkIndex) {
            0 -> R.string.llegada_year
            1 -> R.string.rengarchikito_year
            2 -> R.string.moonshita_year
            3 -> R.string.renguitar_year
            4 -> R.string.acompanando1_year
            5 -> R.string.acompanando2_year
            6 -> R.string.rengar_year
            7 -> R.string.moonchikita_year
            8 -> R.string.acompanando3_year
            9 -> R.string.moon_year
            10 -> R.string.vacaciones_year
            11 -> R.string.moonaws_year
            12 -> R.string.rengaru_year
            13 -> R.string.lengua_year
            14 -> R.string.castradito_year
            15 -> R.string.juego1_year
            16 -> R.string.juego2_year
            17 -> R.string.juego3_year
            18 -> R.string.esperando_year
            19 -> R.string.maldades_year
            20 -> R.string.juntos_year
            else -> R.string.acompanando2_year
        }
        description = when (currentArtworkIndex) {
            0 -> R.string.llegada_description
            1 -> R.string.rengarchikito_description
            2 -> R.string.moonshita_decription
            3 -> R.string.renguitar_description
            4 -> R.string.acompanando1_description
            5 -> R.string.acompanando2_description
            6 -> R.string.rengar_description
            7 -> R.string.moonchikita_description
            8 -> R.string.acompanando3_description
            9 -> R.string.moon_description
            10 -> R.string.vacaciones_description
            11 -> R.string.moonaws_description
            12 -> R.string.rengaru_description
            13 -> R.string.lengua_description
            14 -> R.string.castradito_description
            15 -> R.string.juego1_description
            16 -> R.string.juego2_description
            17 -> R.string.juego3_description
            18 -> R.string.esperando_description
            19 -> R.string.maldades_description
            20 -> R.string.juntos_description
            else -> R.string.acompanando2_description
        }
        imageResource = artworkList[currentArtworkIndex]
    }

    Text(
        text = stringResource(id = nombre),
        fontWeight = FontWeight.Normal,
        color = colorResource(id = R.color.gray_900),
        fontSize = 14.sp,
        textAlign = TextAlign.Center
    )
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ArtworkImage(
            currentArtwork = imageResource
        )
        Spacer(
            modifier = modifier.size(16.dp)
        )
        ArtworkTitle(
            title = title,
            year = year,
        )
        Text(
            text = stringResource(id = description),
            fontWeight = FontWeight.Normal,
            color = colorResource(id = R.color.gray_900),
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
        Spacer(
            modifier = modifier.size(25.dp)
        )

        Row(
            modifier = modifier.padding(horizontal = 8.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = {
                    if (currentArtworkIndex == 0) {
                        currentArtworkIndex = artworkList.size - 1
                    } else {
                        currentArtworkIndex--
                    }
                    updateTitleAndYear()
                },
                colors = ButtonDefaults.buttonColors(
                    contentColor = colorResource(id = R.color.blue_100)
                ),
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 1.dp,
                    pressedElevation = 0.dp,
                    focusedElevation = 0.dp,
                )
            ) {
                Text(
                    text = stringResource(id = R.string.previous_button_text),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.white)
                )
            }

            // Botón de reinicio
            IconButton(
                onClick = {
                    currentArtworkIndex = 0
                    updateTitleAndYear()
                },
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary)
                    .size(48.dp)
                    .padding(8.dp),
                content = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_reset),
                        contentDescription = "Reset Gallery",
                        tint = Color.White
                    )
                }
            )


            Button(
                onClick = {
                    if (currentArtworkIndex == artworkList.size - 1) {
                        currentArtworkIndex = 0
                    } else {
                        currentArtworkIndex++
                    }
                    updateTitleAndYear()
                },
                colors = ButtonDefaults.buttonColors(
                    contentColor = colorResource(id = R.color.blue_100)
                ),
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 1.dp,
                    pressedElevation = 0.dp,
                    focusedElevation = 0.dp
                ),
            ) {
                Text(
                    text = stringResource(id = R.string.next_button_text),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.white)
                )
            }
        }
    }


}



@Composable
fun ArtworkImage(
    modifier: Modifier = Modifier,
    @DrawableRes currentArtwork: Int,
    padding: Dp = Dp(16f)
) {
    Image(
        painter = painterResource(id = currentArtwork),
        contentDescription = null,
        modifier = modifier
            .fillMaxWidth()
            .padding(padding),
        contentScale = ContentScale.FillWidth
    )
}



@Composable
fun ArtworkTitle(
    @StringRes title: Int,
    @StringRes year: Int,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = title),
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.blue_100),
            fontSize = 32.sp,
        )
        Text(
            text = stringResource(id = year),
            fontWeight = FontWeight.Medium,
            color = colorResource(id = R.color.gray_300),
            fontSize = 16.sp,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtSpaceTheme {
        ArtSpaceScreen()
    }
}
