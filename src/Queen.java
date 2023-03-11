public class Queen {
    public static void main(String[] args) {
        //określenie miejsc pionków własnych (1), przeciwnika (-1) oraz neutralnych (0)
        int[][] chess = {{-1, 0, -1, -1, -1, -1, 0, 0}, {-1, 0, 0, 0, -1, 0, -1, 0}, {-1, 0, -1, 0, 1, -1, 0, -1}, {0, -1, 0, -1, 0, 1, 0, 1}, {0, 1, 0, 1, 0, 0, 0, 1}, {1, 1, 1, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 1, 0, 0, 1}, {0, 0, 0, 0, 1, 1, 0, 0}};

        // przypisanie INDEKSÓW pozycji Hetmana
        int x = 2;
        int y = 6;

        // sprawdzenie POZYCJI przeciwnika w zasięgu Hetmana i jej wyświetlenie
        int plusRowIndex = x;
        int plusColIndex = y;

        do {
            if (chess[x][plusColIndex] == -1) {
                System.out.println("Przeciwnik w zasięgu znajduje się na polu " + (x + 1) + " " + (plusColIndex + 1));
            }
            plusColIndex++;
        } while (plusColIndex < chess.length && chess[x][plusColIndex - 1] != -1);

        do {
            if (chess[plusRowIndex][y] == -1) {
                System.out.println("Przeciwnik w zasięgu znajduje się na polu " + (plusRowIndex + 1) + " " + (y + 1));
            }
            plusRowIndex++;
        } while (plusRowIndex < chess.length && chess[plusRowIndex - 1][y] != -1);

        int minusRowIndex = x;
        int minusColIndex = y;

        do {
            if (chess[x][minusColIndex] == -1) {
                System.out.println("Przeciwnik w zasięgu znajduje się na polu " + (x + 1) + " " + (minusColIndex + 1));
            }
            minusColIndex--;
        } while (minusColIndex >= 0 && chess[x][minusColIndex + 1] != -1);

        do {
            if (chess[minusRowIndex][y] == -1) {
                System.out.println("Przeciwnik w zasięgu znajduje się na polu " + (minusRowIndex + 1) + " " + (y + 1));
            }
            minusRowIndex--;
        } while (minusRowIndex >= 0 && chess[minusRowIndex + 1][y] != -1);

        int firstPlusRowIndex = x;
        int firstPlusColIndex = y;

        do {
            if (chess[firstPlusRowIndex][firstPlusColIndex] == -1) {
                System.out.println("Przeciwnik w zasięgu znajduje się na polu " + (firstPlusRowIndex + 1) + " " + (firstPlusColIndex + 1));
            }
            firstPlusRowIndex++;
            firstPlusColIndex++;
        } while (firstPlusRowIndex < chess.length && firstPlusColIndex < chess.length && chess[firstPlusRowIndex - 1][firstPlusColIndex - 1] != -1);

        int firstMinusRowIndex = x;
        int firstMinusColIndex = y;

        do {
            if (chess[firstMinusRowIndex][firstMinusColIndex] == -1) {
                System.out.println("Przeciwnik w zasięgu znajduje się na polu " + (firstMinusRowIndex + 1) + " " + (firstMinusColIndex + 1));
            }
            firstMinusRowIndex--;
            firstMinusColIndex--;
        } while (firstMinusRowIndex >= 0 && firstMinusColIndex >= 0 && chess[firstMinusRowIndex + 1][firstMinusColIndex + 1] != -1);

        int secondMinusRowIndex = x;
        int secondPlusColIndex = y;

        do {
            if (chess[secondMinusRowIndex][secondPlusColIndex] == -1) {
                System.out.println("Przeciwnik w zasięgu znajduje się na polu " + (secondMinusRowIndex + 1) + " " + (secondPlusColIndex + 1));
            }
            secondMinusRowIndex--;
            secondPlusColIndex++;
        } while (secondMinusRowIndex >= 0 && secondPlusColIndex < chess.length && chess[secondMinusRowIndex + 1][secondPlusColIndex - 1] != -1);

        int secondPlusRowIndex = x;
        int secondMinusColIndex = y;

        do {
            if (chess[secondPlusRowIndex][secondMinusColIndex] == -1) {
                System.out.println("Przeciwnik w zasięgu znajduje się na polu " + (secondPlusRowIndex + 1) + " " + (secondMinusColIndex + 1));
            }
            secondPlusRowIndex++;
            secondMinusColIndex--;
        } while (secondMinusColIndex >= 0 && secondPlusRowIndex < chess.length && chess[secondPlusRowIndex - 1][secondMinusColIndex + 1] != -1);
    }
}