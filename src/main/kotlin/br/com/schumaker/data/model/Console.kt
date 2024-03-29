package br.com.schumaker.data.model

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Console(
    @Id
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val brand: String,
    val year: Int,
    val cpu: String,
    val gpu: String,
    val ram: String,
    val vram: String
)
