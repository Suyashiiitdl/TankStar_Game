package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;

public class Screen2 extends ScreenAdapter {
    Menu2 secoundScreenMenu;
    GameScreen gameScreen;
    Screen1 game;
    Texture t1;



    public Screen2(Screen1 game) {
        this.game=game;
        gameScreen=new GameScreen(game);
        secoundScreenMenu=new Menu2(game);
        t1=new Texture("level4.jpg");

    }



    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
            secoundScreenMenu.Menu2Render();





    }

    @Override
    public void resize(int width, int height) {

    }


    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        System.out.println("menu2 is disposed sucessfully");

    }
}
