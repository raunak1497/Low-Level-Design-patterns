public class GameLogic {
    public GameLogic gameLogic;
    public boolean isThereWinner(int row, int col,PieceType pieceType, Board gameBoard) {
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diaMatch = true;
        boolean antiDiaMatch = true;

        for(int i=0;i<gameBoard.size;i++){
            if(gameBoard.board[row][i]==null || gameBoard.board[row][i].pieceType != pieceType){
                rowMatch = false;
                break;
            }
        }

        for(int i=0;i<gameBoard.size;i++){
            if(gameBoard.board[i][col]==null || gameBoard.board[i][col].pieceType != pieceType){
                colMatch = false;
                break;
            }
        }
        for(int i=0,j=0;i<gameBoard.size;i++,j++){
            if(gameBoard.board[i][j]==null || gameBoard.board[i][j].pieceType != pieceType){
                diaMatch = false;
            }
        }

        for(int i=0,j= gameBoard.size-1;i< gameBoard.size; i++,j--){
            if(gameBoard.board[i][j]==null || gameBoard.board[i][j].pieceType != pieceType){
                antiDiaMatch = false;
            }
        }

        return rowMatch || colMatch || diaMatch || antiDiaMatch;
    }
}
