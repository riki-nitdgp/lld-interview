package org.coding.system_design.snake_lader_game;

public class Player {

    String playerId;
    int currentPosition;

    Player(String playerId, int currentPosition) {
        this.playerId = playerId;
        this.currentPosition = currentPosition;
    }

    void setCurrentPosition(int position){
        currentPosition = currentPosition;
    }

    int getCurrentPosition() {
        return currentPosition;
    }
}
