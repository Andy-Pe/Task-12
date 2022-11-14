package ru.netology.PosterManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PosterManagerTest {
    PosterManager manager = new PosterManager();
    PosterItem item1 = new PosterItem(1, 5, "Matrix1", 1999, "Sci-fi/Action");
    PosterItem item2 = new PosterItem(4, 26, "Matrix2", 1999, "Crime/Action");
    PosterItem item3 = new PosterItem(1, 5, "Matrix3", 1999, "Sci-fi/Action");
    PosterItem item4 = new PosterItem(1, 5, "Matrix4", 1999, "Sci-fi/Action");
    PosterItem item5 = new PosterItem(1, 5, "Matrix5", 1999, "Sci-fi/Action");
    PosterItem item6 = new PosterItem(1, 5, "Matrix6", 1999, "Sci-fi/Action");
    PosterItem item7 = new PosterItem(1, 5, "Matrix7", 1999, "Sci-fi/Action");
    PosterItem item8 = new PosterItem(1, 5, "Matrix8", 1999, "Sci-fi/Action");
    PosterItem item9 = new PosterItem(1, 5, "Matrix9", 1999, "Sci-fi/Action");
    PosterItem item10 = new PosterItem(1, 5, "Matrix10", 1999, "Sci-fi/Action");



    @BeforeEach
    public void setup() {
        manager.addFilm(item1);
        manager.addFilm(item2);
        manager.addFilm(item3);
        manager.addFilm(item4);
        manager.addFilm(item5);
        manager.addFilm(item6);
        manager.addFilm(item7);
        manager.addFilm(item8);
        manager.addFilm(item9);
        manager.addFilm(item10);

    }

    @Test
    public void shouldAddNewFilm() {

        PosterItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10};
        PosterItem[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAdditionAllItems() {

        PosterItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10};
        PosterItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilm() {

        PosterItem[] expected = {item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected,actual);

    }
}