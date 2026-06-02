package operadores;

public class _027DecrementoIncremento {

	static int valor = 10;
	public static void main(String[] args) {
		
		System.out.println("Valor inicial: " + valor);
		
		valor++;
		System.out.println("Valor após incremento (valor++): " + valor);

		valor--;
		System.out.println("Valor após decremento (valor--): " + valor);
		
		++valor;
		System.out.println("Valor após incremento (++valor): " + valor);
		
		--valor;
		System.out.println("Valor após decremento (--valor): " + valor);
	}

}
