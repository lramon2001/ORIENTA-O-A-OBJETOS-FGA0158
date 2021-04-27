/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo10.estacionamento.classes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class CadastroVeiculos {
    
    private List<Veiculo>veiculos=new ArrayList<Veiculo>();

    public CadastroVeiculos(List<Veiculo>veiculos) {
       veiculos=new ArrayList<>();    
    }
     public CadastroVeiculos() {
       veiculos=new ArrayList<>();    
    }
    public void cadastrar(Veiculo v){
        veiculos.add(v);
    }
    public void remover(int index){
        veiculos.remove(index);
    }
    public void listarVeiculos(){
       String lista = "Carros"; ;
       
       for(Veiculo v: veiculos){
           lista+=v.getMarca()+"\n"+v.getModelo()+"\n"+v.getNumeroPlaca();
       }
        JOptionPane.showMessageDialog(null, lista);
    }
    

}
