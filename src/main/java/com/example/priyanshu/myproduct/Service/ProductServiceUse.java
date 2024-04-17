package com.example.priyanshu.myproduct.Service;

import com.example.priyanshu.myproduct.DTO.ProductDTO;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceUse implements ProductService {

    @Override
    public ProductDTO getProductDetails() {
        // Assume fetching product details from a database or any other data source
        ProductDTO product = new ProductDTO();
        product.setId(1L);
        product.setName("Example Product");
        product.setDescription("This is an example product description.");
        product.setPrice(19.99);
        return product;
    }
}
