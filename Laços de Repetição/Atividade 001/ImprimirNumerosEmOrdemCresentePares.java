

public class ImprimirNumerosEmOrdemCresentePares {
    public static void main(String[] args) {
        
        int contador = 1;

        while (contador <= 10) { // Inicio do while
            
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
        
            contador = contador + 1; // contador++
        
        
        } //fim do while
    }
}
