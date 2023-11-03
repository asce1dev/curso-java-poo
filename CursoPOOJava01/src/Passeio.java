
public class Passeio {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Jose";
		pessoa1.cachorro = new Cachorro();
		
		pessoa1.cachorro.nome = "Bidu";
		pessoa1.cachorro.idade = 3;
		pessoa1.cachorro.raca = "Boxer";
		pessoa1.cachorro.sexo = 'M';
		
		Caminhada caminhada = new Caminhada();
		caminhada.andar(pessoa1);
	}
}
