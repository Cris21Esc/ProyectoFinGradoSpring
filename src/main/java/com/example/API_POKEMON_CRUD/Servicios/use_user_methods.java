package com.example.API_POKEMON_CRUD.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.API_POKEMON_CRUD.Repository.users_Repository;
import com.example.API_POKEMON_CRUD.entidad.user_pokemon;

@Service
public class use_user_methods implements user_method{

	@Autowired
	private users_Repository repository;
	
	@Override
	public List<user_pokemon> allusers() {
		return repository.findAll();
	}

	@Override
	public List<user_pokemon> deleteuser(Long id) {
		repository.deleteById(id);
		return repository.findAll();
	}

	@Override
	 public List<String> getUsersWithCaughtPokemons() {
	        return repository.findUsersWithCaughtPokemons();
	    }

	@Override
	public user_pokemon findByNombre(String nombre) {
		return repository.findByNombre(nombre);
	}

	@Override
	public List<String> userswithPokemons(String username) {
		return repository.findUsersWithCaughtPokemons(username);
	}



}
