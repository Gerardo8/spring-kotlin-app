package org.luger.app.repository

import org.luger.app.domain.Footballer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

/**
* Created by gerardo8.
*/
@RepositoryRestResource(path = "footballer")
interface FootballerRepository : JpaRepository<Footballer, Long> {

    @RestResource(path = "name")
    fun findByNameIgnoringCase(@Param("name") name: String) : List<Footballer>

    @RestResource(path = "nickname")
    fun findByNicknameIgnoringCase(@Param("nickname") lastName: String) : List<Footballer>
}