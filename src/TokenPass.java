public class TokenPass {
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount)
    {
        board = new int[playerCount];
        for(int i = 0; i < board.length; i++) {
            board[i] = (int) (Math.random() * 10 + 1);
        }
        currentPlayer = (int)(Math.random()*playerCount);
    }
    public void distributeCurrentPlayerTokens()
    {
        int nextPlayer = currentPlayer;
        int numToDistribute = board[currentPlayer];
        board[currentPlayer] = 0;

        while(numToDistribute > 0)
        {
            nextPlayer = (nextPlayer + 1) % board.length;
            board[nextPlayer]++;
            numToDistribute--;
        }
    }
    public int gameOver()
    {
        
    }
    public void nextPlayer()
    {

    }
    public void printBoard()
    {
        System.out.println(board);
    }
}
