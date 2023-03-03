public class Queen {
    public static void main(String[] args) {
        //określenie miejsc pionków własnych (1), przeciwnika (-1) oraz neutralnych (0)
        int[][] chess = {{-1, 0, -1, -1, -1, -1, 0, 0}, {-1, 0, 0, 0, -1, 0, -1, 0}, {-1, 0, -1, 0, 1, -1, 0, -1}, {0, -1, 0, -1, 0, 1, 0, 1}, {0, 1, 0, 1, 0, 0, 0, 1}, {1, 1, 1, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 1, 0, 0, 1}, {0, 0, 0, 0, 1, 1, 0, 0}};

        // przypisanie INDEKSÓW pozycji Hetmana
        int x = 6;
        int y = 4;

        // sprawdzenie POZYCJI przeciwnika w zasięgu Hetmana i jej wyświetlenie
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

        int firstNewRowIndex = x;
        int firstNewColIndex = y;

        do {
            firstNewRowIndex--;
            firstNewColIndex--;
        } while (firstNewRowIndex >0 && firstNewColIndex >0);

        do {
            if (chess[firstNewRowIndex][firstNewColIndex] == -1) {
                System.out.println("Przeciwnik w zasięgu znajduje się na polu " + (firstNewRowIndex + 1) + " " + (firstNewColIndex + 1));
            }
            firstNewRowIndex++;
            firstNewColIndex++;
        } while (firstNewRowIndex < chess.length && firstNewColIndex < chess.length);

        int secondNewRowIndex = x;
        int secondNewColIndex = y;

        do {
            secondNewRowIndex++;
            secondNewColIndex--;
        } while (secondNewRowIndex < (chess.length-1) && secondNewColIndex  >0);

        do {
            if (chess[secondNewRowIndex][secondNewColIndex] == -1) {
                System.out.println("Przeciwnik w zasięgu znajduje się na polu " + (secondNewRowIndex + 1) + " " + (secondNewColIndex + 1));
            }
            secondNewRowIndex--;
            secondNewColIndex++;
        } while (secondNewRowIndex >=0 && secondNewColIndex < chess.length);

    }
}