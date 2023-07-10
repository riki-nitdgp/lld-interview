package org.coding.system_design.snake_lader_game;

import java.util.Deque;
import java.util.LinkedList;

public class Game {

    private Board board;
    private Dice dice;
    private Deque<Player> players = new LinkedList<>();
    private Player winner;

    public Game() {
        initializeGame();
    }

    private void initializeGame() {
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers() {
        Player player1 = new Player("riki_m", 0);
        Player player2 = new Player("susmita_r", 0);
        players.add(player1);
        players.add(player2);

    }

    public void startGame() {

        while(winner == null){
            Player currentPlayer = findPlayerTurn();
            System.out.println("player turn is: "+ currentPlayer.playerId + "current position is: "+ currentPlayer.currentPosition);
            int diceNumber = dice.rollDice();
            int playerNewPosition = currentPlayer.currentPosition + diceNumber;
            playerNewPosition = jumpCheck(playerNewPosition);
            currentPlayer.currentPosition = playerNewPosition;
            System.out.println("player turn is:" + currentPlayer.playerId + " new Position is: " + playerNewPosition);
            //check for winning condition
            if(playerNewPosition >= board.cells.length * board.cells.length-1){

                winner = currentPlayer;
            }

        }
        System.out.println("Winner is: "+ winner.playerId);
    }

    private Player findPlayerTurn() {
        Player currentPlayer = players.removeFirst();
        players.addLast(currentPlayer);
        return currentPlayer;
    }

    private int jumpCheck (int playerNewPosition) {

        if(playerNewPosition > board.cells.length * board.cells.length-1 ){
            return playerNewPosition;
        }

        Cell cell = board.getCell(playerNewPosition);
        if(cell.jump != null && cell.jump.startPoint == playerNewPosition) {
            String jumpBy = (cell.jump.startPoint < cell.jump.endPoint)? "ladder" : "snake";
            System.out.println("jump done by: " + jumpBy);
            return cell.jump.endPoint;
        }
        return playerNewPosition;
    }


}
