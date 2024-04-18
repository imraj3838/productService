package com.example.priyanshu.apigetelementbyid.Service;

import com.example.priyanshu.apigetelementbyid.DTO.ProductDTO;
import org.springframework.stereotype.Service;

    @Service
    public class MockProductService implements ProductService {

        @Override
        public ProductDTO findProductById(int id) {
            ProductDTO dummyProduct = new ProductDTO();
            dummyProduct.setId(1);  // Dummy ID
            dummyProduct.setName("Dummy Product");
            dummyProduct.setDescription("This is a dummy product for testing purposes.");
            dummyProduct.setPrice(10);  // Dummy price

            return dummyProduct;
        }
    }
