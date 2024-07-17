package com.metaphorce.databaseLib.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String name;
    private String lastname;
    private String email;
    private String phone;
    private Integer age;
    private String role;
}