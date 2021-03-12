/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucasramon.listaderevisaodeprogramacao.helloword;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class HelloWorld {
    private String nome;
    private int idade;

    public HelloWorld() {
    }

    public HelloWorld(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void obtemInfo( ){
       String nome=JOptionPane.showInputDialog("Ente com o seu nome: ");
       setNome(nome);
       String ano=JOptionPane.showInputDialog("Entre com o ano atual ");
       int anoAtual=Integer.parseInt(ano);
       String nascimento=JOptionPane.showInputDialog("Entre com o ano do seu nascimento: ");
        int anoNascmimento= Integer.parseInt(nascimento);
        int confirmar=JOptionPane.showConfirmDialog(null, "Você já fez aniversário?");
        int idade=0;
        switch(confirmar){
            case 0:
                break;
            case 1:
                idade--;
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Voce cancelou!");
            case -1:
                  JOptionPane.showMessageDialog(null, "Voce fechou a aplicação");
            default :
              
             JOptionPane.showMessageDialog(null, "Inválido");
                
        }
        idade=idade+anoAtual-anoNascmimento;
       
       setIdade(idade);       
    }
    public void resposta(){
        JOptionPane.showMessageDialog(null, "Olá, "+getNome()+"! Voce possui "+getIdade()+" anos de idade");
    }
}
