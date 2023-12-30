package com.mygdx.game;

import GAME_TILES.GameMap;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.FrameBuffer;
import com.badlogic.gdx.utils.ScreenUtils;

import static com.badlogic.gdx.Gdx.graphics;
import static com.badlogic.gdx.Input.Keys.LEFT;
import static com.badlogic.gdx.Input.Keys.RIGHT;

public class GameScreen implements Screen {
    Screen1 game;

    BackgroundManagement backgroundImage;
    ////////////
    Sprite sprite;
    Texture img;
    Texture menu1;
    Texture road;
    FrameBuffer VirtualDisplay=null;//
    public static int VirtualWidth=800;//
    public static int VirtualHeight=600;//
    TextureRegion VirtualRegion=null;
    int physical_width;
    int physical_height;
    public static float scaleX;
    public static float scaleY;

    OrthographicCamera cam;
    BackgroundManagement b1;


    int n=2;
    Menu1 m1;
    GameMap gamemap;
    int positions;
    int speed;
    int y;
    InputManagement keyboard;
    int flag=0;
    public GameScreen(Screen1 game) {
        this.game=game;

        backgroundImage=new BackgroundManagement(game,0,0);
        b1=new BackgroundManagement(0,0);
        road=new Texture("c4.png");
        sprite =new Sprite(new Texture("c4.png"));
        //gamemap=new TileGameMap();
        cam=new OrthographicCamera();
        cam.setToOrtho(false, graphics.getWidth(), graphics.getWidth());
        cam.update();
        img=new Texture("tank2.png");
        positions=0;

        speed=1;
        keyboard=new InputManagement();
        VirtualDisplay=new FrameBuffer(Pixmap.Format.RGB888,VirtualWidth,VirtualHeight,false);
        VirtualRegion=new TextureRegion(VirtualDisplay.getColorBufferTexture());
        VirtualRegion.flip(false,true);
        physical_width= graphics.getWidth();
        physical_height= graphics.getHeight();
        scaleX=(float)VirtualWidth/physical_width;
        scaleY=(float)VirtualHeight/physical_height;
        y=0;


    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0,0,0.2f,1);
        if(Gdx.input.isKeyPressed(LEFT)==true){
            positions-=speed*2;
        }
        else if(Gdx.input.isKeyPressed(RIGHT)==true){
            positions=positions+speed*2;
        }
        else{
            positions=positions;
        }
        VirtualDisplay.begin();
        game.batch.begin();




        game.batch.draw(b1.getBackground(), b1.getBackgroundx(), b1.getBackgroundy(), b1.getScreenwidth(), b1.getScreenheight());


        game.batch.end();
        game.batch.begin();
        sprite.draw(game.batch);

        game.batch.draw(img,positions,150);



        game.batch.end();
        VirtualDisplay.end();
        game.batch.begin();
        game.batch.draw(VirtualRegion,0,0,0,0,physical_width,physical_height,scaleX,scaleY,0);
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
