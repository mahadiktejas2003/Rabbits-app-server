package com.tejaakerabbits.routes

import com.tejaakerabbits.data.model.Rabbit
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


//now u've constructed rabbuts in Rabbit.kt=> now we need to think about when we actually construct these rabbits-
//we need to know Our BASE URL or the Server URL and Image URLs.
//so what are these-let's see:

private const val BASE_URL="http://192.168.239.172:8080"//ip address of the pc : port number we're listening to


//add list of rabbits


//this class/variable below is acting like the UI state.
private val rabbits =
    listOf(
        Rabbit("Carl", "A cute brown rabbit","$BASE_URL/rabbits/rabbit1.jpg"),
        Rabbit("Bella", "A cute brown rabbit","$BASE_URL/rabbits/rabbit2.jpg"),
        Rabbit("Max", "A cute brown rabbit","$BASE_URL/rabbits/rabbit3.jpg"),
        Rabbit("Charlie", "A cute brown rabbit","$BASE_URL/rabbits/rabbit4.jpg"),
        Rabbit("Lucy", "A cute brown rabbit","$BASE_URL/rabbits/rabbit5.jpg")

    )


fun Route.randomRabbit() {
    get("/randomrabbit"){
            call.respond(
                HttpStatusCode.OK,
                rabbits.random()//change methods in this.
            )
    }
}