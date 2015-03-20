package net.spirulence.sortinggame.sorts;

import com.badlogic.gdx.utils.Array;
import com.google.common.eventbus.EventBus;

/**
 * Created by Cameron Seebach on 3/19/2015.
 */
public class ShellSort {

    private final EventBus events;
    private int h;
    private final Array<Comparable> sortable;

    public ShellSort(EventBus events, Array<Comparable> sortable) {
        this.events = events;
        this.sortable = sortable;

        h = 1;
        while (h < sortable.size / 3) {
            h = 3 * h + 1;
        }
    }

    public boolean hasNext(){
        return h >= 1;
    }

    public void step() {
        // h-sort the array
        for (int i = h; i < sortable.size; i++) {
            for (int j = i; j >= h && less(sortable.get(j), sortable.get(j - h)); j -= h) {
                exch(sortable, j, j - h);
            }
        }
        h /= 3;
    }

    // is v < w ?
    private static boolean less(Comparable v, Comparable w) {
        return (v.compareTo(w) < 0);
    }

    // exchange a[i] and a[j]
    private void exch(Array<Comparable> sortable, int i, int j) {
        Comparable swap = sortable.get(i);
        sortable.set(i, sortable.get(j));
        sortable.set(j, swap);

        events.post(new ElementsExchanged(sortable, i, j));
    }

}
