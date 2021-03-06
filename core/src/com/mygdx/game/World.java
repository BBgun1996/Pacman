package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class World {
	private Pacman pacman;
    private PacmanGame pacmanGame;
    private Maze maze;
    
    private int score;
 
    World(PacmanGame pacmanGame) {
    	maze = new Maze();
    	pacman = new Pacman(60,60,this);
        this.pacmanGame = pacmanGame;
        score = 0;
    }
 
    Pacman getPacman() {
        return pacman;
    }
    
    Maze getMaze() {
        return maze;
    }
    
    public void update(float delta) {
        pacman.update();
    }
	
    public int getScore() {
        return score;
    }
    
    public void increaseScore() {
        score += 1;
    }
}
