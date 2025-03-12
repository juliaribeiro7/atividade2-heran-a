/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaherancaexemplo;

/**
 *
 * @author musas
 */
public class AulaHerancaExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Palloma","11111","01/11",123,"DS");
        
        System.out.println("O CPF do aluno é: " + aluno1.cpf);
        System.out.println("O nome do aluno é: " + aluno1.nome);
        System.out.println("A data de nascimento do aluno é: " + aluno1.dt_nasc);
        System.out.println("O RA do aluno é: " + aluno1.ra);
        System.out.println("O curso do aluno é: " + aluno1.curso);
    }
    
}
