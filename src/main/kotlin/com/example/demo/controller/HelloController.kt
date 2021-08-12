package com.example.demo.controller

import com.example.demo.model.Employee
import org.springframework.web.bind.annotation.*

@RestController
class HelloController {

    @PostMapping("/employee")
    fun hello(@RequestBody employee: Employee): String {
        return "Hello ${employee.name}"
    }

    @GetMapping("/hello")
    fun hello(@RequestParam name: String): String {
        return "Hello $name"
    }
}