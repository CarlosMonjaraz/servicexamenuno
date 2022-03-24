/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.servicexamenuno.implement.service;

import edu.mx.tecnm.oaxaca.servicexamenuno.model.AlumnoModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.mx.tecnm.oaxaca.servicexamenuno.service.AlumnoService;
import edu.mx.tecnm.oaxaca.servicexamenuno.repository.AlumnoRepository;
import edu.mx.tecnm.oaxaca.servicexamenuno.utils.CalcularICA;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Carlos Monjaraz
 */
@Service
public class AlumnoServiceImplement implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;


    @Override
    public Map<String, String> calcaularICAAlumno(AlumnoModel alumnoModel) {
        Map<String, String> map = new HashMap<String, String>();
        if (alumnoModel.getCintura() == null || alumnoModel.getAltura() == null) {
            AlumnoModel auxAlumno = alumnoRepository.findByNumeroControl(alumnoModel.getNumeroControl());
            if (auxAlumno != null) {
                CalcularICA calcularICA = new CalcularICA(auxAlumno);
                map.put("ica", calcularICA.getICACalculado());
                map.put("nivel", calcularICA.getICA());
                return map;
            } else {
                map.put("ica", "--");
                map.put("nivel", "Sin datos");
                return map;
            }
        } else {
            alumnoRepository.save(alumnoModel);
            CalcularICA calcularICA = new CalcularICA(alumnoModel);
            map.put("ica", calcularICA.getICACalculado());
            map.put("nivel", calcularICA.getICA());
            return map;
        }
    }
}