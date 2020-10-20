package com.example.ymlconfig

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import java.util.List

@Configuration
@ConfigurationProperties("wc")
class CheckerProperties {
    lateinit var  name : String
    lateinit var repos: List<Repo>
    override fun toString(): String {
        return "CheckerProperties(name='$name', repos=$repos)"
    }
}

class Repo {
    var id: String = ""
    var url: String = ""
    override fun toString(): String {
        return "Repo(id='$id', url='$url')"
    }
}