package com.javeriana.parcial.parcial.controladores;

import org.springframework.web.bind.annotation.RestController;

import com.javeriana.parcial.parcial.dtos.EntidadDTO;
import com.javeriana.parcial.parcial.servicios.EntidadService;

import org.springframework.web.bind.annotation.RequestMapping;

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



@RestController
@RequestMapping(value = "/api/entidad")
@CrossOrigin(origins = "*")
public class EntidadController {

    @Autowired
    private EntidadService entidadService;

    @GetMapping( produces = MediaType.APPLICATION_JSON_VALUE )
    public List<EntidadDTO> get() {
        return entidadService.get();
    }
    
    @GetMapping( value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public EntidadDTO get(@PathVariable long id) {
        return entidadService.get(id);
    }

    @PostMapping( produces = MediaType.APPLICATION_JSON_VALUE)
    public EntidadDTO save(@RequestBody EntidadDTO entidadDTO) throws RuntimeException {
        return entidadService.save(entidadDTO);
    }
    
    @PutMapping( produces = MediaType.APPLICATION_JSON_VALUE)
    public EntidadDTO update(@RequestBody EntidadDTO adminDTO) throws RuntimeException {
        return entidadService.update(adminDTO);
    }

    @DeleteMapping( value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE )
    public void delete(@PathVariable long id) {
        entidadService.delete(id);
    }
    
}
