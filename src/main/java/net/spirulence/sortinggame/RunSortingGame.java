package net.spirulence.sortinggame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 * Created by Cameron Seebach on 3/18/15.
 */
public class RunSortingGame {


    public static void main(String[] args){
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = 1280;
        config.height = 720;
        config.resizable = false;

        new LwjglApplication(new SortingGame(), config);
    }
}
