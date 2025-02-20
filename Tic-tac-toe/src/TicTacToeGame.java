import java.util.*;

public class TicTacToeGame {
    private Deque<Player> players;
    private Board gameBoard;
    private GameLogic gameLogic;
    private InputHandler inputHandler;

    public TicTacToeGame() {
        initializeGame();
        inputHandler = new InputHandler();
        gameLogic =  new GameLogic();
    }

    public void initializeGame(){
        players = new LinkedList<>();

        Player xPlayer = new Player("X",new PieceX());
        Player oPlayer = new Player("Y",new PieceO());

        players.push(xPlayer);
        players.push(oPlayer);

        gameBoard = new Board(3);

    }

    public String startGame(){
        boolean noWinner = true;
        while(noWinner){
            Player playerTurn = players.pop();
            gameBoard.printBoard();
            List<Pair<Integer,Integer>> freeSpaces = gameBoard.getFreeCells();

            if(freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }

            int[] move = inputHandler.getMove();
            int inputRow = move[0];
            int inputCol = move[1];

            boolean addSuccess = gameBoard.addPiece(inputRow,inputCol,playerTurn.playingPiece);

            if(!addSuccess){
                System.out.println("Invalid position, try again");
                players.addFirst(playerTurn);
                continue;
            }

            if(gameLogic.isThereWinner(inputRow,inputCol,playerTurn.playingPiece.pieceType,gameBoard)){
                gameBoard.printBoard();
                return playerTurn.getName();
            }
            players.addLast(playerTurn);
        }
        return "tie";
    }
}
