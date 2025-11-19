
package com.javeriana.parcialwebback.service;

import com.javeriana.parcialwebback.dto.ClinicaDTO;
import java.util.List;

public interface ClinicaService {
    ClinicaDTO crear(ClinicaDTO dto);
    List<ClinicaDTO> listar();
}
