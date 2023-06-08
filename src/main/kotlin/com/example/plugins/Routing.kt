package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.freemarker.*

fun Application.configureRouting() {
    routing {
//        get("/") {
//            call.respondText("Hello World!")
//        }

        get("/") {
            call.respond(FreeMarkerContent("homePageContent.ftl", model = null))
        }

        get("/searchUsers") {
            call.respondRedirect("userDashboard")
        }

        get("/newUser") {
            call.respond(FreeMarkerContent("newUser.ftl", model = null))
        }

    }
}
