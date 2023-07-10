package org.coding.system_design.snake_lader_game;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

    Cell[][] cells;

    Board(int boardSize, int numberOfSnake, int numberOfLadders){
        initializeCells(boardSize);
        addSnakesAndLadders(cells, numberOfSnake, numberOfLadders);
    }

    private void initializeCells(int boardSize) {
        cells = new Cell[boardSize][boardSize];

        for(int i = 0; i<boardSize;i++){
            for(int j = 0; j<boardSize;j++){
                Cell cell = new Cell();
                cells[i][j] = cell;
            }
        }
    }

    private void addSnakesAndLadders(Cell[][] cells, int numberOfSnake, int numberOfLadders) {

        while(numberOfSnake > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length+cells.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length+cells.length-1);

            if(snakeTail >= snakeHead) {
                continue;
            }
            Jump snake = new Jump(snakeHead, snakeTail);
            Cell snakeCell = getCell(snakeHead);
            snakeCell.jump = snake;

            numberOfSnake--;

        }
        while(numberOfLadders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length+cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, cells.length+cells.length-1);

            if (ladderStart >= ladderEnd) {
                continue;
            }
            Jump ladder = new Jump(ladderStart, ladderEnd);
            Cell ladderCell = getCell(ladderStart);
            ladderCell.jump = ladder;
            numberOfLadders--;
        }
    }

    public Cell getCell(int playerPosition) {
        int row = playerPosition/cells.length;
        int column = (playerPosition % cells.length);
        return cells[row][column];
    }

}
