package com.example.API_POKEMON_CRUD.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.API_POKEMON_CRUD.entidad.user_pokemon;

@Repository
public interface users_Repository extends JpaRepository<user_pokemon,Long>{

	user_pokemon findByNombre(String nombre);
	
	 @Query(value = "SELECT p.num_pokedex " +
             "FROM user_pokemon u " +
             "JOIN user_pokemon_caught upc ON u.id = upc.user_pokemon_id " +
             "JOIN pokemons p ON upc.pokemon_id = p.id",
     nativeQuery = true)
	 List<String> findUsersWithCaughtPokemons();
	 
	 
	 @Query(value = "SELECT p.num_pokedex " +
             "FROM user_pokemon u " +
             "JOIN user_pokemon_caught upc ON u.id = upc.user_pokemon_id " +
             "JOIN pokemons p ON upc.pokemon_id = p.id " +
             "WHERE u.nombre = :username",
     nativeQuery = true)
    List<String> findUsersWithCaughtPokemons(@Param("username") String username);

}
