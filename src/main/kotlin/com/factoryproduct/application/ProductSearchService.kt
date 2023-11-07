package com.factoryproduct.application

import com.factoryproduct.domain.entity.ProductEntity
import com.factoryproduct.domain.exception.ProductNotFoundException
import com.factoryproduct.domain.repository.ProductJpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ProductSearchService(
    val repository: ProductJpaRepository
) {

    fun findProduct(productId: String): Response {
        val product = repository.findByIdOrNull(productId)
            ?: throw ProductNotFoundException(productId + "에 해당하는 상품을 찾을 수 없습니다.")

        println(product)

        return Response(product)
    }

    data class Response(
        val id: String,
        val productName: String,
        val productCode: String,
        val price: Long
    ) {
        constructor(product: ProductEntity) : this(
            product.id,
            product.productName,
            product.productCode.codeName,
            product.price
        )
    }
}
