package com.example.blogsystem;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Api {
    private String message;
    private Integer status;
}
