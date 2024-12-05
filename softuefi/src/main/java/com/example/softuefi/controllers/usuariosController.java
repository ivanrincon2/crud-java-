package com.example.softuefi.controllers;

import com.example.softuefi.models.usuariosModel;
import com.example.softuefi.services.usuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/usuarios")
public class usuariosController {
    @Autowired
    private usuariosService usuariosService;
    //read
    @GetMapping
    public List<usuariosModel> getAllUsuarios() {
        return usuariosService.getUsuarios();
    }
    //Read by Id
    @GetMapping("/{usuarioId}")
    public Optional<usuariosModel> getUsuarioById(@PathVariable Long usuarioId) {
        return usuariosService.getUsuario(usuarioId);
    }
    //Create Or Uptade
    @PostMapping
    public void saveOrUpdate(@RequestBody usuariosModel usuariosModel) {
        usuariosService.saveOrUpdate(usuariosModel);
    }
    //delete
    @DeleteMapping("/{usuarioId}")
    public void deleteUsuario(@PathVariable("usuarioId") Long usuarioId) {
        usuariosService.deleteUsuario(usuarioId);
    }
}
