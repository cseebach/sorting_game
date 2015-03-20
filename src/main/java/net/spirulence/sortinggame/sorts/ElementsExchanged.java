package net.spirulence.sortinggame.sorts;

import com.badlogic.gdx.utils.Array;

/**
 * Created by Cameron Seebach on 3/19/2015.
 */
public class ElementsExchanged {
    public final Array<Comparable> sorting;
    public final int index1;
    public final int index2;

    public ElementsExchanged(Array<Comparable> sorting, int index1, int index2) {
        this.sorting = sorting;
        this.index1 = index1;
        this.index2 = index2;
    }
}
