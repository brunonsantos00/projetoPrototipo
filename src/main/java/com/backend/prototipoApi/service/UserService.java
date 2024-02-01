package com.backend.prototipoApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.prototipoApi.converter.DtoToUser;
import com.backend.prototipoApi.converter.UserToDto;
import com.backend.prototipoApi.dto.UserDTO;
import com.backend.prototipoApi.entity.User;
import com.backend.prototipoApi.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
	
	@Autowired
    private  UserRepository userRepository;
	@Autowired
    private  UserToDto userToDtoConverter;
	@Autowired
    private  DtoToUser dtoToUserConverter;

   

    public UserDTO getUserById(Long userId) {
        User user = userRepository.findById(userId).orElse(null);
        return (user != null) ? userToDtoConverter.convert(user) : null;
    }

    public List<UserDTO> getAllUsers() {
        List<User> userList = userRepository.findAll();
        return userList.stream()
                .map(userToDtoConverter::convert)
                .collect(Collectors.toList());
    }

    public UserDTO createUser(UserDTO userDTO) {
        User userToSave = dtoToUserConverter.convert(userDTO);
        User savedUser = userRepository.save(userToSave);
        return userToDtoConverter.convert(savedUser);
    }

    public UserDTO updateUser(Long userId, UserDTO userDTO) {
        User existingUser = userRepository.findById(userId).orElse(null);
        if (existingUser != null) {
            User updatedUser = dtoToUserConverter.convert(userDTO);
            updatedUser.setId(userId);
            User savedUser = userRepository.save(updatedUser);
            return userToDtoConverter.convert(savedUser);
        } else {
            return null; // Indica que o usuário não foi encontrado
        }
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
