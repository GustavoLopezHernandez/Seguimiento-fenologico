package com.itsa.seguimientofenolgico.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import android.content.Context
import android.text.TextUtils
import android.widget.Toast
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import com.itsa.seguimientofenolgico.models.Planta
import com.itsa.seguimientofenolgico.ui.theme.SeguimientoFenológicoTheme
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore


@Composable
fun Register(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.size(30.dp))

        Scaffold(
            topBar ={
                TopAppBar(
                    title = {
                        Text(
                            text = "Registrar",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.h5,
                        ) },
                    navigationIcon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon( imageVector = Icons.Filled.ArrowBack, contentDescription = "Atras" )
                        }
                    },
                    modifier= Modifier
                        .clip(shape = RoundedCornerShape(5.dp)),
                    backgroundColor = Color.Green,
                    contentColor = Color.White,
                    elevation = 8.dp
                )
            }
        ) {
            firebaseUI(context = LocalContext.current)
        }
    }
}

@Composable
fun firebaseUI(context: Context) {

    val idPlanta = remember {
        mutableStateOf("")
    }

    val hojaBrote = remember {
        mutableStateOf("")
    }

    val hojaIntermedia = remember {
        mutableStateOf("")
    }

    val hojaMadura = remember {
        mutableStateOf("")
    }

    val talloInicio = remember {
        mutableStateOf("")
    }

    val talloIntermedia = remember {
        mutableStateOf("")
    }

    val talloSuperior = remember {
        mutableStateOf("")
    }

    val rangoPh = remember {
        mutableStateOf("")
    }

    val porcentajeHumedad = remember {
        mutableStateOf("")
    }

    val conductividad = remember {
        mutableStateOf("")
    }

    val observaciones = remember {
        mutableStateOf("")
    }

    val estado = remember {
        mutableStateOf("")
    }


    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Spacer(modifier = Modifier.size(30.dp))
        TextField(
            value = idPlanta.value,
            onValueChange = { idPlanta.value = it },
            placeholder = { Text(text = "ID planta") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Indicadores Hoja")
        TextField(
            value = hojaBrote.value,
            onValueChange = { hojaBrote.value = it },
            placeholder = { Text(text = "Brote") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        TextField(
            value = hojaIntermedia.value,
            onValueChange = { hojaIntermedia.value = it },
            placeholder = { Text(text = "Intermedia") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )


        TextField(
            value = hojaMadura.value,
            onValueChange = { hojaMadura.value = it },
            placeholder = { Text(text = "Madura") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Indicadores Tallo")
        TextField(
            value = talloInicio.value,
            onValueChange = { talloInicio.value = it },
            placeholder = { Text(text = "Inicio") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        TextField(
            value = talloIntermedia.value,
            onValueChange = { talloIntermedia.value = it },
            placeholder = { Text(text = "Intermedio") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        TextField(
            value = talloSuperior.value,
            onValueChange = { talloSuperior.value = it },
            placeholder = { Text(text = "Superior") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Otros Indicadores ")

        TextField(
            value = rangoPh.value,
            onValueChange = { rangoPh.value = it },
            placeholder = { Text(text = "Rango PH") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        TextField(
            value = porcentajeHumedad.value,
            onValueChange = { porcentajeHumedad.value = it },
            placeholder = { Text(text = "Porcentaje humedad") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = conductividad.value,
            onValueChange = { conductividad.value = it },
            placeholder = { Text(text = "Conductividad") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = observaciones.value,
            onValueChange = { observaciones.value = it },
            placeholder = { Text(text = "Observaciones") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = estado.value,
            onValueChange = { estado.value = it },
            placeholder = { Text(text = "Estado") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(10.dp))

        // on below line creating button to
        // add data to firebase firestore database.
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green),
            onClick = {
                // on below line we are validating user input parameters.
                if (TextUtils.isEmpty(idPlanta.value)) {
                    Toast.makeText(context, "Porfavor escribe el Id de la planta", Toast.LENGTH_SHORT).show()

                } else {
                    // on below line adding data to
                    // firebase firestore database.
                    addDataToFirebase(
                        idPlanta.value,
                        hojaBrote.value.toFloat(),
                        hojaIntermedia.value.toFloat(),
                        hojaMadura.value.toFloat(),
                        talloInicio.value.toFloat(),
                        talloIntermedia.value.toFloat(),
                        talloSuperior.value.toFloat(),
                        rangoPh.value.toFloat(),
                        porcentajeHumedad.value.toFloat(),
                        conductividad.value.toFloat(),
                        observaciones.value,
                        estado.value, context
                    )
                }
            },
            // on below line we are
            // adding modifier to our button.
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = "Añadir registro", modifier = Modifier.padding(8.dp))
        }
    }
}

fun addDataToFirebase(
    idPlanta: String,
    hojaBrote: Float,
    hojaIntermedia: Float,
    hojaMadura: Float,
    talloInicio: Float,
    talloIntermedia: Float,
    talloSuperior: Float,
    rangoPh: Float,
    porcentajeHumedad: Float,
    conductividad: Float,
    observaciones: String,
    estado: String,
    context: Context
) {
    // on below line creating an instance of firebase firestore.
    val db: FirebaseFirestore = FirebaseFirestore.getInstance()
    //creating a collection reference for our Firebase Firetore database.
    val dbPlantas: CollectionReference = db.collection("Plantas")
    //adding our data to our plants object class.
    val plantas = Planta(idPlanta, hojaBrote, hojaIntermedia, hojaMadura, talloInicio,
        talloIntermedia, talloSuperior, rangoPh, porcentajeHumedad, conductividad,
        observaciones, estado )

    //below method is use to add data to Firebase Firestore.
    dbPlantas.add(plantas).addOnSuccessListener {
        // after the data addition is successful
        // we are displaying a success toast message.
        Toast.makeText(
            context,
            "El registro ha sido añadido exitosamente",
            Toast.LENGTH_SHORT
        ).show()

    }.addOnFailureListener { e ->
        // this method is called when the data addition process is failed.
        // displaying a toast message when data addition is failed.
        Toast.makeText(context, "Error al añadir registro \n$e", Toast.LENGTH_SHORT).show()
    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun prevRegister(){
    SeguimientoFenológicoTheme {
        Register()
    }
}

