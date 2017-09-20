package com.coderscampus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderscampus.domain.User;
import com.coderscampus.repository.UserRepository;

@Controller
public class HibernateController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "user", method = RequestMethod.GET)
	private @ResponseBody List<User> getUsers() {
		return userRepository.findAll();
	}

	@RequestMapping(value = "user", method = RequestMethod.POST)
	private @ResponseBody User createUser(@RequestParam String userName, @RequestParam String password) {
		User user = new User();
		user.setUsername(userName);
		user.setPassword(password);

		user = userRepository.save(user);
		return user;
	}
	
	@RequestMapping(value = "user/{id}", method = RequestMethod.POST)
	private @ResponseBody User updateUser(@PathVariable Long id, @RequestParam String userName, @RequestParam String password) {
		User user = userRepository.findOne(id);
		
		user.setUsername(userName);
		user.setPassword(password);

		userRepository.save(user);
		return user;
	}
	
	@RequestMapping(value="user/{id}", method= RequestMethod.DELETE)
	private @ResponseBody void deleteUser(@PathVariable Long id){
		userRepository.delete(id);
	}
}
