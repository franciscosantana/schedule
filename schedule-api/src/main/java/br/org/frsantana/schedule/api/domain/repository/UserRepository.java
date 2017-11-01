package br.org.frsantana.schedule.api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.frsantana.schedule.api.domain.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findOneByUsername(String username);
}
