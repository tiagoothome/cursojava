package cursojava;

public class Av2 {

	public static void main(String[] args) {
		Fornecedor pessoa1 = new Fornecedor("Jo�o", "Rua da Lua", "(88) 91234-5678", 50000, 16900);
		pessoa1.exibirFornecedor();
		System.out.println("O saldo final � de: " +pessoa1.obterSaldo());
		
		System.out.println("-----------------------");
		
		Empregado pessoa2 = new Empregado("Carlos", "Rua do Mar", "(88) 98765-4321", 2, 4000);
		pessoa2.exibirEmpregado();
		
		
		
		

	}

}
