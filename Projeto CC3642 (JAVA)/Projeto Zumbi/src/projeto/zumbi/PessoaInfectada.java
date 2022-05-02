/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.zumbi;

/**
 *
 * @author muril
 */
class PessoaInfectada extends Pessoa{

 
    public PessoaInfectada(int x, int y, int cor, boolean virus_zumbi){
        super(x, y, cor, virus_zumbi);
        this.virus_zumbi = true;
    }
    
}
