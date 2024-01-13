package com.packtpub.libgdx.canyonbunny;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.MathUtils;

public class WorldController {
    private static final String TAG = WorldController.class.getName();

    public int selectedSprite;
    Texture backgroundTexture;
    Texture stage3;
    public WorldController() {
        init();

    }
    private void init() {
        initTestObjects();
    }

    private void initTestObjects() {
        String imgBackground = "background.jpg";
        backgroundTexture = new Texture(Gdx.files.internal(imgBackground));
        String imgStage3 = "stage3_chara.png";
        stage3 = new Texture(imgStage3);
        selectedSprite = 0;
    }

    public void update(float deltaTime) {
        updateTestObjects(deltaTime);
    }


    private void updateTestObjects(float deltaTime) {
        // Get current rotation from selected sprite
//        float rotation = testSprites[selectedSprite].getRotation();
//        // Rotate sprite by 90 degrees per second
//
//        rotation += 90 * deltaTime;
//        // Wrap around at 360 degrees
//        rotation %= 360;
//        // Set new rotation value to selected sprite
//        for (int i = 0; i < testSprites.length; i++) {
//
//            testSprites[i].setRotation(rotation);
//        }
    }

}
