package com.example.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Api")

public class ControllerPrueba {

    @GetMapping
    public ResponseEntity<String> GetPruebas(){
        return ResponseEntity.ok("Maycol Jefersoon Arevalo Borrayo 7590-21-7801");

    }
}


