package com.javi.app.springboot_crud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.javi.app.springboot_crud.entities.Role;

public interface RolRepository extends CrudRepository<Role, Long>{

}
