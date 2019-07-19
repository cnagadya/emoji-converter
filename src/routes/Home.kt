package com.example.routes

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

const val HOME = "/"

fun Route.home(){
    //get dsl takes the path string as first param and body lambda as its second
    get(HOME){
        call.respondText("Welcome home")
    }
}