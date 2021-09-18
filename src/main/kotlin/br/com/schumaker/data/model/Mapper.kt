package br.com.schumaker.data.model
import java.util.function.BiConsumer

interface Mapper<S, T> {

    fun from(source: S): T {
        throw UnsupportedOperationException("from(S) is not implemented")
    }

    fun from(sources: Iterable<S>): List<T>? {
        return from(sources, BiConsumer<S, T> { s, t -> })
    }

    fun from(sources: Iterable<S>, postProcessor: BiConsumer<S, T>): List<T>? {
        val targetList: MutableList<T> = ArrayList()
        for (source in sources) {
            try {
                val target = from(source)
                postProcessor.accept(source, target)
                targetList.add(target)
            } catch (ex: RuntimeException) {
                println("Can not map.")
            }
        }
        return targetList
    }

    fun map(source: S, target: T) {
        throw UnsupportedOperationException("map(S, T) is not implemented")
    }
}