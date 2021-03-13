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
public class Triangulo extends Figura {
    double [] lados;

    public Triangulo() {
    }

    public Triangulo(String tipo, double perimetro, double area) {
        super(tipo, perimetro, area);
    }

    public Triangulo(double[] lados, String tipo, double perimetro, double area) {
        super(tipo, perimetro, area);
        this.lados = lados;
    }

    public double[] getLados() {
        return lados;
    }

    public void setLados(double[] lados) {
        this.lados = lados;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double getPerimetro() {
        return perimetro;
    }

    @Override
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }
   
    public void obtemPerimetro(){
        double p;
        p=lados[0]+lados[1]+lados[2];
        setPerimetro(p);
        
    }
    public void obtemArea(){
        double a;
        double s=(getPerimetro())/2;
        a=Math.sqrt(s*(s-lados[0])*(s-lados[1])*(s-lados[2]));
        setArea(a);
    }
    
    
    
}
