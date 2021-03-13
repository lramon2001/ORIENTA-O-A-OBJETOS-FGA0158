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
public class Retangulo extends Figura {
    double altura;
    double largura;

    public Retangulo() {
    }

    public Retangulo(double altura, double largura, String tipo, double perimetro, double area) {
        super(tipo, perimetro, area);
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
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
        p=2*getAltura()+2*getLargura();
        setPerimetro(p);
    }
    public void obtemArea(){
        double a;
        a=getLargura()*getAltura();
        setArea(a);
    }
}
