/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeestatico;

/**
 *
 * @author Usuário
 */
public class Exibir {
    
public static void professor(Professor p){
    System.out.println("Professor: " + p.getNome());
    System.out.println("Disciplina: "+ p.getDisciplina());
}
public static void coordenador(Coordenador c){
    System.out.println("Coordenador: " + c.nome);
    System.out.println("Escola: "+ c.escola);
}
}
