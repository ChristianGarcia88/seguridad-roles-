package com.example.demo.usuario.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.model.Usuarios;





@RepositoryRestResource(path = "restUsuario")
public interface  RepositorioUsuario  extends  PagingAndSortingRepository<Usuarios, Integer>{
	
	@RestResource(path = "buscarUsuario")
	@Query("select    usuarios   from Usuarios usuarios  where usuarios.username=:usuarios ")
	Usuarios buscarUsuarios(@Param("usuarios")  String usuarios);

}
