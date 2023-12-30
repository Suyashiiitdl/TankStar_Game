package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;

public class BackgroundManagement {
    private Texture background=new Texture("level31.jpg");
    private int backgroundx;
    private int backgroundy;

    private int screenheight= Gdx.graphics.getHeight();
    private int screenwidth=Gdx.graphics.getWidth();
    Screen1 game;

    BackgroundManagement(int backgroundx,int backgroundy,int screenheight,int screenwidth){
        this.backgroundx=backgroundx;
        this.backgroundy=backgroundy;
        this.screenheight=screenheight;
        this.screenwidth=screenwidth;
    }
    BackgroundManagement(Screen1 game,int backgroundx,int backgroundy) {
        this.game=game;
        this.backgroundx = backgroundx;
        this.backgroundy = backgroundy;
    }

    public BackgroundManagement(int i, int i1) {
        this.backgroundx = backgroundx;
        this.backgroundy = backgroundy;
    }

    public void drawBackground(){
        game.batch.draw(background,backgroundx,backgroundy,screenwidth,screenheight);
    }

    public int getScreenwidth() {
        return screenwidth;
    }

    public int getScreenheight() {
        return screenheight;
    }

    public Texture getBackground() {
        return background;
    }

    public void setScreenheight(int screenheight) {
        this.screenheight = screenheight;
    }

    public void setScreenwidth(int screenwidth) {
        this.screenwidth = screenwidth;
    }

    public int getBackgroundx() {
        return backgroundx;
    }

    public int getBackgroundy() {
        return backgroundy;
    }

    public void setBackgroundy(int backgroundy) {
        this.backgroundy = backgroundy;
    }

    public void setBackground(Texture background) {
        this.background = background;
    }

    public void setBackgroundx(int backgroundx) {
        this.backgroundx = backgroundx;
    }
}
