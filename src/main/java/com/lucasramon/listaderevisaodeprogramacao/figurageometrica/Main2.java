/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucasramon.listaderevisaodeprogramacao.figurageometrica;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Main2 {
static Figura[] figuras;
static int opcoes;
static int opcaoEscolhida;
static int posicaoLivre;

    public static void main(String[] args) {
        //Criando o vetor de referncias;
        figuras=new Figura[50];
      
        do{
    String[] opcoes={"Fazer novo cálculo ","Consultar resultados ","Sair"};
     opcaoEscolhida=JOptionPane.showOptionDialog(null, "Entre com uma opção", "Menu", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
            
    switch(opcaoEscolhida){
        case 0:{
            String []formas={"círculo","triangulo","quadrado","retangulo"};
            int opcaoObjeto=JOptionPane.showOptionDialog(null, "Qual é a figura geométrica que desejas calcular área e perímtro", "menu", 0,JOptionPane.QUESTION_MESSAGE, null, formas, null);
            switch(opcaoObjeto){
                case 0:
                    Circulo circulo= new Circulo();
                    circulo.setTipo("Círculo");
                    String r=JOptionPane.showInputDialog("Informe o valor do raio:");
                    double raio=Double.parseDouble(r);
                    circulo.setRaio(raio);
                    circulo.obtemArea();
                    circulo.obtemPerimetro();
                    JOptionPane.showMessageDialog(null, "O valor da area  é: "+circulo.getArea()+"e o do perimetro é: " +circulo.getPerimetro());
                    figuras[posicaoLivre]=circulo;
                    posicaoLivre++;
                    break;
                case 1:
                    Triangulo triangulo= new Triangulo();
                    
                    triangulo.setTipo("Triângulo");
                    
                   double[] lados= new double[3];
                    for(int i=0;i<3;i++){
                        String l=JOptionPane.showInputDialog("Entre com o valor do lado "+(i+1));
                        double lado=Double.parseDouble(l);
                        lados[i]=lado;    
                    }
                   triangulo.setLados(lados);
               
                   triangulo.obtemPerimetro();
                    triangulo.obtemArea();
                   JOptionPane.showMessageDialog(null, "O valor da area  é: "+triangulo.getArea()+"e o do perimetro é: " +triangulo.getPerimetro());
                   figuras[posicaoLivre]=triangulo;
                   posicaoLivre++;
                   break;
                case 2:
                    Quadrado quadrado = new Quadrado();
                    quadrado.setTipo("Quadrado");
                    String ld=JOptionPane.showInputDialog("Entre com o valor do lado:");
                    double lado=Double.parseDouble(ld);
                    quadrado.setLado(lado);
                    quadrado.obtemPerimetro();
                    quadrado.obtemArea();
                     JOptionPane.showMessageDialog(null, "O valor da area  é: "+quadrado.getArea()+"e o do perimetro é: " +quadrado.getPerimetro());
                   figuras[posicaoLivre]=quadrado;
                   posicaoLivre++;
                   break;
                case 3:
                    Retangulo retangulo = new Retangulo();
                    retangulo.setTipo("Retangulo");
                    String la= JOptionPane.showInputDialog("Entre com o valor do largura: ");
                    double largura= Double.parseDouble(la);
                    retangulo.setLargura(largura);
                    String al=JOptionPane.showInputDialog("Entre com o valor da altura: ");
                    double altura=Double.parseDouble(al);
                    retangulo.setAltura(altura);
                    retangulo.obtemPerimetro();
                    retangulo.obtemArea();
                    JOptionPane.showMessageDialog(null, "O valor da area  é: "+retangulo.getArea()+"e o do perimetro é: " +retangulo.getPerimetro());
                    figuras[posicaoLivre]=retangulo;
                    posicaoLivre++;
                    break;     
            }
            break;
        }
        case 1:
        {
            String mostraResultados="Histórico de resultado dos cálculos solicitados:"+"\n\n\n";
            for(int i=0;i<figuras.length;i++){
                if(figuras[i]!=null){
                    mostraResultados+="Operacao "+"("+i+")" +"-------------------------------"+"\n\n"+
                            figuras[i].getTipo()
                            +"Area:" +figuras[i].getArea() +"\n"
                            +"Perimetro"+figuras[i].getPerimetro()+"\n"
                            ;                   
                }
                
                
            }
            JOptionPane.showMessageDialog(null, mostraResultados);
        }
       
        case 2:
        {
            
        }
        break;
    }
    
        }while (opcaoEscolhida != 2);
        JOptionPane.showMessageDialog(null, "Muito obrigado por utilizar meu software =)"+"\n"+"Atenciosamente, Lucas Ramon Alves de Oliveira.");
    }
    
}
