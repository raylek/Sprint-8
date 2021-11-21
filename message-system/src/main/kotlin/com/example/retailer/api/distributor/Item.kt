package com.example.retailer.api.distributor

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Описание товара
 */
@Entity
@Table(name = "items")
data class Item(
    /**
     * Произвольный идентификатор
     */
    @Id
    val id: Long,

    /**
     * Произвольное название
     */
    val name: String
)