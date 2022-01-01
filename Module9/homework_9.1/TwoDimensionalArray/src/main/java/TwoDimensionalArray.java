public class TwoDimensionalArray {
    public static char symbol = 'X';
    public static char spaceSymbol = ' ';

    public static char[][] getTwoDimensionalArray(int size) {
        char twoDim[][] = new char [size][size];
        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = 0; j < size / 2 + 1; j++) {
                if (i == j) {
                    twoDim[i][j] = symbol;
                    twoDim[i][size - 1 - j] = symbol;
                    twoDim[size - 1 - i][j] = symbol;
                    twoDim[size - 1 - i][size - 1 - j] = symbol;
                } else {
                    twoDim[i][j] = spaceSymbol;
                    twoDim[i][size - 1 - j] = spaceSymbol;
                    twoDim[size - 1 - i][j] = spaceSymbol;
                    twoDim[size - 1 - i][size - 1 - j] = spaceSymbol;
                }
            }
        }
        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]
        return twoDim;
    }
}
