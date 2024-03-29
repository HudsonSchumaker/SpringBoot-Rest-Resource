package br.com.schumaker.data.model

import org.springframework.stereotype.Repository

@Repository
class ConsoleInMemoryRepository(private var consoles: HashMap<String, Console>): CommonRepository<Console, String> {

    override fun save(domain: Console): Console? {
        val result = consoles.get(domain.id)
        if (null != result) {
            consoles.remove(domain.id)
            consoles.put(domain.id, domain)
            return result;
        }

        consoles.put(domain.id, domain)
        return consoles.get(domain.id)
    }

    override fun save(domains: Collection<Console>): Iterable<Console> {
        domains.forEach(this::save)
        return findAll() // have to improve
    }

    override fun delete(domain: Console) {
        consoles.remove(domain.id)
    }

    override fun findById(id: String): Console? {
        return consoles.get(id)
    }

    override fun findAll(): Iterable<Console> {
       return consoles.values
    }
}
