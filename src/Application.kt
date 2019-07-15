package com.example

import com.example.routes.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    routing {
        //get dsl takes the path string as first param and body lambda as its second
        get("/") {
            call.respondText { "hello world" }
        }
        home()

    }
}

