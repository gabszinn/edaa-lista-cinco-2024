public class Programa {
    public static void main(String[] args) {
        int[] arr = {242, 243, 255, 268, 270, 275, 285, 289, 293, 296,
            306, 307, 310, 315, 318, 323, 334, 337, 350, 351,
            355, 359, 361, 369, 373, 376, 379, 383, 387, 390,
            391, 392, 394, 399, 401, 403, 415, 417, 421, 423,
            429, 433, 436, 440, 447, 459, 463, 464, 477, 481,
            483, 484, 486, 487, 490, 495, 496, 499, 500, 501,
            511, 513, 518, 526, 530, 531, 534, 545, 551, 553,
            554, 558, 561, 565, 572, 591, 592, 600, 605, 609,
            613, 616, 623, 624, 625, 626, 632, 643, 645, 647,
            652, 654, 655, 662, 667, 671, 673, 674, 695, 696};

        int[] numerosBusca = {415, 545, 390, 609, 296};
        for (int numero : numerosBusca) {
            
            int indice = BuscaBinaria.buscaBinaria(arr, numero);
            if (indice != -1) {
                System.out.println("O número " + numero + " está no índice " + indice);
            } else {
                System.out.println("O número " + numero + " não foi encontrado no array.");
            }
    }
}
}
