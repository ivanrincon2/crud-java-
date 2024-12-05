package com.example.softuefi.repositories;

import com.example.softuefi.models.usuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUusuarios extends JpaRepository<usuariosModel, Long> {

}
