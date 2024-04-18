package com.example.priyanshu.apigetelementbyid.MyProductController;

import com.example.priyanshu.apigetelementbyid.DTO.ProductDTO;
import com.example.priyanshu.apigetelementbyid.Service.MockProductService;
import com.example.priyanshu.apigetelementbyid.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;
    private MockProductService mockProductService;

    @Autowired
    public ProductController( @Qualifier("mockProductService") MockProductService mockProductService) {
        this.productService = productService;
        this.mockProductService = mockProductService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable("id") int id) {

        ProductDTO productDTO = mockProductService.findProductById(1);
        return ResponseEntity.ok(productDTO);
    }
}
