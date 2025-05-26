import java.util.Arrays;

public class TwoDScoreBoard{
public static void main(String[] args){

int[][] board = {{3, 3, 4}, {9, 1, 3}};
int[] total = new int[board.length];
double[] average = new double[board[0].length];

System.out.println(Arrays.toString(TwoDScoreBoardFunction.scoreboard(board, total)));

System.out.println(Arrays.toString(TwoDScoreBoardFunction.scoreboard(board, average)));
}

}