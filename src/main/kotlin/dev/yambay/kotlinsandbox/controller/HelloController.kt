package dev.yambay.kotlinsandbox.controller

import dev.yambay.kotlinsandbox.model.HelloModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/hello-world")
    fun helloWorld() = listOf(
            HelloModel("asd", "asdasd"),
            HelloModel(text = "asdasd")
    )
}