package com.factoryproduct

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class FactoryProductApplication

fun main(args: Array<String>) {
    runApplication<FactoryProductApplication>(*args)
}
