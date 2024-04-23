package com.example.API_POKEMON_CRUD.entidad;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="pokemons")

public class pokemons {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column (name="num_pokedex")
	private String num_pokedex;
	
	@Column (name="nombre")
	private String nombre;
	
	@Column (name="tipo")
	private String tipo;
	
	@Column (name="rareza")
	private String rareza;
	
	@Column (name="caught")
	private boolean caught;
	
	@Column (name="hp")
	private int hp;
	
	@Column (name="atk")
	private int atk;
	
	@Column (name="atk_esp")
	private int atk_esp;
	
	@Column (name="def")
	private int def;
	
	@Column (name="def_esp")
	private int def_esp;
	
	@Column (name="vel")
	private int vel;
	
	@ManyToMany(mappedBy="pokemons_usuarios")
	private List<user_pokemon> users;
	
	public pokemons(Long id, String num_pokedex, String nombre, String tipo, String rareza, boolean caught, int hp,
			int atk, int atk_esp, int def, int def_esp, int vel,
			List<com.example.API_POKEMON_CRUD.entidad.user_pokemon> user_pokemon) {
		super();
		this.id = id;
		this.num_pokedex = num_pokedex;
		this.nombre = nombre;
		this.tipo = tipo;
		this.rareza = rareza;
		this.caught = caught;
		this.hp = hp;
		this.atk = atk;
		this.atk_esp = atk_esp;
		this.def = def;
		this.def_esp = def_esp;
		this.vel = vel;
	}

	public pokemons() {
		
	}

	public pokemons(Long id, String num_pokedex, String nombre, String tipo, String rareza, boolean caught, int hp,
			int atk, int atk_esp, int def, int def_esp, int vel) {
		super();
		this.id = id;
		this.num_pokedex = num_pokedex;
		this.nombre = nombre;
		this.tipo = tipo;
		this.rareza = rareza;
		this.caught = caught;
		this.hp = hp;
		this.atk = atk;
		this.atk_esp = atk_esp;
		this.def = def;
		this.def_esp = def_esp;
		this.vel = vel;
	}
	
	public pokemons(String num_pokedex, String nombre, String tipo, String rareza, boolean caught, int hp,
			int atk, int atk_esp, int def, int def_esp, int vel) {
	
		this.num_pokedex = num_pokedex;
		this.nombre = nombre;
		this.tipo = tipo;
		this.rareza = rareza;
		this.caught = caught;
		this.hp = hp;
		this.atk = atk;
		this.atk_esp = atk_esp;
		this.def = def;
		this.def_esp = def_esp;
		this.vel = vel;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNum_pokedex() {
		return num_pokedex;
	}

	public void setNum_pokedex(String num_pokedex) {
		this.num_pokedex = num_pokedex;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRareza() {
		return rareza;
	}

	public void setRareza(String rareza) {
		this.rareza = rareza;
	}

	public boolean isCaught() {
		return caught;
	}

	public void setCaught(boolean caught) {
		this.caught = caught;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getAtk_esp() {
		return atk_esp;
	}

	public void setAtk_esp(int atk_esp) {
		this.atk_esp = atk_esp;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getDef_esp() {
		return def_esp;
	}

	public void setDef_esp(int def_esp) {
		this.def_esp = def_esp;
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

}
