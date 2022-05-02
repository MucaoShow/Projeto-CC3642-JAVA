/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.zumbi;

/**
 *
 * @author muril
 */
public class Virus{
    public boolean virus_zumbi;
    public Virus(boolean virus_zumbi) {
        this.virus_zumbi = virus_zumbi;
        if(this.virus_zumbi ==true)
            Zumbi();
        else if(this.virus_zumbi ==false)
            Humano();
    }
    public void Zumbi(){
        this.virus_zumbi = true;
    }
    public void Humano(){
        this.virus_zumbi = false;
    }
}
