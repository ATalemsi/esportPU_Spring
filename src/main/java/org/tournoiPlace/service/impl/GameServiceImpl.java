package org.tournoiPlace.service.impl;

import org.tournoiPlace.dao.GameDao;
import org.tournoiPlace.dao.TournamentDao;
import org.tournoiPlace.model.Game;
import org.tournoiPlace.service.GameService;

import java.util.Collections;
import java.util.List;

public class GameServiceImpl implements GameService {
    private final GameDao gameDao;

    public GameServiceImpl(GameDao gameDao) {
        this.gameDao = gameDao;
    }


    @Override
    public void addGame(Game game) {
        gameDao.addGame(game);
    }

    @Override
    public List<Game> getGames() {
        return gameDao.getAllGames();
    }
}
