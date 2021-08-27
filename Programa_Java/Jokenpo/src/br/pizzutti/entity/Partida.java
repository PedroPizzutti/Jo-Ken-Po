/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pizzutti.entity;

import java.util.Random;

/**
 *
 * @author Pedro
 */
public class Partida {
    
    private String resultado;
    
    public Partida(){
   
    }
    
    public int computador(){
        
        Random ran = new Random();
        int comp = ran.nextInt(3) + 1;
        
        return comp;
    }
    
    public String resultado(int user_choice, int com_choice){
        
        
        int user = user_choice;
        int comp = com_choice;
        
        // 1 - Pedra / 2 - Papel / 3 - Tesoura
        if(user == comp){
                    
            resultado = "EMPATE!";
            
        } else if(user == 1 && comp == 2){
                    
            resultado = "DERROTA!";
            
        } else if(user == 1 && comp == 3){
            
            resultado = "VITÓRIA!";
               
        } else if(user == 2 && comp == 3){
            
            resultado = "DERROTA!";
               
        } else if(user == 2 && comp == 1){
            
            resultado = "VITÓRIA!";
               
        } else if(user == 3 && comp == 1){
            
            resultado = "DERROTA!";
               
        } else if(user == 3 && comp == 2){
            
            resultado = "VITÓRIA!";
        }
        
        return resultado;
    }
    
}
    
