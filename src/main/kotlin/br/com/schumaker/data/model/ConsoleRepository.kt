package br.com.schumaker.data.model

import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
class ConsoleRepository(var consoles: HashMap<String, Console>): CommonRepository<Console> {


    override fun save(domain: Console): Console {
        TODO("Not yet implemented")
    }

    override fun save(domains: Collection<Console>): Iterable<Console> {
        TODO("Not yet implemented")
    }

    override fun delete(domain: Console) {
       consoles.remove(domain.id)
    }

    override fun findById(id: String): Console {
        TODO("Not yet implemented")
    }

    override fun findAll(): Iterable<Console> {
        TODO("Not yet implemented")
    }
}