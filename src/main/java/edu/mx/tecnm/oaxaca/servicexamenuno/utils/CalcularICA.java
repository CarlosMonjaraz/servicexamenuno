/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.servicexamenuno.utils;

import edu.mx.tecnm.oaxaca.servicexamenuno.model.AlumnoModel;

/**
 *
 * @author Carlos Monjaraz
 */
public class CalcularICA {
    private AlumnoModel alumnoModel;
    
    public CalcularICA(AlumnoModel alumnoModel) {
        this.alumnoModel = alumnoModel;
    }
    
    public String getICACalculado() {
        return ""+((double) alumnoModel.getCintura() / (double)alumnoModel.getAltura());
    }
    
    public String getICA() {
        double res = (double) alumnoModel.getCintura() / (double)alumnoModel.getAltura();
        return (alumnoModel.getGenero() == 'H') ?getICAH(res) :getICAM(res);
    }
    
    public String getICAH(double calculo) {
        if (calculo <= 0.34) return "Delgadez severa";
        if (calculo >= 0.35 && calculo <= 0.42) return "Delgadez leve";
        if (calculo >= 0.43 && calculo <= 0.52) return "Peso normal";
        if (calculo >= 0.53 && calculo <= 0.57) return "Sobrepeso";
        if (calculo >= 0.58 && calculo <= 0.62) return "Sobrepeso eleveado";
        return "Obesidad mórbida";
    }
    
    public String getICAM(double calculo) {
        if (calculo <= 0.34) return "Delgadez severa";
        if (calculo >= 0.35 && calculo <= 0.41) return "Delgadez leve";
        if (calculo >= 0.42 && calculo <= 0.48) return "Peso normal";
        if (calculo >= 0.49 && calculo <= 0.53) return "Sobrepeso";
        if (calculo >= 0.54 && calculo <= 0.57) return "Sobrepeso eleveado";
        return "Obesidad mórbida";
    }
}