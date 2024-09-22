package ru.practicum.impl;

import java.util.List;

import ru.practicum.dto.NewUserRequest;
import ru.practicum.dto.UserDto;

public interface IUserService {

    public List<UserDto> findUsers(List<Long> ids, Integer from, Integer size);

    public UserDto saveUser(NewUserRequest newUserRequest);

    public void deleteUser(Long userId);
}
