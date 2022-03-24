/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.servicexamenuno.repository;

import edu.mx.tecnm.oaxaca.servicexamenuno.model.AlumnoModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carlos Monjaraz
 */
@Repository
public interface AlumnoRepository extends JpaRepository<AlumnoModel, Integer> {
    public AlumnoModel findByNumeroControl(String numeroControl);
}
