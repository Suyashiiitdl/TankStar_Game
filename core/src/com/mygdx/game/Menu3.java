package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

public class Menu3 implements Screen {
    static int Menu3flag;
    InputManagementGame userinput;

    int player1tank;
    int player2tank;
    Texture tank0;
    Texture tank1;
    Screen1 game;
    Texture background=new Texture("level1.jpg");
    Texture left_arrow;
    Texture right_arrow;
    static int backgroundflag=0;
    static Texture final_image_of_background;
    static Texture final_image_of_player1tank;
    static Texture final_image_of_player2tank;


    Menu3(Screen1 game){
        this.game=game;
        player1tank=Menu2.player1tank;
        player2tank=Menu2.player2tank;

        Menu3flag=0;

        left_arrow=new Texture("arrow.png");
        right_arrow=new Texture("arrow (1).png");
        userinput=new InputManagementGame();



    }




    @Override
    public void show() {


    }

    @Override
    public void render(float delta) {
        game.batch.begin();
        Gdx.gl.glClearColor(1,0,0,0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);



        System.out.println(backgroundflag);
        if(backgroundflag==0) {
            background=new Texture("level1.jpg");
            game.batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
            final_image_of_background=background;
        }
        else if(backgroundflag==1){
            background=new Texture("level2 (1).jpg");
            game.batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
            final_image_of_background=background;

        }
        else if(backgroundflag==2){
            background=new Texture("level3.jpg");
            game.batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
            final_image_of_background=background;

        }
        else{
            background=new Texture("level4.jpg");
            game.batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
            final_image_of_background=background;

        }
        game.batch.draw(left_arrow,550,200,100,70);
        userinput.init(left_arrow,569,629,223,270);
        userinput.updateStatus();

        if(userinput.Moveright==true) {
            System.out.println("oh yess");
            if(backgroundflag==1){
                backgroundflag=2;
            }
            else if(backgroundflag==2){
                backgroundflag=3;
            }
            else if(backgroundflag==3){
                backgroundflag=4;
            }
            else{
                backgroundflag=1;
            }

        }


        game.batch.draw(right_arrow,0,200,100,70);
        userinput.init(left_arrow,15,77,222,265);
        userinput.updateStatus();

        if(userinput.Moveright==true){
            if(backgroundflag==1){
                backgroundflag=2;
            }
            else if(backgroundflag==2){
                backgroundflag=3;
            }
            else if(backgroundflag==3){
                backgroundflag=4;
            }
            else{
                backgroundflag=1;
            }

        }


        if(player1tank==1|player1tank==6){
            tank0=new Texture("tank1.png");
            game.batch.draw(tank0,0,-10,300,200);
            final_image_of_player1tank=tank0;


        }
        else if(player1tank==2){
            tank0=new Texture("tank2.png");
            game.batch.draw(tank0,0,-10,300,200);
            final_image_of_player1tank=tank0;

        }
        else if(player1tank==3){
            tank0=new Texture("tank3.png");
            game.batch.draw(tank0,0,-10,250,200);
            final_image_of_player1tank=tank0;

        }
        else if(player1tank==4){
            tank0=new Texture("tank4.png");
            game.batch.draw(tank0,0,-10,250,200);
            final_image_of_player1tank=tank0;
        }
        else{
            tank0=new Texture("tank5.png");
            game.batch.draw(tank0,0,-10,250,200);
            final_image_of_player1tank=tank0;
        }
        int b;

        if(player2tank==1|player2tank==6){
            tank1=new Texture("tank11.png");
            game.batch.draw(tank1,400,-10,250,200);
            final_image_of_player2tank=tank0;

        }
        else if(player2tank==2){
            tank1=new Texture("tank21.png");
            game.batch.draw(tank1,400,-10,250,200);
            final_image_of_player2tank=tank0;

        }
        else if(player2tank==3){
            tank1=new Texture("tank31.png");
            game.batch.draw(tank1,400,-10,250,200);
            final_image_of_player2tank=tank0;

        }
        else if(player2tank==4){
            tank1=new Texture("tank41.png");
            game.batch.draw(tank1,400,-10,250,200);
            final_image_of_player2tank=tank0;
        }
        else{
            tank1=new Texture("tank51.png");
            game.batch.draw(tank1,400,-10,250,200);
            final_image_of_player2tank=tank0;

        }



        game.batch.end();


    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
