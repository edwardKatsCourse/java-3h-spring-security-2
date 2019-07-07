package com.telran.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class UserDto {

    private Long id;
    private String username;
    private String name;
    private Integer age;

}
