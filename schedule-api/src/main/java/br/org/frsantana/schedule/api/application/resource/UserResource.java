package br.org.frsantana.schedule.api.application.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<User> create(User user) {
		return new ResponseEntity<User>(userService.create(user), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<User> update(User user) {
		return new ResponseEntity<User>(userService.update(user), HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/{userId}")
	public ResponseEntity<Void> delete(@PathVariable(name = "userId") Long userId) {
		userService.delete(userId);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		return new ResponseEntity<List<User>>(userService.findAll(), HttpStatus.OK);
	}

	@GetMapping(path = "/{userId}")
	public ResponseEntity<User> findOneById(@PathVariable(name = "userId") Long userId) {
		User user = userService.findOneById(userId);

		if (user == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

}
