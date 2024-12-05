package com.example.softuefi.repositories;

import com.example.softuefi.models.equiposModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUequipos extends JpaRepository<equiposModel, Long> {
}
