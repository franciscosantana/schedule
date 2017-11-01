package br.org.frsantana.schedule.api.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.org.frsantana.schedule.api.domain.entity.User;
import br.org.frsantana.schedule.api.domain.repository.UserRepository;

@Service("userDetailsService")
public class UserService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	public User create(User user) {
		return userRepository.save(user);
	}

	public User update(User user) {
		return userRepository.save(user);
	}

	public void delete(Long userId) {
		userRepository.delete(userId);
	}

	public User findOneById(Long userId) {
		return userRepository.findOne(userId);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepository.findOneByUsername(username);
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}
}