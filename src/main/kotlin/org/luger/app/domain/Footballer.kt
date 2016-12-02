package org.luger.app.domain

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import java.time.temporal.ChronoUnit
import javax.persistence.*

/**
 * Created by gerardo8 on 30/11/2016.
 */

@Entity
@Table(schema = "KOTLIN_APP", name = "FOOTBALLER")
data class Footballer (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @get:JsonProperty("_id")
        val id: Long = 0,

        @Column(nullable = false, columnDefinition = "TEXT")
        var name: String = "",

        @Column(nullable = false, columnDefinition = "TEXT")
        var nickname: String = "",

        @Column(name = "BIRTH_DATE", nullable = false)
        var birthDate: LocalDate = LocalDate.now(),

        @Column(name = "BIRTH_PLACE", nullable = false, columnDefinition = "TEXT")
        var birthPlace: String = "",

        @Column(name = "PLAYING_POSITION", nullable = false, columnDefinition = "TEXT")
        var playingPosition: String = ""
) {

    fun getAge() : Int = ChronoUnit.YEARS.between(birthDate, LocalDate.now()).toInt()

}