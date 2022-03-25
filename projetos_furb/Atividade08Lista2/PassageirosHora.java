public class PassageirosHora {


    private int[][][] matriz = new int[12][30][24];

    public PassageirosHora() {}

    //Item a
    public void adiciona(int mes, int dia, int hora){
    matriz [mes][dia][hora]++;    
    } 

    public int getValor(int dia, int mes, int ano){
    return this.matriz[dia][mes][ano];
    }

    //Item b
    public int quantosPassageiros(int dia, int mes, int hora){
    return getValor(dia, mes, hora);
    }

    //Item c
    public int mesMenorFlluxo(){   
    int qtdePassageiros = 0; 
    //for(int fdia = 0;) //TODO:
    int o = 0;
    return o;
    }
}
