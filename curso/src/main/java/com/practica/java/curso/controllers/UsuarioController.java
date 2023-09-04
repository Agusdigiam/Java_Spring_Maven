package com.practica.java.curso.controllers;

import com.practica.java.curso.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
        @RequestMapping(value = "user")
        public Usuario getUsuario() {
            Usuario usuario = new Usuario();
            usuario.setNombre("Agustin");
            usuario.setApellido("Di Giambatista");
            usuario.setEmail("agustindigiambatista@gmail.com");
            usuario.setTelefono("2302 889966");
            return usuario;
        }
}

