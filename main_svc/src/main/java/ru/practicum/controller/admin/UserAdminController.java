package ru.practicum.controller.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import ru.practicum.dto.NewUserRequest;
import ru.practicum.dto.UserDto;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/admin/users")
@RequiredArgsConstructor
public class UserAdminController {

    @GetMapping
    public List<UserDto> findUsers(
            @RequestParam(name = "ids") Integer ids,
            @RequestParam(name = "from") Integer from,
            @RequestParam(name = "size") Integer size) {
        return null;
    }

    @PostMapping
    public UserDto saveUser(@Valid @RequestBody NewUserRequest newUserRequest) {

        return null;
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId) {

    }
}
