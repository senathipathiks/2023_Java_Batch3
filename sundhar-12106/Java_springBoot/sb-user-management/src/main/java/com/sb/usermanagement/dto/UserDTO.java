package com.sb.usermanagement.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.sb.usermanagement.entity.Users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(content = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class UserDTO {
	
	private int statusCode;
	private String message;
	private String token;
	private String refreshToken;
	private String expirationTime;
	private Integer id;
	private String name;
	private String email;
	private String password;
	private String city;
	private String role;
	private Users users;
	private List<Users> usersList;

}
