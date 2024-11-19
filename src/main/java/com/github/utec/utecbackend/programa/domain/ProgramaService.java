package com.github.utec.utecbackend.programa.domain;

import com.github.utec.utecbackend.programa.repository.ProgramaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramaService {

    @Autowired
    private ProgramaRepository programaRepository;

    public Programa findProgramaById(Long id) {
        return programaRepository.findById(id)
                .orElseThrow(RuntimeException::new);
    }

    public void deleteById(Long id) {
        programaRepository.deleteById(id);
    }

    public Long createPrograma(ProgramaCreateDto dto) {
        Programa programa = new Programa();
        programa.setNombre(dto.getNombre());
        programa.setUbicacion(dto.getUbicacion());
        programa.setTiempo(dto.getTiempo());
        programaRepository.save(programa);
        return programa.getId();
    }

    public void updatePrograma(Long id, ProgramaPutDto dto) {
        Programa programa = programaRepository.findById(id)
                .orElseThrow(RuntimeException::new);
        programa.setNombre(dto.getNombre());
        programa.setUbicacion(dto.getUbicacion());
        programa.setTiempo(dto.getTiempo());
        programaRepository.save(programa);
    }
}
