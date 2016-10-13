package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class World {
	private Pacman pacman;
    private PacmanGame pacmanGame;
 
    World(PacmanGame pacmanGame) {
        this.pacmanGame = pacmanGame;
 
        pacman = new Pacman(100,100);
    }
 
    Pacman getPacman() {
        return pacman;
    }
	
}
