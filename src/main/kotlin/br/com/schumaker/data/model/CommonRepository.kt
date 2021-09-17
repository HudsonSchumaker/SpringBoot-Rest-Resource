package br.com.schumaker.data.model

interface CommonRepository<T> {
    fun save(domain: T): T
    fun save(domains: Collection<T>): Iterable<T>
    fun delete(domain: T)
    fun findById(id: String): T
    fun findAll(): Iterable<T>
}