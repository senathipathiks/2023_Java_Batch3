package com.sb.usermanagement.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sb.usermanagement.dto.UserDTO;
import com.sb.usermanagement.entity.Users;
import com.sb.usermanagement.repository.UserRepo;

@Service
@Transactional
public class UserManagementService {

	private UserRepo repo;
	private JWTUtils jwtUtils;
	private AuthenticationManager authenticationManager;
	private PasswordEncoder encoder;
	private BCryptPasswordEncoder encoder2;
	

	@Autowired
	public UserManagementService(UserRepo repo, JWTUtils jwtUtils, AuthenticationManager authenticationManager,
			PasswordEncoder encoder, BCryptPasswordEncoder encoder2) {
		super();
		this.repo = repo;
		this.jwtUtils = jwtUtils;
		this.authenticationManager = authenticationManager;
		this.encoder = encoder;
		this.encoder2 = encoder2;
	}



	public UserManagementService() {
		super();

	}

	

	// save or register the user in the database
	public UserDTO register(UserDTO userDTO) {

		UserDTO userResp = new UserDTO();

		try {
			Users users = new Users();
			users.setName(userDTO.getName());
			users.setEmail(userDTO.getEmail());
			users.setRole(userDTO.getRole());
			users.setCity(userDTO.getCity());
			users.setPassowrd(encoder.encode(userDTO.getPassword()));
			System.out.println(encoder2.encode(userDTO.getPassword()));
			Users userDetails = repo.save(users);

			if (userDetails.getId() > 0) {
				userResp.setUsers(userDetails);
				userResp.setStatusCode(200);
				userResp.setMessage("user registered successfully..!");
			}
		} catch (Exception e) {
			userResp.setStatusCode(500);
			userResp.setMessage(e.getMessage());
		}
		return userResp;
	}

	// login authentication
	public UserDTO login(UserDTO loginRequest) {

		UserDTO dto = new UserDTO();

		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));
			var user = repo.findByEmail(loginRequest.getEmail()).orElseThrow();
			var jwt = jwtUtils.generateToken(user);
			var refreshToken = jwtUtils.refreshToken(new HashMap<>(), user);
			dto.setStatusCode(200);
			dto.setToken(jwt);
			dto.setRole(user.getRole());
			dto.setRefreshToken(refreshToken);
			dto.setExpirationTime("24 Hours");
			dto.setMessage("Login verification successfull..!");
		} catch (Exception e) {

			dto.setStatusCode(500);
			dto.setMessage(e.getMessage());

		}
		
		return dto;

	}
	
	//refresh Token
	public UserDTO refreshToken(UserDTO refreshTokenReqiest){
		
        UserDTO response = new UserDTO();
        try{
            String ourEmail = jwtUtils.extractUsername(refreshTokenReqiest.getToken());
            Users users = repo.findByEmail(ourEmail).orElseThrow();
            if (jwtUtils.isTokenValid(refreshTokenReqiest.getToken(), users)) {
                var jwt = jwtUtils.generateToken(users);
                response.setStatusCode(200);
                response.setToken(jwt);
                response.setRefreshToken(refreshTokenReqiest.getToken());
                response.setExpirationTime("24Hr");
                response.setMessage("Successfully Refreshed Token");
            }
            response.setStatusCode(200);
            return response;

        }catch (Exception e){
        	e.printStackTrace();
            response.setStatusCode(500);
            response.setMessage(e.getMessage());
            return response;
        }
    }


    public UserDTO getAllUsers() {
        UserDTO dto = new UserDTO();

        try {
            List<Users> result = repo.findAll();
            if (!result.isEmpty()) {
                dto.setUsersList(result);
                dto.setStatusCode(200);
                dto.setMessage("Successful");
            } else {
                dto.setStatusCode(404);
                dto.setMessage("No users found");
            }
            return dto;
        } catch (Exception e) {
            dto.setStatusCode(500);
            dto.setMessage("Error occurred: " + e.getMessage());
            return dto;
        }
    }


    public UserDTO getUsersById(Integer id) {
        UserDTO dto = new UserDTO();
        try {
            Users usersById = repo.findById(id).orElseThrow(() -> new RuntimeException("User Not found"));
            System.out.println("decoded password:"+encoder);
            dto.setUsers(usersById);
            dto.setStatusCode(200);
            dto.setMessage("Users with id '" + id + "' found successfully");
        } catch (Exception e) {
            dto.setStatusCode(500);
            dto.setMessage("Error occurred: " + e.getMessage());
        }
        return dto;
    }


    public UserDTO deleteUser(Integer userId) {
        UserDTO dto = new UserDTO();
        try {
            Optional<Users> userOptional = repo.findById(userId);
            if (userOptional.isPresent()) {
                repo.deleteById(userId);
                dto.setStatusCode(200);
                dto.setMessage("User deleted successfully");
            } else {
                dto.setStatusCode(404);
                dto.setMessage("User not found for deletion");
            }
        } catch (Exception e) {
            dto.setStatusCode(500);
            dto.setMessage("Error occurred while deleting user: " + e.getMessage());
        }
        return dto;
    }

    public UserDTO updateUser(Integer userId, UserDTO updatedUser) {
        UserDTO dto = new UserDTO();
        try {
            Optional<Users> userOptional = repo.findById(userId);
            if (userOptional.isPresent()) {
                Users existingUser = userOptional.get();
                existingUser.setEmail(updatedUser.getEmail());
                existingUser.setName(updatedUser.getName());
                existingUser.setCity(updatedUser.getCity());
                existingUser.setRole(updatedUser.getRole());

                // Check if password is present in the request
                if (updatedUser.getPassword() != null && !updatedUser.getPassword().isEmpty()) {
                    // Encode the password and update it
                    existingUser.setPassowrd(encoder.encode(updatedUser.getPassword()));
                }

                Users savedUser = repo.save(existingUser);
                dto.setUsers(savedUser);
                dto.setStatusCode(200);
                dto.setMessage("User updated successfully");
            } else {
                dto.setStatusCode(404);
                dto.setMessage("User not found for update");
            }
        } catch (Exception e) {
            dto.setStatusCode(500);
            dto.setMessage("Error occurred while updating user: " + e.getMessage());
        }
        return dto;
    }


    public UserDTO getMyInfo(String email){
        UserDTO dto = new UserDTO();
        try {
			Optional<Users> userOptional = repo.findByEmail(email);
            if (userOptional.isPresent()) {
            	System.out.println("from find by email ");
                dto.setUsers(userOptional.get());
                dto.setStatusCode(200);
                dto.setMessage("successful");
            } else {
                dto.setStatusCode(404);
                dto.setMessage("User not found for update");
            }

        }catch (Exception e){
            dto.setStatusCode(500);
            dto.setMessage("Error occurred while getting user info: " + e.getMessage());
        }
        return dto;

    }

}
