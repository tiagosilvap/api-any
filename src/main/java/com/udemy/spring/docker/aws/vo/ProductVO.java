package com.udemy.spring.docker.aws.vo;

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
