package ru.netology.PosterManager;

public class PosterManager {

    private PosterItem[] items = new PosterItem[0];
    private int limit;

    public PosterManager() {
        this.limit = 10;

    }

    public PosterManager(int limit) {
        this.limit = limit;
    }


    public void addFilm(PosterItem item) {
        PosterItem[] tmp = new PosterItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public PosterItem[] getItems() {
        return items;
    }

    public PosterItem[] findAll() {
        PosterItem[] addition = new PosterItem[getItems().length];
        for (int i = 0; i < addition.length; i++) {
            addition[i] = items[i];
        }
        return addition;

    }

    public PosterItem[] findLast() {
        int resultLength;
        if (items.length < limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        PosterItem[] tmp = new PosterItem[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = items[items.length - 1 - i];
        }
        return tmp;
    }
}


