package dev.pillage.services;

import dev.pillage.beans.Player;
import dev.pillage.services.registry.PlayerRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * L7 replica
 */
@RestController
@RequestMapping(path = "/")
public class LoadBalancer {
    private PlayerRegistry playerRegistry;

    @GetMapping(path = "/matchmaking/{id}/{gameId}", produces = "application/json")
    public String matchmaking(@PathVariable("id") String id, @PathVariable("gameId") String gameId) {
        Player player = playerRegistry.getPlayer(Integer.parseInt(id));
        if (player == null) {
            return "player not found";
        }
        // TODO: route to matchmaking service and constantly poll for an eta
        // open web socket to client and send updates (communicate with communication service)
        // use gameId (NOT MATCHMAKING ID) to route to game service (SBMM for skill based, queue for normal)
        return "matchmaking";
    }
}
