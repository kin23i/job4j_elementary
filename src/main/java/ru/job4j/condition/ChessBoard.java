package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (isChessRook(x1, y1, x2, y2)) {
                rsl = Math.abs(x2 - x1);
                rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
            } else if (isChessBishop(x1, y1, x2, y2)) {
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    private static boolean isChessBishop(int x1, int y1, int x2, int y2) {
        return ((Math.abs(x1 - x2) - Math.abs(y1 - y2)) == 0);
    }

    private static boolean isChessRook(int x1, int y1, int x2, int y2) {
        return ((x1 * x2 == 0) || (y1 * y2 == 0));
    }
}
