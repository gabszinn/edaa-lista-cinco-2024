public class BuscaBinaria {
    public static int buscaBinaria(int[] arr, int chave) {
        int esquerda = 0;
        int direita = arr.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (arr[meio] == chave) {
                return meio; // Retorna o índice se a chave for encontrada
            } else if (arr[meio] < chave) {
                esquerda = meio + 1; // Busca na metade direita do array
            } else {
                direita = meio - 1; // Busca na metade esquerda do array
            }
        }

        return -1; // Retorna -1 se a chave não for encontrada
    }
}

