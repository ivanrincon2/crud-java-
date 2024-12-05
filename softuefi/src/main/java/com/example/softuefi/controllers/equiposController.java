package com.example.softuefi.controllers;

import com.example.softuefi.models.equiposModel;
import com.example.softuefi.services.equiposService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/equipos")
public class equiposController {
    @Autowired
    private equiposService equiposService;
    //Read
    @GetMapping
    public List<equiposModel>getAllEquipos() {
        return equiposService.getAllEquipos();
    }
    //Read by id
    @GetMapping("/{equipoId}")
    public Optional<equiposModel> getEquipoById(@PathVariable Long equipoId) {
        return equiposService.getEquipo(equipoId);

    }
    //Create Or Update
    @PostMapping
    public void saveOrUpdate(@RequestBody equiposModel equiposModel) {
        equiposService.saveOrUpdate(equiposModel);
    }
    //Delete
    @DeleteMapping("/{equipoId}")
    public void deleteEquipo(@PathVariable("equipoId") Long equipoId) {
        equiposService.deleteEquipo(equipoId);
    }
}
