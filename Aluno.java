/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaherancaexemplo;

/**
 *
 * @author musas
 */
public class Aluno extends Pessoa{
    int ra;
    String curso;
    
    Aluno(String nome, String cpf, String dt_nasc, int ra, String curso) {
        super(nome, cpf,dt_nasc);
    this.ra = ra;
    this.curso = curso;
        
        
    }
}
