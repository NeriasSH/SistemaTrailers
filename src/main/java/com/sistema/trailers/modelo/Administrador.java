package com.sistema.trailers.modelo;

import javax.persistence.*;

@Entity
public class Administrador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_administrador")
	private Integer id;

	@Column(name = "username", nullable = false, unique = true)
	private String username;

	@Column(name = "password", nullable = false)
	private String password;

	// Constructores
	public Administrador() {
	}

	public Administrador(Integer id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public Administrador(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// Getters y Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
