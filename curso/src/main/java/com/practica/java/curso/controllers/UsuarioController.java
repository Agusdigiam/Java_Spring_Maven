package com.practica.java.curso.controllers;

import com.practica.java.curso.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class UsuarioController {
        @RequestMapping(value = "prueba")
        public String prueba(){
            return "Todo Funciona Correctamente!";
        }
        @RequestMapping(value = "acerca")
        public String acerca(){
            return "Esta prueba de pagina fue creada por Agustin Di Giambatista en Septiembre del 2023";
       }
        @RequestMapping(value = "user/{id}")
        public Usuario getUsuario(@PathVariable Long id) {
            Usuario usuario = new Usuario();
            usuario.setId(id);
            usuario.setNombre("Agustin");
            usuario.setApellido("Di Giambatista");
            usuario.setEmail("agustindigiambatista@gmail.com");
            usuario.setTelefono("2302 889966");
            return usuario;
        }
        @RequestMapping(value = "user/edit")
        public Usuario editar() {
            Usuario usuario = new Usuario();
            usuario.setNombre("Agustin");
            usuario.setApellido("Di Giambatista");
            usuario.setEmail("agustindigiambatista@gmail.com");
            usuario.setTelefono("2302 889966");
            return usuario;
        }
        @RequestMapping(value = "user/delete")
        public Usuario eliminar() {
            Usuario usuario = new Usuario();
            usuario.setNombre("Agustin");
            usuario.setApellido("Di Giambatista");
            usuario.setEmail("agustindigiambatista@gmail.com");
            usuario.setTelefono("2302 889966");
            return usuario;
        }
        @RequestMapping(value = "user/find")
        public Usuario bsucar() {
            Usuario usuario = new Usuario();
            usuario.setNombre("Agustin");
            usuario.setApellido("Di Giambatista");
            usuario.setEmail("agustindigiambatista@gmail.com");
            usuario.setTelefono("2302 889966");
            return usuario;
        }
}

