package com.factoryproduct.domain.entity

import support.domain.BaseTimeEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "FACTORY_PRODUCT")
class ProductEntity(

    @Id
    @Column(name = "PRODUCT_ID", nullable = false)
    val id: String,

    @Column(name = "PRODUCT_NAME", nullable = false)
    val productName: String,

    @Enumerated(value = EnumType.STRING)
    @Column(name = "PRODUCT_CODE", nullable = false)
    val productCode: ProductCode,

    @Column(name = "PRICE", nullable = false)
    val price: Long

) : BaseTimeEntity() {

}
