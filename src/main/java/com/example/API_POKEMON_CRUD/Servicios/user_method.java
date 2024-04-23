package com.example.API_POKEMON_CRUD.Servicios;

import java.util.List;

import com.example.API_POKEMON_CRUD.entidad.user_pokemon;

public interface user_method {
	
	public List<user_pokemon> allusers();
	
	public List<user_pokemon> deleteuser(Long id);
	
	List<String> getUsersWithCaughtPokemons();
	
	user_pokemon findByNombre(String nombre);
	
   public List<String> userswithPokemons(String username);
	 
}
