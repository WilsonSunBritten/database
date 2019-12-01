package com.simple.database

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration
class DatabaseApplication

fun main(args: Array<String>) {
	runApplication<DatabaseApplication>(*args)
}
