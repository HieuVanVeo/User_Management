package com.micronaut.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("api/home")
class HomeController {

    @Get("/")
    fun home(): String {
        return "hello"
    }
}