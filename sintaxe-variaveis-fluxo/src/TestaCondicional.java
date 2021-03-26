
public class TestaCondicional {

	public static void main(String[] args) {
		
		//System.out.println("testando condicionais");
		int idade  = 16;
		int quantidadePessoas = 3;
		
		if(idade >= 18) {
			System.out.println("maior de idade");
			System.out.println("Seja bem vindo");
		}else{
			if(quantidadePessoas >= 2) {
				System.out.println("você não tem 18, porém está acompanhado, pode entrar");
			}else {
			System.out.println("Infelizmente você não pode entrar");
			}
		}
	}

}
