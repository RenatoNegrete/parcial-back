package com.javeriana.parcial.parcial.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javeriana.parcial.parcial.dtos.ContratoDTO;
import com.javeriana.parcial.parcial.dtos.EntidadDTO;
import com.javeriana.parcial.parcial.servicios.ContratoService;
import com.javeriana.parcial.parcial.servicios.EntidadService;

@RestController
@RequestMapping(value = "/api/contrato")
@CrossOrigin(origins = "*")
public class ContratoController {



}
