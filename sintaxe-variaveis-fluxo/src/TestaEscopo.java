
public class TestaEscopo {
	
	public static void main(String[] args) {
		int idade  = 18;
		int quantidadePessoas = 3;
		//boolean acompanhado = quantidadePessoas >=2 ;
		if(quantidadePessoas >= 2) {
			//aqui neste bloco if, a variável foi declarada
			boolean acompanhado = true;
			// a partir do fechamento do bloco, ela não irá servir
		}else {
			//novamente nesse bloco, ela foi declarada novamente
			 boolean acompanhado = false;
		}// após esse fechamento ela não irá servir novamente.
		
		/*System.out.println("valor de acompanhado = " + acompanhado);
		if(idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		}else{
			System.out.println("Infelizmente você não pode entrar");
			}*/
		}

}
