package com.example.softuefi.services;

import com.example.softuefi.models.usuariosModel;
import com.example.softuefi.repositories.IUusuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class usuariosService {
    @Autowired
    IUusuarios IUusuarios;
    //Create or Update
    public void saveOrUpdate(usuariosModel usuariosModel) {
        IUusuarios.save(usuariosModel);
    }
    //Read
    public List<usuariosModel> getUsuarios() {
        return IUusuarios.findAll();
    }
    //Read By Id
    public Optional<usuariosModel> getUsuario(Long id) {
        return IUusuarios.findById(id);
    }
    //Delete by ID
    public void deleteUsuario(Long id) {
        IUusuarios.deleteById(id);
    }
}
