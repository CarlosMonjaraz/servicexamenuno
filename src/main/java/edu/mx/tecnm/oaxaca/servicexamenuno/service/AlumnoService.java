/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.servicexamenuno.service;

import edu.mx.tecnm.oaxaca.servicexamenuno.model.AlumnoModel;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Carlos Monjaraz
 */
public interface AlumnoService {
    public Map<String, String> calcaularICAAlumno(AlumnoModel alumno);
}