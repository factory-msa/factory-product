package com.factoryproduct.domain.repository

import com.factoryproduct.domain.entity.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ProductJpaRepository: JpaRepository<ProductEntity, String> {
}
