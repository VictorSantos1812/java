
public class TestaEscopo {
	
	public static void main(String[] args) {
		int idade  = 18;
		int quantidadePessoas = 3;
		//boolean acompanhado = quantidadePessoas >=2 ;
		if(quantidadePessoas >= 2) {
			//aqui neste bloco if, a vari�vel foi declarada
			boolean acompanhado = true;
			// a partir do fechamento do bloco, ela n�o ir� servir
		}else {
			//novamente nesse bloco, ela foi declarada novamente
			 boolean acompanhado = false;
		}// ap�s esse fechamento ela n�o ir� servir novamente.
		
		/*System.out.println("valor de acompanhado = " + acompanhado);
		if(idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		}else{
			System.out.println("Infelizmente voc� n�o pode entrar");
			}*/
		}

}
