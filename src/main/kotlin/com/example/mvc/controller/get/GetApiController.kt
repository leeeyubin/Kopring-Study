package com.example.mvc.controller.get

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController          // REST API Controller 동작
@RequestMapping("/api")  // http://localhost:8080/api
class GetApiController {

    @GetMapping("/hello")  // http://localhost:8080/api/hello
    fun hello() = "hello kotlin"

}