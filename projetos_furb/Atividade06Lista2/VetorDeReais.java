public class VetorDeReais {	
	
	private double[] vetor;
	
	public VetorDeReais(int tamanho) 
	{
		this.vetor = new double[tamanho];
	}
	
	//Item A
	public void setValor(double valor, int posicao) 
    {
		this.vetor[posicao] = valor;
	}
	
	//Item B
	public int verPares() 
    {
		int quantidade = 0;
		for(int i = 0; i < this.vetor.length; i++) 
		{
			int v = (int) vetor[i]; // ficar apenas com a parte inteira fazendo "Cast" 
			if(v %2 == 0 ) // é par?
			{
			quantidade++;
			}
		}
		return quantidade;
	}
	
	public int getTamanho() 
    {
		return this.vetor.length;
	}
	
	public double getValor(int posicao) 
    {
		return this.vetor[posicao];
	}

	//Item C
	public VetorDeReais divisao(VetorDeReais b) 
    {
        if (this.getTamanho() != b.getTamanho()) {
            return null;
        }
		VetorDeReais novo = new VetorDeReais(this.getTamanho());
		for(int i = 0; i < this.getTamanho(); i++) {
			double valor = vetor[i] / b.getValor(i);
			novo.setValor(valor, i);
		}
		return novo;
    }

    //Item D
    public double multiplicacao(VetorDeReais outro){
    double m = 0;
    for(int i = 1, j = outro.getTamanho()-1; i < this.getTamanho(); i++, j--)
    {
       
        m = m + this.getValor(i) * outro.getValor(j);
    }
    return m;
    }

    //Item E
    public void inversao(){ //TODO: Pegar no GitHub do Marcel

    double[] novoVetor = new double [vetor.length];

    for(int i = 0, j = this.vetor.length; i < this.vetor.length; i++ , j--){
        novoVetor[i] = vetor[j];
    }
     vetor = novoVetor;
    }

    //Item F
    public double maiorDiferenca(){
    double a, b;
    b = 0;
    for(int i = 0, j = i+1; j < this.vetor.length; i++, j++){
        a = this.vetor[i] - this.vetor[i+1];
        if( a < 0) { b = a * -1;}
        if( a < b ){b = a;}
    }
    return b;
    }
}
