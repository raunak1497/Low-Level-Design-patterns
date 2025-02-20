import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    public int[] getMove() {
        System.out.print("Enter your move (row,col): ");
        String s = scanner.nextLine();
        String[] value = s.split(",");
        int row = Integer.valueOf(value[0]);
        int col = Integer.valueOf(value[1]);
        return new int[]{row, col};
    }
}
