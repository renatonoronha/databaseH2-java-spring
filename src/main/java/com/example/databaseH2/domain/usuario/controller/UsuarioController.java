package com.example.databaseH2.domain.usuario.controller;

import com.example.databaseH2.domain.usuario.Usuario;
import com.example.databaseH2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> consultaPorId(@PathVariable Long id){
        return ResponseEntity.ok(usuarioRepository.findById(id).get());
    }
}
