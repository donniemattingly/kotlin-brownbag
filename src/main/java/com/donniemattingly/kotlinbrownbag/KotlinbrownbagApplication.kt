package com.donniemattingly.kotlinbrownbag

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class KotlinbrownbagApplication

fun main(args: Array<String>) {
  SpringApplication.run(KotlinbrownbagApplication::class.java, *args)
}
