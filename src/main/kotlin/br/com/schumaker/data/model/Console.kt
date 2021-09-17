package br.com.schumaker.data.model

import java.util.*

data class Console(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val brand: String,
    val year: Int,
    val cpu: String,
    val gpu: String,
    val ram: String,
    val vram: String
)
