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
public class Quadrado extends Figura{
    double lado;

    public Quadrado() {
    }

    public Quadrado(double lado, String tipo, double perimetro, double area) {
        super(tipo, perimetro, area);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
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
        double p=getLado()*4;
        setPerimetro(p);
    }
    public void obtemArea(){
        double a=Math.pow(getLado(), 2);
        setArea(a);
    }
    
}
