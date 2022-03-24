/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.servicexamenuno.controller;

import edu.mx.tecnm.oaxaca.servicexamenuno.model.AlumnoModel;
import edu.mx.tecnm.oaxaca.servicexamenuno.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import edu.mx.tecnm.oaxaca.servicexamenuno.service.AlumnoService;

/**
 *
 * @author Carlos Monjaraz
 */
@RestController
@RequestMapping("/api/v1/alumno")
public class CalcularController {
    @Autowired
    private AlumnoService alumnoService;
    
    @PostMapping("/")
    public CustomResponse calcularICA(@RequestBody AlumnoModel alumnoModel) {
        CustomResponse customResponse = new CustomResponse();
        alumnoService.calcaularICAAlumno(alumnoModel);
        customResponse.setData(alumnoService.calcaularICAAlumno(alumnoModel));
        return customResponse;
    }
}