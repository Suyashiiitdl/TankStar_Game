package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import static com.badlogic.gdx.Gdx.graphics;

public class Menu2 {
    int test;
    Sprite left_right1;

    Sprite tank;
    Texture tank0;
    Texture player1;
    Texture player2;
    Texture left_right;
    static int tank_id;
    Texture select;


    private Texture menu2;
    private Texture button;
    private float width;
    private float height;
    static int menu2flag;//
    Screen1 game;
    Sprite sprite;
    InputManagement userinput;
    int speed=160;
    int v=0;



    static int tank1id;
    static int tank2id;
    static int player2flag;
    static int player1flag;
    static int player1tank=1;
    static int player2tank=2;
    int a;
    int px1;
    int px2;



    Menu2(Screen1 game){
        button=new Texture("button2.png");

        select=new Texture("Select.png");
        sprite=new Sprite(button);
        tank0=new Texture("tank1.png");
        tank=new Sprite(tank0);
        tank_id=1;
        menu2=new Texture("background.jpg");
        left_right=new Texture("left_right.png");
        left_right1=new Sprite(left_right);
        menu2flag=0;
        width= Gdx.graphics.getWidth();
        height=Gdx.graphics.getHeight();
        this.game=game;
        player1=new Texture("Player 1.png");
        player2=new Texture("Player 2.png");
        userinput=new InputManagement();
        player2flag=0;
        a=0;
        test=0;
        px1=480;
        px2=480;






    }
    public void Menu2Render(){

        game.batch.begin();
        Gdx.gl.glClearColor(1,0,0,0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //background
        game.batch.draw(menu2,0,0, (3*width)/4,height);
        //playbuttonimage



        //players coordinate are abjusted by mouse where right click take place
        game.batch.draw(player1,px1,360,150,120);
        game.batch.draw(player2,px2,280,150,100);

        //tanks
        System.out.println(tank_id);
        if(tank_id==1){
            tank0=new Texture("tank1.png");
            game.batch.draw(tank0,speed,100,250,200);


        }
        else if(tank_id==2){
            tank0=new Texture("tank2.png");
            game.batch.draw(tank0,speed,100,250,200);

        }
        else if(tank_id==3){
            tank0=new Texture("tank3.png");
            game.batch.draw(tank0,speed,100,250,200);


        }
        else if(tank_id==4){
            tank0=new Texture("tank4.png");
            game.batch.draw(tank0,speed,100,250,200);

        }
        else if(tank_id==5){
            tank0=new Texture("tank5.png");
            game.batch.draw(tank0,speed,100,250,200);
        }
        else{
            tank0=new Texture("tank1.png");
            game.batch.draw(tank0,speed,100,250,200);


        }

        game.batch.draw(left_right, 150, 4, 200, 100);
        //press the button and check and give player2flag=1/0 or player1flag=1/0
        //code for player2 button




        userinput.init(player1,488,626,13,80);
        userinput.updateStatus();
        if(userinput.Moveright==true){
            player2flag=1;
        }
        if(player2flag==1) {
            //left_right buttons also check by clicking by mouse


            px2=480;
            game.batch.draw(player2,px2,280,150,100);
            test=1;
            game.batch.draw(select,480,150,150,100);
            userinput.init(select,482,621,243,309);
            userinput.updateStatus();

            if(userinput.Moveright==true){
                player2flag=0;
                test=0;
                player2tank=tank_id;

            }
            game.batch.draw(select,480,150,150,100);


            userinput.init(left_right, 155, 370, 160, 470);
            userinput.updateStatus();
            if (userinput.Moveright == true) {
                if (tank_id == 1) {
                    tank_id = 2;
                } else if (tank_id == 2) {
                    tank_id = 3;
                } else if(tank_id==3){
                    tank_id = 4;
                } else if(tank_id==4){
                    tank_id=5;
                } else if(tank_id==5){
                    tank_id=6;
                }
                else{
                    tank_id=1;
                }
            }
            userinput.init(left_right,375,390,160,470);
            userinput.updateStatus();
            if(userinput.Moveright==true) {
                if (tank_id == 1) {
                    tank_id = 2;
                } else if (tank_id == 2) {
                    tank_id = 3;
                } else if(tank_id==3){
                    tank_id = 4;
                } else if(tank_id==4){
                    tank_id=5;
                } else if(tank_id==5){
                    tank_id=6;
                }
                else{
                    tank_id=1;
                }
            }


        }


        //code........................................................player1 checking
        userinput.init(player1,488,618,112,178);
        userinput.updateStatus();
        if(userinput.Moveright==true) {
            player1flag = 1;
        }
        if(player1flag==1){
            px1=480;
            game.batch.draw(player1,px1,360,150,120);

            test=1;
            game.batch.draw(select,480,150,150,100);
            userinput.init(select,482,621,243,309);
            userinput.updateStatus();

            if(userinput.Moveright==true){
                player1flag=0;
                test=0;
                player1tank=tank_id;

            }
            userinput.init(left_right, 155, 370, 160, 470);
            userinput.updateStatus();
            if (userinput.Moveright == true) {
                if (tank_id == 1) {
                    tank_id = 2;
                } else if (tank_id == 2) {
                    tank_id = 3;
                } else if(tank_id==3){
                    tank_id = 4;
                } else if(tank_id==4){
                    tank_id=5;
                }
                else if(tank_id==5){
                    tank_id=6;
                }
                else{
                    tank_id=1;
                }
            }
            userinput.init(left_right,375,390,160,470);
            userinput.updateStatus();
            if(userinput.Moveright==true) {
                if (tank_id == 1) {
                    tank_id = 2;
                } else if (tank_id == 2) {
                    tank_id = 3;
                } else if(tank_id==3){
                    tank_id = 4;
                } else if(tank_id==4){
                    tank_id=5;
                } else if(tank_id==5){
                    tank_id=6;
                }
                else{
                    tank_id=1;
                }
            }

        }



        //play buttons
        if(test==0) {
            px1=480;
            px2=480;

            game.batch.draw(button,470,-100,170,450);
            userinput.init(button, 491, 617, 293, 419);
            userinput.updateStatus();
            if (userinput.Moveright == true) {
                InputManagement.flag_for_play = 1;
            }
        }

        game.batch.end();
    }

    public void menu2dispose(){
        System.out.println("menu2 is disposed successfully");
        menu2.dispose();
    }
    public int getflag() {
        return menu2flag;
    }


    public void setflag(int i) {
        menu2flag = i;

    }

}
