package com.backend.prototipoApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.prototipoApi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Se necessário, você pode adicionar métodos de consulta específicos aqui
}
