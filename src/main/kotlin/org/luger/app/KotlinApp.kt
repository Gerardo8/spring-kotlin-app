package org.luger.app

import org.luger.app.domain.Footballer
import org.luger.app.repository.FootballerRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import java.time.LocalDate

/**
 * Created by gerardo8 on 30/11/2016.
 */

@SpringBootApplication
open class KotlinApp {

    @Bean
    open fun init(repository: FootballerRepository) = CommandLineRunner {

        repository.save(Footballer(
                name = "Steven George Gerrard",
                nickname = "Stevie G",
                birthDate = LocalDate.of(1980, 5, 30),
                birthPlace = "Whiston, England",
                playingPosition = "Midfielder"
        ))
        repository.save(Footballer(
                name = "Frank James Lampard",
                nickname = "Super Frankie",
                birthDate = LocalDate.of(1978, 6, 20),
                birthPlace = "London, England",
                playingPosition = "Midfielder"
        ))
        repository.save(Footballer(
                name = "Zinedine Yazid Zidane",
                nickname = "Zizou",
                birthDate = LocalDate.of(1972, 6, 23),
                birthPlace = "Marseille, France",
                playingPosition = "Attacking midfielder"
        ))
        repository.save(Footballer(
                name = "Ronaldo de Assis Moreira",
                nickname = "Ronaldinho",
                birthDate = LocalDate.of(1980, 3, 21),
                birthPlace = "Porto Alegre, Brazil",
                playingPosition = "Attacking midfielder"
        ))
        repository.save(Footballer(
                name = "Cristiano Ronaldo dos Santos Aveiro",
                nickname = "CR7",
                birthDate = LocalDate.of(1985, 2, 5),
                birthPlace = "Madeira, Portugal",
                playingPosition = "Striker"
        ))
        repository.save(Footballer(
                name = "Gerardo López Reyes",
                birthDate = LocalDate.of(1993, 8, 26),
                birthPlace = "México City, México",
                playingPosition = "Midfielder"
        ))

    }

}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinApp::class.java, *args)
}