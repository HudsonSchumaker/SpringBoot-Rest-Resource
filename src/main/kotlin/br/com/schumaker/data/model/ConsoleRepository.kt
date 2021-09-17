package br.com.schumaker.data.model

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface ConsoleRepository: CrudRepository<Console, String> {

    fun findByBrand(@Param("brand") brand: String): List<Console>
    fun findByYear(@Param("year") year: Int): List<Console>
}