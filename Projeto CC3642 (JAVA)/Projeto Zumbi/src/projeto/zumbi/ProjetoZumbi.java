/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto.zumbi;

/**
 *
 * @author muril
 */


public class ProjetoZumbi {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Saudavel,Contaminado, Reproducao;
        var m = new Mundo(1,1,2,true);
        System.out.println("Simulação Zumbi");
        //Pessoas saudaveis no mundo
        Saudavel = 100;
        //Pessoas doentes/contaminadas no mundo
        Contaminado = 2;
        //Velocidade do programa 
        Reproducao = 500;
        
       
       
        
        m.GeraPessoasRandom(Contaminado,Saudavel);
        
        while(true){
            m.AtualizaMundo();
            try{
                Thread.sleep(Reproducao);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}