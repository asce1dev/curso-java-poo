
public class TesteMatematica {

	public static void main(String[] args) {
		int numeroFibonacci = MatematicaUtil.calcularFibonacci(8);
		System.out.println("Numero de Fibonacci da posicao 8: " + numeroFibonacci);
		
		double areaCirculo = MatematicaUtil.calcularAreaCirculo(104.8);
		System.out.println("Area do circulo: " + areaCirculo);
	}
}
