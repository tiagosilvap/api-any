package com.brincando.apiany.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductVO {
    private Long id;
    private String name;
}
