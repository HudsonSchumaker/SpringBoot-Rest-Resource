package br.com.schumaker.data.model

import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
class ConsoleRepository(var consoles: HashMap<String, Console>): CommonRepository<Console> {

    override fun save(domain: Console): Console? {
        val console = consoles.get(domain.id)
        if (null != console) {
            return console
        }

        consoles.put(domain.id, domain)
        return consoles.get(domain.id)
    }

    override fun save(domains: Collection<Console>): Iterable<Console> {
        domains.forEach(this::save)
        return findAll()
    }

    override fun delete(domain: Console) {
       consoles.remove(domain.id)
    }

    override fun findById(id: String): Console {
        return consoles.getOrDefault(id, Console(
            id = "",
            name = "",
            brand = "",
            year = 0,
            cpu = "",
            gpu = "",
            ram = "",
            vram = "")
        )
    }

    override fun findAll(): Iterable<Console> {
        return consoles.values
    }
}