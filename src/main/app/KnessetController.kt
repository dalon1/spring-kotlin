package main.app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


data class PoliticalParty(val name: String, var leader: String, var ideology: String)

@RestController
class KnessetController {

    @GetMapping("/politics")
    fun welcome(): String = PoliticalParty("Likud",  "Bibi", "Right").toString()

    @GetMapping("/welcome")
    fun w(): String = "<h1>Dannel is here</h1><p>Testing all this things</p>"
}