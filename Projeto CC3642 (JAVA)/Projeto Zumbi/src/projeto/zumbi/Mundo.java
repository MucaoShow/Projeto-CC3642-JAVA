/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.zumbi;

/**
 *
 * @author muril
 */
import java.util.ArrayList;
import java.util.Random;
public class Mundo extends Pessoa {
    ArrayList<PessoaSaudavel> ListaPSaud = new ArrayList<PessoaSaudavel> ();
    ArrayList<PessoaSaudavel> ListaVacZum = new ArrayList<PessoaSaudavel> ();
    ArrayList<PessoaInfectada> ListaPDoent = new ArrayList<PessoaInfectada> ();
    public Mundo(int x, int y, int cor, boolean virus_zumbi) {
        super(x, y, cor, virus_zumbi);
    }
    public int[][] GeradorMapa(){
    int[][] MapaZerado = new int[][]
    {
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
        return MapaZerado;
    }
    public boolean GeraPessoas(int valida){
        Random gerador = new Random();
        int CordX,Cordy;
        if(valida==1){
            /*--------GERA PESSOAS Doente RANDOMICA GeraPessoas(0);--------*/
            CordX = gerador.nextInt(60);
            Cordy = gerador.nextInt(30);
            PessoaInfectada pessoalocal = new PessoaInfectada(CordX,Cordy,3,true);
            return ListaPDoent.add(pessoalocal);
        }
        if(valida==0){
            /*--------GERA PESSOA Saudavel RANDOMICA GeraPessoas(1);--------*/
            CordX = gerador.nextInt(60);
            Cordy = gerador.nextInt(30);
            PessoaSaudavel pessoalocal = new PessoaSaudavel(CordX,Cordy,2,false);
            return ListaPSaud.add(pessoalocal);
        }
        return true;
    }
    public boolean GeraPessoas(int valida,int CordX,int Cordy,PessoaSaudavel ps,float tempo){
        if(valida ==3){/*--------GERA PESSOAS Doente GeraPessoas(3,CordX,CordY,aux);--------*/
            ListaPSaud.remove(ps);/*Removo ela da lista de Doente*/
            PessoaInfectada pessoalocal = new PessoaInfectada(CordX,Cordy,3,true);
            pessoalocal.time = (int) tempo;
            return ListaPDoent.add(pessoalocal);
        }
        return true;
    }
    public boolean GeraPessoas(int valida,int CordX,int Cordy,PessoaInfectada pd){
        if(valida ==4){/*--------GERA PESSOA Saudavel GeraPessoas(4,CordX,CordY,aux);--------*/
            ListaPDoent.remove(pd);/*Removo ela da lista de Doente*/
            PessoaSaudavel pessoalocal = new PessoaSaudavel(CordX,Cordy,2,false);
            return ListaPSaud.add(pessoalocal);
        }
        return true;
    }
    public void TestBorda(PessoaInfectada ps){
        if(ps.x>59){ps.x=0;}
        else if(ps.x<0){ps.x=59;}
        else if(ps.y>30){ps.y=0;}
        else if(ps.y<0){ps.y=30;}
    }
    public void TestBorda(PessoaSaudavel ps){
        if(ps.x>59){ps.x=0;}
        else if(ps.x<0){ps.x=59;}
        else if(ps.y>30){ps.y=0;}
        else if(ps.y<0){ps.y=30;}
    }
    public void CalculaMovimento(){
        /*--------Gerador de mapa------------*/
        int [][] mapa = GeradorMapa();
        
        for(var ps:ListaPSaud){
        /*-------Calcula o Movimento Randomico---------*/
        ps.mover();
        /*-------Teste da Borda---------*/
        TestBorda(ps);
        /*--------Legenda das Variavies------------*/
        int coluna = ps.x,linha = ps.y;
        /*-------------Lê o valor de Linha/Coluna-----------------*/
        switch(mapa[linha][coluna]){
            case 4:
                /*-------No Hospital------*/
                if(ps.curado == true){
                    break;
                }
                else{
                    ps.vacina(true);
                    break;
                }
        }
        
        }
        
        for (var pd : ListaPDoent) {
        /*-------Calcula o Movimento Randomico---------*/
            pd.mover();
        /*-------Teste da Borda---------*/
            TestBorda(pd);
    
        }
    }
    int total=0;
    public void GeraPessoasRandom(int doente,int Saudavel){
      this.total = Saudavel + doente;
        for(int i = 0;i<total;i++){
            if(i <= Saudavel){
                GeraPessoas(0);
            }
            else{
                GeraPessoas(1);
            }
       }
    }
    public int PessoasVacinadas(){
        int contador = 0;
         for(var ps:ListaPSaud){
            if(ps.curado == true){
                contador++;
              }
         }
        return contador;
    }
    public int PessoasVacinadasZumbi(){
        int contador = 0;
         for(var ps:ListaPSaud){
             if(ps.curado == true && ps.virus_zumbi == true){
                    contador++;
            }
         }
        return contador;
    }
    public void PessoasMortas(float tempo){
        OUTER:
        for (var pd : ListaPDoent) {
            if((pd.time+30) == tempo/2){
                ListaPDoent.remove(pd);
                break OUTER;
            }
        }
    }
    public void ZumbiTempo(float tempo){
        Outro:
        for (var pd : ListaPSaud) {
            if(pd.curado == true && pd.virus_zumbi == true){
                if((pd.time+30) == tempo/2){
                    verificaVirus(0);
                    ListaVacZum.remove(pd);
                    break Outro;
                }
            }
        }
    }
    public void AtualizaMundo(){
        CalculaMovimento();
        DesenhaMundo();
   }
    float tempo;
    public void DesenhaMundo(){
        int [][] mapa = GeradorMapa();
        OUTER:
        for(var ps:ListaPSaud){
            int CordX=ps.x,CordY=ps.y;
            PessoasMortas(tempo);
            ZumbiTempo(tempo);
            for (var pd : ListaPDoent) {
                if(ps.curado == true && ps.virus_zumbi == true){
                    break;
                }
                if(ps.curado==true){
                    if(ps.x == pd.x && ps.y == pd.y || ps.x == pd.x+1 && ps.y == pd.y || ps.x == pd.x-1 && ps.y == pd.y || ps.y == pd.y+1 && ps.x == pd.x || ps.y == pd.y-1 && ps.x == pd.x){
                        ListaVacZum.add(ps);
                        ps.verificaVirus(1);
                        ps.time = tempo;
                    }
                }
                else{
                    for(var pvc:ListaVacZum){
                        if(ps.x == pvc.x && ps.y == pvc.y || ps.x == pvc.x+1 && ps.y == pvc.y || ps.x == pvc.x-1 && ps.y == pvc.y || ps.y == pvc.y+1 && ps.x == pvc.x || ps.y == pvc.y-1 && ps.x == pvc.x){
                            GeraPessoas(3,CordX,CordY,ps,tempo);
                            break OUTER;
                        }
                    }
                    if(ps.x == pd.x && ps.y == pd.y || ps.x == pd.x+1 && ps.y == pd.y || ps.x == pd.x-1 && ps.y == pd.y || ps.y == pd.y+1 && ps.x == pd.x || ps.y == pd.y-1 && ps.x == pd.x){
                        GeraPessoas(3,CordX,CordY,ps,tempo);
                        break OUTER;
                    }
                }
            }
        }
        for(var ps:ListaPSaud){
            int coluna = ps.x,linha = ps.y;
            mapa[linha][coluna] = ps.cor;
        }
        for (var pd : ListaPDoent) {
            int coluna = pd.x,linha = pd.y;
            mapa[linha][coluna] = pd.cor;
        }
        int TotalVacinado = PessoasVacinadas();
        int TotalVacinadoZumbi = PessoasVacinadasZumbi();
        System.out.println("");
        System.out.print("Tempo Simulação:");
        System.out.println(tempo/2 +" Segundos");/*Valores Dinâmicos*/
        System.out.print("\033[45m \033[0m");
        System.out.print(" Pessoas Saudáveis:");
        System.out.println(ListaPSaud.size()-TotalVacinado);/*Valores Dinâmicos*/
        System.out.print("\033[43m \033[0m");/*Cor Amarelo*/
        System.out.print(" Zumbis: ");
        System.out.println(ListaPDoent.size());/*Valores Dinâmicos*/
        System.out.print("\033[44m \033[0m");/*Cor Azul*/
        System.out.print(" Pessoas Vacinadas: ");
        System.out.println(TotalVacinado-TotalVacinadoZumbi);/*Valores Dinâmicos*/
        System.out.print("\033[46m \033[0m");
        System.out.print(" Pessoas Vacinadas contra o Virus Zumbi: ");
        System.out.println(ListaVacZum.size());/*Valores Dinâmicos*/
        System.out.print("\033[41m\033[0m");
        System.out.print(" Total de Mortos: ");
        System.out.println(this.total-((ListaPSaud.size())+(ListaPDoent.size())));/*Valores Dinâmicos*/
        System.out.print(" Total de Pessoas:");
        System.out.println((ListaPSaud.size())+(ListaPDoent.size()));/*Valores Dinâmicos*/
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for (int[] mapa1 : mapa) {
            for (int j = 0; j < mapa1.length; j++) {
                switch (mapa1[j]) {
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        /*-----------Cor Branca----------*/
                        System.out.print("\033[47m \033[0m");
                        break;
                    case 2:
                        /*-----------Cor Magenta----------*/
                        System.out.print("\033[45m \033[0m");
                        break;
                    case 3:
                        /*-----------Cor Amarelo----------*/
                        System.out.print("\033[43m \033[0m");
                        break;  
                    case 4:
                        /*-----------Cor Verde----------*/
                        System.out.print("\033[42m \033[0m");
                        break;
                    case 5:
                        /*-----------Cor Azul----------*/
                        System.out.print("\033[44m \033[0m");
                        break;
                    case 6:
                        /*-----------Cor Azul----------*/
                        System.out.print("\033[46m \033[0m");
                        break; 
                }
            }
            System.out.println();
        }
        tempo++;
    }
    
}
