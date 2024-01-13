package com.packtpub.libgdx.canyonbunny;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Disposable;

import sun.security.pkcs11.wrapper.Constants;

public class WorldRenderer implements Disposable {
    private OrthographicCamera camera;
    private SpriteBatch batch;
    private WorldController worldController;
    public static final float VIEWPORT_WIDTH = 5;
    public static final float VIEWPORT_HEIGHT = 5;

    public WorldRenderer(WorldController worldController) {
        this.worldController = worldController;
        init();
    }
    private void init() {
        batch = new SpriteBatch();
        camera = new OrthographicCamera(VIEWPORT_WIDTH,VIEWPORT_HEIGHT);
        camera.position.set(0, 0, 0);
        camera.update();

    }
    public void render() {
        renderTestObjects();
    }
    public void resize(int width, int height) {
        camera.viewportWidth = (VIEWPORT_HEIGHT / height) *
                width;
        camera.update();
    }
    @Override public void dispose() {
        batch.dispose();
    }
    private void renderTestObjects() {
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(worldController.backgroundTexture, camera.position.x - camera.viewportWidth / 2,
                camera.position.y - camera.viewportHeight / 2, camera.viewportWidth,
                camera.viewportHeight);
        batch.draw(worldController.stage3,0,0,1,1);
        batch.end();
    }
}
