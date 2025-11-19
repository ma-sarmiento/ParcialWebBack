
package com.javeriana.parcialwebback.service.impl;

import com.javeriana.parcialwebback.dto.ClinicaDTO;
import com.javeriana.parcialwebback.model.Clinica;
import com.javeriana.parcialwebback.repository.ClinicaRepository;
import com.javeriana.parcialwebback.service.ClinicaService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicaServiceImpl implements ClinicaService {

    private final ClinicaRepository clinicaRepository;
    private final ModelMapper mapper;

    public ClinicaServiceImpl(ClinicaRepository clinicaRepository, ModelMapper mapper){
        this.clinicaRepository = clinicaRepository;
        this.mapper = mapper;
    }

    @Override
    public ClinicaDTO crear(ClinicaDTO dto) {
        Clinica entity = mapper.map(dto, Clinica.class);
        Clinica saved = clinicaRepository.save(entity);
        return mapper.map(saved, ClinicaDTO.class);
    }

    @Override
    public List<ClinicaDTO> listar() {
        return clinicaRepository.findAll()
                .stream()
                .map(c -> mapper.map(c, ClinicaDTO.class))
                .toList();
    }
}
