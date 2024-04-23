package com.example.API_POKEMON_CRUD.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.API_POKEMON_CRUD.entidad.pokemons;

@Repository
public interface pokemons_Repository extends JpaRepository<pokemons,Long> {
	
	 @Query(value = "SELECT p.* " +
             "FROM pokemons p " +
             "JOIN user_pokemon_caught upc ON p.id = upc.pokemon_id",
     nativeQuery = true)
List<pokemons>Pokemonscaught();
		
}
