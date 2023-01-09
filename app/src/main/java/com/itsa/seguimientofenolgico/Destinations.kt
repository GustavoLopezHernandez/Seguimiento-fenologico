package com.itsa.seguimientofenolgico

sealed class Destinations(
    val routes: String
){
    object Register: Destinations("register")
    object Consults: Destinations("destinations")
}
