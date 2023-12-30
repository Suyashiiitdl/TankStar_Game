package com.mygdx.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Menu1 {
    private int menu1flag;
    private Texture menu1;
    private OrthographicCamera camera;
    private float width=Gdx.graphics.getWidth();
    private float height=Gdx.graphics.getHeight();

    Menu1(){
        camera=new OrthographicCamera();
        camera.setToOrtho(false,width,height);
        menu1=new Texture("menu1.jpg");
        menu1flag=0;
    }
    public void Menu1Render(SpriteBatch b1){
        System.out.println("menu1 image is loaded");
        b1.begin();
        b1.draw(menu1,0,0, width,height);
        b1.end();
    }
    public void menu1dispose(){
        System.out.println("menu1 is disposed successfully");
        menu1.dispose();
    }

    public Texture getMenu1() {
        return menu1;
    }

    public void setMenu1(Texture menu1) {
        this.menu1 = menu1;
    }

    public int getflag() {
        return menu1flag;
    }
    public void setflag(int i){
        menu1flag=i;
    }
}
