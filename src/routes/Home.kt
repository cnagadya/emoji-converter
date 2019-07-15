package com.example.routes

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

const val HOME = "/home"

fun Route.home(){
    get(HOME){
        call.respondText("Welcome home")
    }
}