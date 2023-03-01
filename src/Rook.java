public class Rook {
    public static void main(String[] args) {
        //określenie miejsc pionków własnych (1), przeciwnika (-1) oraz neutralnych (0)
        int[][] chess = {{0, 0, 0, 0, -1, 0, 0, 0}, {-1, -1, -1, -1, 0, 0, 0, -1}, {0, 0, -1, 0, -1, 0, -1, 0}, {-1, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 1, 0, -1, 1, 0}, {0, 0, 1, 0, 0, 1, 0, 0}, {1, 1, 0, 0, 0, 1, 1, 1}, {1, 0, 0, 0, 1, 0, 1, 0}};

        // przypisanie indeksów pozycji na planszy wieży
        int x = 7;
        int y = 4;

        // sprawdzenie pozycji przeciwnika w zasięgu wieży i jej wyświetlenie
        int rowIndex = 0;
        int colIndex = 0;

        do {
            if (chess[x][colIndex] == -1) {
                System.out.println("Przeciwnik w zasięgu znajduje się na polu " + (x + 1) + " " + (colIndex + 1));
            }
            colIndex++;
        } while (colIndex < chess.length);

        do {
            if (chess[rowIndex][y] == -1) {
                System.out.println("Przeciwnik w zasięgu znajduje się na polu " + (rowIndex + 1) + " " + (y + 1));
            }
            rowIndex++;
        } while (rowIndex < chess.length);
    }
}