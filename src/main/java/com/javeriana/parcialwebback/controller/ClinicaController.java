
package com.javeriana.parcialwebback.controller;

import com.javeriana.parcialwebback.dto.ClinicaDTO;
import com.javeriana.parcialwebback.service.ClinicaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clinicas")
@CrossOrigin("*")
public class ClinicaController {

    private final ClinicaService clinicaService;

    public ClinicaController(ClinicaService clinicaService){
        this.clinicaService = clinicaService;
    }

    @PostMapping
    public ClinicaDTO crear(@RequestBody ClinicaDTO dto) {
        return clinicaService.crear(dto);
    }

    @GetMapping
    public List<ClinicaDTO> listar() {
        return clinicaService.listar();
    }
}
