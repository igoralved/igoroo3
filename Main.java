package src;

public class Main {
	//exercicio 17
	public static void main(String args[]) {
		System.out.println("\f");
		Pessoa igor = new Pessoa("Igor", 21, null, null);
		igor.print();
		Pessoa mae = new Pessoa("imarilde", 54, null, null);
		igor.setMae(mae);
		igor.print();
		mae.print();
		Pessoa pai = new Pessoa("Flavio", 53, null, null);
		igor.setPai(pai);
		igor.print();
		pai.print();
		
	}
}
