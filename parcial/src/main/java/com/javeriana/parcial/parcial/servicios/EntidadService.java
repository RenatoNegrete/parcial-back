package com.javeriana.parcial.parcial.servicios;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javeriana.parcial.parcial.dtos.EntidadDTO;
import com.javeriana.parcial.parcial.entidades.Entidad;
import com.javeriana.parcial.parcial.repositorios.EntidadRepository;

@Service
public class EntidadService {

    EntidadRepository entidadRepository;
    ModelMapper modelMapper;

    @Autowired
    public EntidadService(EntidadRepository entidadRepository, ModelMapper modelMapper) {
        this.entidadRepository = entidadRepository;
        this.modelMapper = modelMapper;
    }

    public EntidadDTO get(long id) {
        Entidad entidad = entidadRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Entidad no encontrada con id: " + id));
        return modelMapper.map(entidad, EntidadDTO.class);
    }

    public List<EntidadDTO> get() {
        List<Entidad> entidades = (List<Entidad>) entidadRepository.findAll();
        List<EntidadDTO> entidadDTOs = entidades.stream()
                                                .map(entidad -> modelMapper.map(entidad, EntidadDTO.class))
                                                .toList();
        return entidadDTOs;
    }

    public EntidadDTO save(EntidadDTO entidadDTO) {
        Entidad entidad = modelMapper.map(entidadDTO, Entidad.class);
        entidad = entidadRepository.save(entidad);
        entidadDTO.setId(entidad.getId());
        return entidadDTO;
    }

    public EntidadDTO update(EntidadDTO entidadDTO) throws RuntimeException {
        Optional<Entidad> entidadOptional = entidadRepository.findById(entidadDTO.getId());
        if (entidadOptional.isEmpty()) {
            throw new NoSuchElementException("Entidad no encontrada con id: " + entidadDTO.getId());
        }
        Entidad entidad = entidadOptional.get();
        entidad = modelMapper.map(entidadDTO, Entidad.class);
        entidad = entidadRepository.save(entidad);
        return modelMapper.map(entidad, EntidadDTO.class);
    }

    public void delete(long id) {
        entidadRepository.deleteById(id);
    }

}
