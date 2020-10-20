package com.example.ymlconfig

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class YmlConfigApplication {
}

fun main(args: Array<String>) {
    runApplication<YmlConfigApplication>(*args)
}


@Component
class My: CommandLineRunner {
    @Autowired
    lateinit var checkerProperties: CheckerProperties

    override fun run(vararg args: String?) {
        print(checkerProperties)
    }

}