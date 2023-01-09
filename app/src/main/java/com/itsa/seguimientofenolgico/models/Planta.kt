package com.itsa.seguimientofenolgico.models

data class Planta(

    var idPlanta: String,

    var hojaBrote: Float,
    var hojaIntermedia: Float,
    var hojaMadura: Float,

    var talloInicio: Float,
    var talloIntermedia: Float,
    var talloSuperior: Float,

    var rangoPh: Float,

    //Medidas quincenales
    var porcentajeHumedad: Float,
    var conductividad: Float,

    //Medidas en cada medicion
    var observaciones: String,
    var estado: String
)
