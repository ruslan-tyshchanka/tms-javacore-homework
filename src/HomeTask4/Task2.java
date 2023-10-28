package HomeTask4;

public class Task2 {
    public static void main(String[] args) {

        String [][] chessBoard = new String [8][8];

        int remainder = 0;

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                remainder = (i + j) % 2;
                if (remainder==0) {
                    System.out.print("W ");
                    break;
                }
            } System.out.println();
        }
     }
}
