package com.kornix.mbank_api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MBankApiApplication

fun main(args: Array<String>) {
	runApplication<MBankApiApplication>(*args)
}
