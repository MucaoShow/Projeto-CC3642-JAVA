/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.zumbi;

/**
 *
 * @author muril
 */
class PessoaSaudavel extends Pessoa {
    public boolean curado = false;
    
    
    public PessoaSaudavel(int x, int y, int cor, boolean virus_zumbi){
        super(x, y, cor, virus_zumbi);
    }
    
    public boolean vacina(boolean bool){
        this.cor = 5;
        return this.curado = true;
        
    }
}
