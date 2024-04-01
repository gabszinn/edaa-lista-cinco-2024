import java.util.Arrays;
public class BuscaBinaria {
    private int[] placas;

    public BuscaBinaria(int[] placas) {
        this.placas = placas;
        Arrays.sort(this.placas); 
    }

    public int buscarMomento(int placa) {
        int indice = buscaBinaria(placas, placa);
        return indice + 1; 
    }

    public static int buscaBinaria(int[] array, int chave) {
        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (array[meio] == chave) {
                return meio; 
            } else if (array[meio] < chave) {
                esquerda = meio + 1; 
            } else {
                direita = meio - 1; 
        }
    }
        return -1; 
}
}


