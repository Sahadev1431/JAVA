import java.util.Scanner;

public class TicTacToe {
    Scanner sc = new Scanner(System.in);
    static char c;

    char[][] arr = new char[3][3];

    TicTacToe() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = ' ';
            }
        }
    }

    public void show() {
        System.out.println("Current Display of game :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("|" + arr[i][j]);
                if (j == arr[0].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }

    public void p1Insert() {
        System.out.println("Player 1 turn");
        System.out.print("Enter row and column space seperated : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            if (arr[row][col] == ' ') {
                arr[row][col] = 'O';
            } else {
                System.out.println("Can't insert at position " + row + " " + col + ". Find another position");
                p1Insert();
            }
        } else {
            System.out.println("please Insert valid index");
            p1Insert();
        }
    }

    public void p2Insert() {
        System.out.println("Player 2 turn");
        System.out.print("Enter row and column space seperated : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            if (arr[row][col] == ' ') {
                arr[row][col] = 'X';
            } else {
                System.out.println("Can't insert at position " + row + " " + col + ". Find another position");
                p1Insert();
            }
        } else {
            System.out.println("please Insert valid index");
            p2Insert();
        }
    }

    public boolean win(char c) {
        if (arr[0][0] == c) {
            if (arr[0][1] == c && arr[0][2] == c) {
                return true;
            }
            if (arr[1][0] == c && arr[2][0] == c) {
                return true;
            }
            if (arr[1][1] == c && arr[2][2] == c) {
                return true;
            }
        } else if (arr[0][2] == c) {
            if (arr[1][2] == c && arr[2][2] == c) {
                return true;
            }
            if (arr[1][1] == c && arr[2][0] == c) {
                return true;
            }
        } else if (arr[1][1] == c) {
            if (arr[0][1] == c && arr[2][1] == c) {
                return true;
            }
            if (arr[1][0] == c && arr[1][2] == c) {
                return true;
            }
        } else if (arr[2][0] == c && arr[2][1] == c && arr[2][2] == c) {
            return true;
        } else {
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        TicTacToe t1 = new TicTacToe();
        System.out.println("Player 1 : 'O' ");
        System.out.println("Player 2 : 'X' ");
        do {
            t1.show();
            t1.p1Insert();
            if (t1.win('O')) {
                System.out.println("\nPlayer 1 won!\n");
                break;
            }

            t1.show();
            t1.p2Insert();

            if (t1.win('O')) {
                System.out.println("\nPlayer 1 won!\n");
                break;
            }
            if (t1.win('X')) {
                System.out.println("\nPlayer 2 won!\n");
                break;
            }
        } while (true);
        t1.show();
    }
}