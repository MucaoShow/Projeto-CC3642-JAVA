/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.zumbi;

/**
 *
 * @author muril
 */
import java.util.Random;

public class Pessoa extends Virus implements IMovable {
    /*------------Da as Cordenadas x,y e mostra a cor do elemento-------------------*/
    protected int x,y,cor;
    protected float time;
    /*-------------Construtor------------------*/

    public Pessoa(int x, int y, int cor, boolean virus_zumbi) {
        super(virus_zumbi);
        this.x = x;
        this.y = y;
        this.cor = cor;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }
   
    public void moveUp(){
        y = y - 1;
    }
    public void moveDown(){
        y = y + 1;
    }
    public void moveRight(){
        x = x + 1;
    }
    public void moveLeft(){
        x = x - 1;
    }
    
    @Override
    public void mover(){
        Random gerador = new Random();
        int pararandom = 999999999;
        int NumRandom = gerador.nextInt(pararandom);
        if(NumRandom%2 == 1){
            /*--------PARTE IMPAR RANDOMICA-------*/
            NumRandom = gerador.nextInt(pararandom);
            if(NumRandom%2 == 1){
                /*--------PARTE IMPAR RANDOMICA-------*/
                moveUp();
            }
            else{
                /*--------PARTE PAR RANDOMICA-------*/
                moveLeft();
            }
        }
        else{
            /*--------PARTE PAR RANDOMICA-------*/
            NumRandom = gerador.nextInt(pararandom);
            if(NumRandom%2 == 1){
                /*--------PARTE IMPAR RANDOMICA-------*/
                moveDown();
            }
            else{
                /*--------PARTE PAR RANDOMICA-------*/
                moveRight();
            }
        }
    }
    public void verificaVirus(int valida){
        if(valida== 1){
            this.cor = 6;
            Zumbi();
        }
        else if(valida== 0){
            this.cor = 5;
            Humano();
        }
    }
    
        
}
