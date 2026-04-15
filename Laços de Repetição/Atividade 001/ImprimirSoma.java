public class ImprimirSoma {
    public static void main(String[] args) {
        
        int contador = 1;
        int soma = 0;

        while (contador <= 50) {
            soma = soma + contador;
        
            contador = contador + 1;

            System.out.println("A soma é " + soma);
        }
    }
}
