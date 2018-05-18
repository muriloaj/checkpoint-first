package com.github.muriloaj.checkpoint.first.controller

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*
import kotlin.math.log

@RestController
@RequestMapping("/info")
public class Hello {

    val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/hello/{name}")
    fun hello(@PathVariable name: String): String {

        var textReturn = "Hello ${name}"

        log.trace("The return will be ' $textReturn ' ")
        log.debug("The return will be ' $textReturn ' ")
        log.info("The return will be ' $textReturn ' ")
        log.warn("The return will be ' $textReturn ' ")
        log.error("The return will be ' $textReturn ' ")


        return textReturn
    }
}
