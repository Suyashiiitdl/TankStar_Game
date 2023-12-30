package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import static com.badlogic.gdx.Input.Keys.*;


public class Screen1 extends Game {
	SpriteBatch batch;

	Menu1 firstScreen;

	Screen2 secoundScreen;

	/*
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

	 */
	@Override
	public void create () {
		batch = new SpriteBatch();
		//menu1
		firstScreen=new Menu1();

		//menu2
		secoundScreen=new Screen2(this);


		/*
		b1=new BackgroundManagement(0,0);
		road=new Texture("c4.png");
		sprite =new Sprite(new Texture("c4.png"));
		gamemap=new TileGameMap();
		cam=new OrthographicCamera();
		cam.setToOrtho(false, graphics.getWidth(),Gdx.graphics.getWidth());
		cam.update();
		img=new Texture("tankdemo.png");
		positions=0;

		speed=1;
		keyboard=new InputManagement();
		VirtualDisplay=new FrameBuffer(Pixmap.Format.RGB888,VirtualWidth,VirtualHeight,false);
		VirtualRegion=new TextureRegion(VirtualDisplay.getColorBufferTexture());
		VirtualRegion.flip(false,true);
		physical_width=Gdx.graphics.getWidth();
		physical_height=Gdx.graphics.getHeight();
		scaleX=(float)VirtualWidth/physical_width;
		scaleY=(float)VirtualHeight/physical_height;
		y=0;


		 */
	}


	@Override
	public void render() {
		//MENU1 RENDERING AND IF PRESS SPACE THEN STOP COME TO MENU2
		if(firstScreen.getflag()==0){
			firstScreen.Menu1Render(batch);
			if(Gdx.input.isKeyPressed(SPACE)==true){
				firstScreen.setflag(1);
				firstScreen.menu1dispose();
			}
		}
		else if(firstScreen.getflag()==1){
			if(InputManagement.flag_for_play==0) {
				this.setScreen(secoundScreen);
				super.render();
			}
			else{
				System.out.println("so sorry");
			}
		}
		else{
			System.out.println("rendering");
		}
		System.out.println("hello");
		if(InputManagement.flag_for_play==1){
			if(Menu3.Menu3flag==1) {

				this.setScreen(new GameScreen(this));
				super.render();
			}
			else{
				this.setScreen(new Menu3(this));
				super.render();
			}
		}







		/*
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
		batch.begin();
		/*if(flag==0) {
			m1.Menu1Render(batch);

		}
		else{
			flag=1;
		}
		flag=1;

		 */
		/*if(y!= graphics.getHeight()) {


			batch.draw(b1.getBackground(), b1.getBackgroundx(), b1.getBackgroundy(), 0, y, b1.getScreenwidth(), b1.getScreenheight());

			y += 1;

		}
		else{
			batch.draw(b1.getBackground(), b1.getBackgroundx(), b1.getBackgroundy(), b1.getScreenwidth(), b1.getScreenheight());

		}
		batch.end();
		batch.begin();
		//gamemap.render(cam);

		//batch.draw(road,0,0,1280,195);
		sprite.draw(batch);

		batch.draw(img,positions,150);



		batch.end();
		VirtualDisplay.end();
		batch.begin();
		batch.draw(VirtualRegion,0,0,0,0,physical_width,physical_height,scaleX,scaleY,0);
		batch.end();

		 */



	}
	@Override
	public void dispose(){

	}
}
