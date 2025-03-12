/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaherancaexemplo;

/**
 *
 * @author musas
 */
public class Funcionario extends Pessoa {
    String rgm;
    String cargo;
    
    Funcionario (String nome, String cpf, String dt_nasc, String rgm, String cargo) {
        super(nome,cpf,dt_nasc);
    this.rgm = rgm;
    this.cargo = cargo;
    }
}
