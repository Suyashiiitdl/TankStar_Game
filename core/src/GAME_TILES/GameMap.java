package GAME_TILES;

import com.badlogic.gdx.graphics.OrthographicCamera;


public abstract class GameMap {
    public abstract void render(OrthographicCamera camera);
    public abstract void update(float delta);
    public abstract void dispose();
    public abstract int getHeight();
    public abstract int getWidth();
    public abstract int getLayers();
    public  Tiles gettilestype(int Layers,float x,float y){
        return this.gettilestypeloc( Layers,(int)(x/Tiles.TILE_SIZE),(int)(y/Tiles.TILE_SIZE));
    }
    public abstract Tiles gettilestypeloc(int Layers,float col,float row);

}
