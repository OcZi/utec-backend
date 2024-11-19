package com.github.utec.utecbackend.programa.application;

import com.github.utec.utecbackend.Fibonacci;
import com.github.utec.utecbackend.programa.domain.Programa;
import com.github.utec.utecbackend.programa.domain.ProgramaCreateDto;
import com.github.utec.utecbackend.programa.domain.ProgramaPutDto;
import com.github.utec.utecbackend.programa.domain.ProgramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/programa")
public class ProgramaController {

    @Autowired
    private ProgramaService programaService;

    @GetMapping("/{id}")
    public ResponseEntity<Programa> get(Long id) {
        return ResponseEntity.ok(programaService.findProgramaById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> put(Long id, ProgramaPutDto dto) {
        programaService.updatePrograma(id, dto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Programa> delete(Long id) {
        programaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/")
    public ResponseEntity<Programa> post(ProgramaCreateDto dto) {
        programaService.createPrograma(dto);
        return ResponseEntity.created(URI.create("/programa/" + dto.getNombre())).build();
    }

    @GetMapping("/fib")
    public ResponseEntity<Long> fib(int n) {
        return ResponseEntity.ok(Fibonacci.fib(n));
    }
}
