package no.hamre.springboot.configuration.springconfiguration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.AutoConfigurations
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringConfigurationApplication

fun main(args: Array<String>) {
	runApplication<SpringConfigurationApplication>(*args)
}
