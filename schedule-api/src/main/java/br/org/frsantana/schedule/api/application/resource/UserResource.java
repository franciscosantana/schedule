package br.org.frsantana.schedule.api.application.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.frsantana.schedule.api.domain.entity.User;
import br.org.frsantana.schedule.api.domain.service.UserService;

@RestController
@RequestMapping("/users")
public class UserResource {

	@Autowired
	private UserService userService;

	@PostMapping
	public User create(User user) {
		return userService.create(user);
	}

	@PutMapping
	public User update(User user) {
		return userService.update(user);
	}

	@DeleteMapping(path = "/{userId}")
	public void delete(@PathVariable(name = "userId") Long userId) {
		userService.delete(userId);
	}

	@GetMapping
	public List<User> findAll() {
		return userService.findAll();
	}

	@GetMapping(path = "/{userId}")
	public User findOneById(@PathVariable(name = "userId") Long userId) {
		return userService.findOneById(userId);
	}

}
