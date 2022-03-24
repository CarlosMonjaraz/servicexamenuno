/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.servicexamenuno.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Carlos Monjaraz
 */
@Entity
@Table(name = "alumno")
public class AlumnoModel implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPersona;
    private String numeroControl;
    private Character genero;
    private Integer cintura;
    private Integer altura;

    public Integer getIdPersona() { return idPersona; }

    public void setIdPersona(Integer idPersona) { this.idPersona = idPersona; }

    public String getNumeroControl() { return numeroControl; }

    public void setNumeroControl(String numeroControl) { this.numeroControl = numeroControl; }

    public Character getGenero() { return genero; }

    public void setGenero(Character genero) { this.genero = genero; }

    public Integer getCintura() { return cintura; }

    public void setCintura(Integer cintura) { this.cintura = cintura; }

    public Integer getAltura() { return altura; }

    public void setAltura(Integer altura) { this.altura = altura; }
}