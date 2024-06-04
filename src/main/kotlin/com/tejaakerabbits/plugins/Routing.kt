package com.tejaakerabbits.plugins

import com.tejaakerabbits.routes.randomRabbit
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {


        randomRabbit()


        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
