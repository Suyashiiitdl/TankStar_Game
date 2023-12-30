package GAME_TILES;

public enum Tiles {
    ROCK(1,true,"rock");
    private int id;
    private boolean collidable;
    private String name;
    private float damage;
    public static final int TILE_SIZE=16;
    private Tiles(int id,boolean collidable,String name){
        this(id,collidable,name,0);
    }
    private Tiles(int id,boolean collidable,String name,float damage){
        this.id=id;
        this.collidable=collidable;
        this.name=name;
        this.damage=damage;
    }

    public boolean isCollidable() {
        return collidable;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public float getDamage() {
        return damage;
    }
}
