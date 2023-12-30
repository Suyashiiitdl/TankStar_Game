package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;

import static com.badlogic.gdx.Input.Keys.*;
public class InputManagementGame {

    public boolean Moveright;
    public boolean Moveleft;
    public Texture button;


    public int mouseX1;
    public int mouseX2;
    public int mouseY1;
    public int mouseY2;
    int i;

    public void init(Texture button,int x1,int x2,int y1,int y2){
        Moveright=false;
        Moveleft=false;
        this.button=button;
        this.mouseX1=x1;
        this.mouseX2=x2;
        this.mouseY1=y1;
        this.mouseY2=y2;


    }


    public void updateStatus(){
        if(Gdx.input.isKeyPressed(LEFT)){
            Moveleft=true;
        }
        else if(Gdx.input.isKeyPressed(RIGHT)){
            Moveright=true;
        }
        else{
            i=0;
        }
        i=0;

        if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)){

            int x=Gdx.input.getX();
            int y=Gdx.input.getY();
            System.out.println(x +" "+y);
            if(x>=mouseX1&& x<=mouseX2&& y>=mouseY1&&y<=mouseY2){
                Moveright=true;



            }
        }
        else if(Gdx.input.isButtonPressed(Input.Buttons.RIGHT)){
            int x=Gdx.input.getX();
            int y=Gdx.input.getY();
            if(x>=mouseX1&& x<=mouseX2&& y>=mouseY1&&y<=mouseY2){
                Moveright=true;

            }
        }
        else{
            i=3;
        }

    }



}

