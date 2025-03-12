/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaherancaexemplo;

/**
 *
 * @author musas
 */
public class Professor extends Pessoa {
    String rf;
    String disciplina;
    
    Professor(String nome, String cpf, String dt_nasc, String rf, String disciplina) {
        super(nome,cpf,dt_nasc);
    this.rf = rf;
    this.disciplina = disciplina;
        
    }
}
