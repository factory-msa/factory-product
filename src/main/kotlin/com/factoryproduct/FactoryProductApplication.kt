package com.factoryproduct

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FactoryProductApplication

fun main(args: Array<String>) {
    runApplication<FactoryProductApplication>(*args)
}
