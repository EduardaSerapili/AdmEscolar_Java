/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adm_escolar;

/**
 *
 * @author Admin
 */
public class Pessoa {
    
    public static String Escola = "ETEC ZL";
    String Nome;
    String Disciplina;
    String RG;
    String Turma;
   
    boolean Situacao;

    public boolean isSituacao() {
        return Situacao;
    }

    public void setSituacao(boolean Situacao) {
        this.Situacao = Situacao;
    }
    
    public String aprovacao(){
        if(this.Situacao == false){
            return "Reprovado";
        }else{
            return "Aprovado";
        }
    }
   
    public Pessoa(String Nome) {
        this.Nome = Nome;
        
    }
    
}
    
