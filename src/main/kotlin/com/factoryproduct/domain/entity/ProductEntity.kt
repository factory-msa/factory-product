package com.factoryproduct.domain.entity

import support.domain.BaseTimeEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "FACTORY_PRODUCT")
class ProductEntity(

    @Id
    @Column(name = "PRODUCT_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    @Column(name = "PRODUCT_NAME", nullable = false)
    var productName: String,

    @Enumerated(value = EnumType.STRING)
    @Column(name = "PRODUCT_CODE", nullable = false)
    var productCode: ProductCode,

) : BaseTimeEntity() {

}
