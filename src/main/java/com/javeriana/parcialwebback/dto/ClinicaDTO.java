
package com.javeriana.parcialwebback.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClinicaDTO {
    private Long id;
    private String nombre;
    private String direccion;
    private String telefono;
}
