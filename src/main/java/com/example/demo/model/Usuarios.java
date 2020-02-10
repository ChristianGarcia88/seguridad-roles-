package com.example.demo.model;



import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;


@Table
@Entity
public class Usuarios implements  Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer id ;
	
	@Column
	private  Boolean enabled;
	
	@Column
	private  String password;
	
	@Column(unique = true, length = 20)
	private  String  username;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column(unique = true , length = 50)
	private String email;
	
	@ManyToMany(cascade = CascadeType.ALL ,fetch = FetchType.EAGER)
	@JoinTable( name="UsuarioxRole",joinColumns = @JoinColumn(name = "id_usuario") , inverseJoinColumns = @JoinColumn(name="id_role"))
	private List<Role>  roles;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Usuarios() {}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
	
	
	

}
