package com.mysite.main;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class MyUserController {
	
	private final UserRepository userRepository;
	
	MyUserController(UserRepository userRepository){
		this.userRepository = userRepository;
	}
	
	@GetMapping("/users")
	List<User> getAll(){
		return userRepository.findAll();
	}
	
	@GetMapping("/users/{id}")
	Optional<User> getUserById(@PathVariable Long id){
		return userRepository.findById(id);
	}
	
	//user registration pr sign up page
	@PostMapping("/users")
	User newUser(@RequestBody User user){
		return userRepository.save(user);
	}
	
	//deleting user based on id
	@DeleteMapping("/users/{id}")
	void deleteUserById(@PathVariable Long id){
		userRepository.deleteById(id);
	}
	
	@PutMapping("/users/{id}")
	User updateUser(@PathVariable Long id,@RequestBody User u) {
		return userRepository.findById(id).map(
				user ->{
					user.setName(u.getName());
					return userRepository.save(user);
				}).orElseGet(() ->{
					u.setId(id);
					return userRepository.save(u);
				});
	}
	
	
	

}
