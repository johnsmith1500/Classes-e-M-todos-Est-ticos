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
public class Professor {
private String nome;
private String disciplina;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public void abrirSala(){
       System.out.println("A sala está aberta! Vamos para a Aula!");
   }
    
  

}
