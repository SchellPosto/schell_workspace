public class PassageirosHora {
    
    int[][][] passageiroHora = new int[12][30][24];
    
    
    // Item A
    public void adiciona(int mes, int dia, int hora) {
        this.passageiroHora[mes-1][dia-1][hora]++;
    }
    //Item B
    public int quantosPassageiros(int dia, int mes) {
        int qtdPassageiros = 0;
        for (int i = 0; i < 24; i++) {
            qtdPassageiros += this.passageiroHora[mes-1][dia-1][i];    
        }
        return qtdPassageiros;
    }
    //Item C
    public int mesMenorFluxo() {
        int menorMes = 0, qtdMenor = 0, qtdMes = 0;
        for(int mes = 0; mes < 12; mes++) {
            for (int dia = 0; dia < 30; dia++) {
                qtdMes += this.quantosPassageiros(dia, mes);
            }
            if(qtdMes<qtdMenor) {
                menorMes = mes + 1;
                qtdMenor = qtdMes;
            }
            qtdMes = 0;
        }
        return menorMes;
    }
    //Item D
    public int[] picoTransporte () {
        int[] qtdPico = new int[3];
        int valorPico = 0;
        for(int m = 0; m < 12; m++) {
            for (int d = 0; d < 30; d++) {
                for(int h = 0; h < 24; h ++) {
                    if (this.passageiroHora[m][d][h] > valorPico) {
                        valorPico = this.passageiroHora[m][d][h];
                        qtdPico[0] = m+1;
                        qtdPico[1] = d+1;
                        qtdPico[2] = h;
                    }
                }
            }
        }
        return qtdPico;
    }
    

 

}