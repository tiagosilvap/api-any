package com.brincando.apiany.controller;

import com.brincando.apiany.vo.ProductVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    
    @RequestMapping("/product")
    public ProductVO getProduct() {
        ProductVO product = ProductVO.builder()
                .id(1L)
                .name("Fique rico ou morra tentando")
                .build();
        return product;
    }
}
