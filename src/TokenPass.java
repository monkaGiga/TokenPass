public class TokenPass
{
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount)
    {
        this.board = new int[playerCount];
        for (int i = 0; i < board.length; i++)
        {
            board[i] = 1 + (int)(Math.random() * 10);
        }
        currentPlayer = (int)(playerCount * Math.random());
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

    public void printBoard()
    {
        for (int i = 0; i < board.length; i++)
        {
            System.out.print("Player " + i + " : " + board[i] + "  ");
        }
        System.out.println("Current Player : " + currentPlayer);
    }

    public void nextPlayer()
    {
        currentPlayer++;
        if(currentPlayer == board.length)
        {
            currentPlayer = 0;
        }
    }

    public int gameOver()
    {
        int winner = -1;
        for(int i = 0; i < board.length;i++)
        {
            if(board[i] == 0){
                winner = i;
            }
        }
        return winner;
    }
}