package com.example.priyanshu.myproduct.MyProductController;

import com.example.priyanshu.myproduct.DTO.ProductDTO;
import com.example.priyanshu.myproduct.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/Product")
@RestController
public class ProductController {

    @Autowired
    private ProductService productServic;

    @GetMapping("/details")
    public ProductDTO ProductController(){
        return productServic.getProductDetails();
    }

}


