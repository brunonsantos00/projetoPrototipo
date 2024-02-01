package com.backend.prototipoApi.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.backend.prototipoApi.dto.UserDTO;
import com.backend.prototipoApi.entity.User;

@Component
public class UserToDto implements Converter<User,UserDTO>  {

	@Override
	public UserDTO convert(User source) {
		return new UserDTO(source);
	}
	


}