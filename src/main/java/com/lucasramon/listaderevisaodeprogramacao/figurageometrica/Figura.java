/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucasramon.listaderevisaodeprogramacao.figurageometrica;

/**
 *
 * @author Lucas
 */
public class Figura {
    protected String tipo;
    protected double perimetro;
    protected double area;

    public Figura() {
    }

    public Figura(String tipo, double perimetro, double area) {
        this.tipo = tipo;
        this.perimetro = perimetro;
        this.area = area;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

 

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
}
