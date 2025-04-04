package com.example.lab1.controller;


import com.example.lab1.Beans.RaceSession;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.lab1.Beans.RaceConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
@RequestMapping("/carrera")
public class carrera_control {
    private List<RaceConfig> guardar = new ArrayList<>();
    private static final List<RaceConfig> tortugas = Arrays.asList(
            new RaceConfig("Tortuga1", 5, 1, 4, 0, ""),
            new RaceConfig("Tortuga2", 3, 2, 3, 0, ""),
            new RaceConfig("Tortuga3", 2, 1, 1, 0, "")
    );

    @GetMapping("/configurar")
    public String mostrarFormulario(Model modelo) {
        modelo.addAttribute("configuracionCarrera", new RaceConfig());
        modelo.addAttribute("tortugas", tortugas);
        return "configuracion";
    }
    @PostMapping("/iniciar")
    public String iniciarCarrera(@ModelAttribute RaceConfig configuracionCarrera, Model modelo) {
        List<RaceConfig> competidores = new ArrayList<>(tortugas);
        competidores.sort(Comparator.comparingDouble(t ->
                -RaceSession.calcularRendimiento(t.getVelocidad(), t.getResistencia(), t.getSuerte()))
        );
        return "resultado";
    }
}


