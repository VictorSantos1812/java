public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		//System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		//System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		primeiraConta.agencia = 164;
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		
		segundaConta.agencia = 164;
		System.out.println("Agora a segunda conta esta na agência " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		}else {
			System.out.println("contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
