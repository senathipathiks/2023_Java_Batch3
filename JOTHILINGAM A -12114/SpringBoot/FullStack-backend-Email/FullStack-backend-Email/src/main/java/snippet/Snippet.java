package snippet;

public class Snippet {
	   @PostMapping("/register")
	    public ResponseEntity<?> registerUser(@RequestBody User user) {
	        // Logic for registering user
	        userRepository.save(user);
	        return ResponseEntity.ok("User registered successfully");
	    }
	 
	    @PostMapping("/login")
	    public ResponseEntity<?> loginUser(@RequestBody User user) {
	        // Logic for logging in user
	        User existingUser = userRepository.findByUsername(user.getUsername());
	        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
	            return ResponseEntity.ok("Login successful");
	        } else {
	            return ResponseEntity.badRequest().body("Invalid username or password");
	        }
	    }
	}
}

