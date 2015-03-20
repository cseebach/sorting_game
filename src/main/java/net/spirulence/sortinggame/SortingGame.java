package net.spirulence.sortinggame;

import com.badlogic.gdx.Game;

/**
 * Created by Cameron Seebach on 3/18/15.
 */
public class SortingGame extends Game{
    @Override
    public void create() {
        setScreen(new WorldScreen());
    }
}
