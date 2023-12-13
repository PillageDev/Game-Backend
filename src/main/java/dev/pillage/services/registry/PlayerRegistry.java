package dev.pillage.services.registry;

import dev.pillage.beans.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerRegistry {
    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Player getPlayer(int id) {
        return players.stream().filter(player -> player.getId() == id).findFirst().orElse(null);
    }
}
