package com.example.API_POKEMON_CRUD.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.API_POKEMON_CRUD.Repository.pokemons_Repository;
import com.example.API_POKEMON_CRUD.entidad.pokemons;

@Service
public class use_pokemons_method implements pokemon_methods {

	@Autowired
	private pokemons_Repository repository;
	
	@Override
	public List<pokemons> allpokemons() {
		
		return repository.findAll();
	}

	@Override
	public List<pokemons> deletepokemons(Long id) {
		
		repository.deleteById(id);
		return repository.findAll();
		}

	@Override
	public List<pokemons> pokemonscaught() {
		// TODO Auto-generated method stub
		return repository.Pokemonscaught();
	}

}
