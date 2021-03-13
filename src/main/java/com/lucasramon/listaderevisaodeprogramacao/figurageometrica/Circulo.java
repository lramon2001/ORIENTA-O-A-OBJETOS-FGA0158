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
public class Circulo extends Figura{
    private double pi=3;
    private double raio;

    public Circulo(double raio, String tipo, double perimetro, double area) {
        super(tipo, perimetro, area);
        this.raio = raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {
    }

   

    

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
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

    /**
     *
     * @param area
     */
    @Override
    public void setArea(double area) {
        this.area = area;
    }
    
    public void obtemPerimetro(){
        double p;
        p=getPi()*getRaio();
        setPerimetro(p);
    }
    
    public void obtemArea()
    {
        double a;
        a=getPi()*getRaio()*getRaio();
        setArea(a);
    }
    
    
    
}
