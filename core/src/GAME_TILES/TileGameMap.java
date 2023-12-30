package GAME_TILES;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class TileGameMap extends GameMap{
    TiledMap tilemap;
    OrthogonalTiledMapRenderer tiledMapRenderer;

    public TileGameMap(){
        tilemap=new TmxMapLoader().load("fuck.tmx");
        tiledMapRenderer =new OrthogonalTiledMapRenderer(tilemap);
    }
    @Override
    public void render(OrthographicCamera camera) {
        tiledMapRenderer.setView(camera);
        tiledMapRenderer.render();
    }

    @Override
    public void update(float delta) {

    }

    @Override
    public void dispose() {

    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getLayers() {
        return 0;
    }

    @Override
    public Tiles gettilestypeloc(int Layers, float col, float row) {
        return null;
    }
}
