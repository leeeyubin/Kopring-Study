package com.example.mvc.controller.get

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController          // REST API Controller 동작
@RequestMapping("/api")  // http://localhost:8080/api
class GetApiController {

    @GetMapping(path = ["/hello", "/abcd"])  // GET http://localhost:8080/api/hello, GET http://localhost:8080/api/abcd
    fun hello() = "hello kotlin"

    @RequestMapping(method = [RequestMethod.GET], path = ["/request-mapping"])
    fun requestMapping() = "request-mapping"

    @GetMapping("/get-mapping/path-variable1/{name}/{age}") // GET http://localhost:8080/api/get-mapping/path-variable1/steve/20
    fun pathVariable1(@PathVariable name: String, @PathVariable age: Int): String {
        println("${name}, ${age}")
        return "$name $age"
    }

    @GetMapping("/get-mapping/path-variable2/{name}/{age}") // GET http://localhost:8080/api/get-mapping/path-variable2/steve/20
    fun pathVariable2(
        @PathVariable(value = "name") _name: String,
        @PathVariable(name = "age") age: Int
    ): String {
        val name = "kotlin"

        println("${_name}, ${age}")
        return "$_name $age"
    }
}