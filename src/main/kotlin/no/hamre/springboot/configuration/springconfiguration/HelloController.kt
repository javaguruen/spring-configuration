package no.hamre.springboot.configuration.springconfiguration

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.beans.factory.annotation.Value
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@RestController
class HelloController(@Value("\${prop.env}") val propEnv: String){
  
  @GetMapping(value=["/hello"])
  fun hello(): String{
    LOG.info("Hello controller")
    return "Hello from $propEnv"
  }

  companion object{
    val LOG: Logger = LoggerFactory.getLogger(HelloController::class.java)
  }
}