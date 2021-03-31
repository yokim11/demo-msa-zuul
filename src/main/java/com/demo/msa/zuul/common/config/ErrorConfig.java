package com.demo.msa.zuul.common.config;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ErrorConfig {

    private int code;
    private String message;

}
