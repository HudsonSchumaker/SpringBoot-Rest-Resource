package br.com.schumaker.data.model

import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface ConsoleRepository: CrudRepository<Console, String> {


}