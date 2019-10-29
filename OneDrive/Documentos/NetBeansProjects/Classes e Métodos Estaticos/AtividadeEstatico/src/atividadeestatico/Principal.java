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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coordenador c = new Coordenador();
        c.escola = "ETEC de Peruíbe";
        c.nome = "Cláudio Ferrini";
        Exibir.coordenador(c);
        ControleSala.abrirSala();
        c.abrirSala();
 
        System.out.println(" ");
        
        Coordenador c2 = new Coordenador();
        c2.nome = "Veridiane Arrebola";
        c2.escola = "ETEC de Peruíbe";
        Exibir.coordenador(c2);
        ControleSala.abrirSala();
        c2.abrirSala();
        
        System.out.println(" ");

        Coordenador c3 = new Coordenador();
        c3.nome = "Elisângela Xavier";
        c3.escola = "ETEC de Peruíbe";
        Exibir.coordenador(c3);
        ControleSala.abrirSala();
        c3.abrirSala();
        
        System.out.println(" ");

        Professor p = new Professor();
        p.setNome("Rodolfo Araujo");
        p.setDisciplina("TPI II, LPOO e TLBD");
        Exibir.professor(p);
        p.abrirSala();
       
        System.out.println(" ");
    
        Professor p2 = new Professor();
        p2.setNome("Jussimar Nascimento");
        p2.setDisciplina("LPOO");
        Exibir.professor(p2);
        p2.abrirSala();
        
        System.out.println(" ");
        
        Professor p3 = new Professor();
        p3.setNome("Paulo Montier");
        p3.setDisciplina("TPI II e EX- GSO");
        Exibir.professor(p3);
        p3.abrirSala();
    }
    
}
