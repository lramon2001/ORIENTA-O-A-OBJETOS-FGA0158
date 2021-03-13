/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucasramon.teste.joptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Teste1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String[] opcoes= {"sim" , "não", "talvez","Lucas","Doidera"};
        
    // JOptionPane.showOptionDialog(null, "Esolha uma opcao", "Testando o painel,mano", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, "sim");
    String[] opcoes={"cadastrar saudações","Imprimir saudações existentes","Sair"};
    JOptionPane.showOptionDialog(null, "Entre com uma opção", "Menu", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
    }
    
}
