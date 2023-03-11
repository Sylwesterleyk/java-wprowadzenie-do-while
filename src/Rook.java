public class Rook {
    public static void main(String[] args) {
        //określenie miejsc pionków własnych (1), przeciwnika (-1) oraz neutralnych (0)
        int[][] chess = {{0, 0, 0, 0, -1, 0, 0, 0}, {-1, -1, -1, -1, 0, 0, 0, -1}, {0, 0, -1, 0, -1, 0, -1, 0}, {-1, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 1, 0, -1, 1, 0}, {0, 0, 1, 0, 0, 1, 0, 0}, {1, 1, 0, 0, 0, 1, 1, 1}, {1, 0, 0, 0, 1, 0, 1, 0}};

        // przypisanie indeksów pozycji na planszy wieży
        int x = 1;
        int y = 5;

        // sprawdzenie pozycji przeciwnika w zasięgu wieży i jej wyświetlenie
        int plusRowIndex = x, plusColIndex = y, minusRowIndex = x, minusColIndex = y;

        do {
            if (chess[x][minusColIndex] == -1) {
                System.out.println("Przeciwnik w zasięgu znajduje się na polu " + (x + 1) + " " + (minusColIndex + 1));
            }
            minusColIndex--;
        } while (chess[x][minusColIndex + 1] != -1 && minusColIndex >= 0);

        do {
            if (chess[x][plusColIndex] == -1) {
                System.out.println("Przeciwnik w zasięgu znajduje się na polu " + (x + 1) + " " + (plusColIndex + 1));
            }
            plusColIndex++;
        } while (chess[x][plusColIndex-1] != -1 && plusColIndex <= chess.length - 1);

        do {
            if (chess[minusRowIndex][y] == -1) {
                System.out.println("Przeciwnik w zasięgu znajduje się na polu " + (minusRowIndex + 1) + " " + (y + 1));
            }
            minusRowIndex--;
        } while (chess[minusRowIndex + 1][y] != -1 && minusRowIndex >= 0);

        do {
            if (chess[plusRowIndex][y] == -1) {
                System.out.println("Przeciwnik w zasięgu znajduje się na polu " + (plusRowIndex + 1) + " " + (y + 1));
            }
            plusRowIndex++;
        } while (chess[plusRowIndex-1][y] != -1 && plusRowIndex <= chess.length - 1);
    }
}
