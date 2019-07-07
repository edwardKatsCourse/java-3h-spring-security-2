package com.telran.controller;

import com.telran.model.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<UserDto> getUsers() {
        return Stream.of(
                UserDto.builder()
                        .name("John Smith")
                        .username("johns")
                        .age(44)
                        .build(),
                UserDto.builder()
                        .name("Jane Doe")
                        .username("janed")
                        .age(34)
                        .build()
        ).collect(Collectors.toList());
    }
}
