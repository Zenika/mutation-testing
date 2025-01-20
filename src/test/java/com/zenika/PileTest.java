package com.zenika;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PileTest {

    @Test
    public void testPushPop() {
        Pile pile = new Pile(3);
        pile.push(0);
        assertEquals(0, pile.pop());
    }

    @Test
    public void testIsEmpty() {
        Pile pile = new Pile(0);
        assertTrue(pile.isEmpty());
    }

    @Test
    public void testIsFull() {
        Pile pile = new Pile(1);
        assertFalse(pile.isFull());
    }
}