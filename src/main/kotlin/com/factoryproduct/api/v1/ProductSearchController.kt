package com.factoryproduct.api.v1

import com.factoryproduct.api.dto.ApiResponse
import com.factoryproduct.application.ProductSearchService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/v1")
@RestController
class ProductSearchController(
    private val service: ProductSearchService
) {

    @GetMapping("/products/{productId}")
    fun findProduct(
        @PathVariable productId: String
    ): ApiResponse<ProductSearchService.Response> {

        return ApiResponse.ok(
            service.findProduct(productId)
        )
    }

}
