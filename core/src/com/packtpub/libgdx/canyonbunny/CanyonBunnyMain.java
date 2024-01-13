package com.packtpub.libgdx.canyonbunny;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class CanyonBunnyMain extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private static final String TAG = CanyonBunnyMain.class.getName();
	private WorldController worldController;
	private WorldRenderer worldRenderer;
	@Override public void create() {
		worldController = new WorldController();
		worldRenderer = new WorldRenderer(worldController);

	}
	@Override public void render() {
		worldController.update(Gdx.graphics.getDeltaTime());
		worldRenderer.render();
	}
	@Override public void resize(int width, int height) {}
	@Override public void pause() {}
	@Override public void resume() {}
	@Override public void dispose() {
	}

}
