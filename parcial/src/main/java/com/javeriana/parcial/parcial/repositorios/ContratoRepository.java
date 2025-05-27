package com.javeriana.parcial.parcial.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javeriana.parcial.parcial.entidades.Contrato;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Long> {

}
