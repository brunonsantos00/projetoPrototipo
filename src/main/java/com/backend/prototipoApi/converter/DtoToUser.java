package com.backend.prototipoApi.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.backend.prototipoApi.dto.UserDTO;
import com.backend.prototipoApi.entity.User;

@Component
public class DtoToUser implements Converter<UserDTO,User> {

	@Override
	public User convert(UserDTO source) {
		return new User(source);
	}
	

	
}
