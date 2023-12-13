package dev.pillage.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@AllArgsConstructor
public class Server {
    private int playerCount;

    public void addPlayer() {
        playerCount++;
    }

    public void removePlayer() {
        playerCount--;
    }
}
