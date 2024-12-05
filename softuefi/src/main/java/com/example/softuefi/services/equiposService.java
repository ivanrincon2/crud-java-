package com.example.softuefi.services;

import com.example.softuefi.models.equiposModel;
import com.example.softuefi.repositories.IUequipos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class equiposService {
    @Autowired
    IUequipos IUequipos;
    //Create or Update
    public void saveOrUpdate(equiposModel equiposModel) {
        IUequipos.save(equiposModel);
    }
    //Read
    public List<equiposModel> getAllEquipos() {
        return IUequipos.findAll();
    }
    //Read By Id
    public Optional<equiposModel> getEquipo(Long id) {
        return IUequipos.findById(id);
    }
    //Delete by id
    public void deleteEquipo(Long id) {
        IUequipos.deleteById(id);
    }
}
