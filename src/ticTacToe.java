import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a character:");
        char x = console.next().charAt(0);
        drawBoard();
    }

    public static int[][] board() {
        return new int[3][3];
    }

    public static void drawBoard() {
        int[][] board = board();
        for (int i = 0; i < board.length; i++) {
            System.out.println("\t|\t|\t");
            System.out.println("\t|\t|\t");
            if (i < board.length - 1) {
                System.out.println("    ________________");
            }
        }
    }
}
