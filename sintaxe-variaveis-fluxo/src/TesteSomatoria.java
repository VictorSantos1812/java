
public class TesteSomatoria {
	
	public static void main(String[] args) {
		int contador = 0;
		int total = 0; /* se o total for inicializado dentro do bloco while, 
		o total iria ser 0 até que a variavel contador fosse 10, 
		logo a soma seria igual a do exercício passado.*/
		while(contador <= 10) {
			
			total += contador;
			
			System.out.println(total);
			contador++;
		}
		
		//System.out.println(total); // Quando definido fora do while, ele ira mostrar apenas a soma final dos números.
		
	}

}
