/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adm_escolar;

/**
 *
 * @author Admin
 */
public class Escola {
    
    public static void main(String args[]){
        
        Professor prof1 = new Professor ("Vagner");
        prof1.Disciplina = "Matemática";
        prof1.RG = "26.351.651-6";
                
        Professor prof2 = new Professor ("Carlos");
        prof2.Disciplina = "Gramática";
        prof2.RG = "56.065.354-7";
        
        Professor prof3 = new Professor ("João");
        prof3.Disciplina = "Biologia";
        prof3.RG = "86.345.094-2";
        
        Aluno aluno1 = new Aluno ("Rodrigo");
        aluno1.RG = "58.365.394-2";
        aluno1.Turma = "1° A";
        aluno1.Situacao = true;
        
        Aluno aluno2 = new Aluno ("Tarcisio");
        aluno2.RG = "25.352.785-2";
        aluno2.Turma = "2° C";
        aluno2.Situacao = false;
        
        Aluno aluno3 = new Aluno ("Maria");
        aluno3.RG = "28.321.123-9";
        aluno3.Turma = "1° B";
        aluno3.Situacao = true;
        
        Aluno aluno4 = new Aluno ("Marcus");
        aluno4.RG = "01.320.452-2";
        aluno4.Turma = "2° A";
        aluno4.Situacao = true;
        
        
        System.out.println("Escola: "+prof1.Escola + "\n\n");
        
        System.out.println("Disciplina: "+ prof1.Disciplina + "\n");
        System.out.println("Professor: "+prof1.Nome + "; RG: "+prof1.RG);
        System.out.println("Aluno: "+aluno1.Nome + "; RG: " +aluno1.RG + "; Turma: "+aluno1.Turma + "; Situação: "+ aluno1.aprovacao());
        System.out.println("Aluno: "+aluno2.Nome + "; RG: " +aluno2.RG + "; Turma: "+aluno2.Turma + "; Situação: "+ aluno2.aprovacao());
        System.out.println("Aluno: "+aluno3.Nome + "; RG: " +aluno3.RG + "; Turma: "+aluno3.Turma + "; Situação: "+ aluno3.aprovacao());
        System.out.println("Aluno: "+aluno4.Nome + "; RG: " +aluno4.RG + "; Turma: "+aluno4.Turma + "; Situação: "+ aluno4.aprovacao());

        
        
        System.out.println("\n\n" + "Disciplina: "+ prof2.Disciplina + "\n");
        System.out.println("Professor: "+prof2.Nome + "; RG: "+prof2.RG);
        System.out.println("Aluno: "+aluno1.Nome + "; RG: " +aluno1.RG + "; Turma: "+aluno1.Turma + "; Situação: "+ aluno1.aprovacao());
        System.out.println("Aluno: "+aluno2.Nome + "; RG: " +aluno2.RG + "; Turma: "+aluno2.Turma + "; Situação: "+ aluno2.aprovacao());
        System.out.println("Aluno: "+aluno3.Nome + "; RG: " +aluno3.RG + "; Turma: "+aluno3.Turma + "; Situação: "+ aluno3.aprovacao());
        System.out.println("Aluno: "+aluno4.Nome + "; RG: " +aluno4.RG + "; Turma: "+aluno4.Turma + "; Situação: "+ aluno4.aprovacao());
        
        
        System.out.println("\n\n Disciplina: "+ prof3.Disciplina + "\n");
        System.out.println("Professor: "+prof3.Nome  + "; RG: "+prof3.RG);
        System.out.println("Aluno: "+aluno1.Nome + "; RG: " +aluno1.RG + "; Turma: "+aluno1.Turma + "; Situação: "+ aluno1.aprovacao());
        System.out.println("Aluno: "+aluno2.Nome + "; RG: " +aluno2.RG + "; Turma: "+aluno2.Turma + "; Situação: "+ aluno2.aprovacao());
        System.out.println("Aluno: "+aluno3.Nome + "; RG: " +aluno3.RG + "; Turma: "+aluno3.Turma + "; Situação: "+ aluno3.aprovacao());
        System.out.println("Aluno: "+aluno4.Nome + "; RG: " +aluno4.RG + "; Turma: "+aluno4.Turma + "; Situação: "+ aluno4.aprovacao());
        
    }
}
