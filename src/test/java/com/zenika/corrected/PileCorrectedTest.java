package com.zenika.corrected;

import org.junit.jupiter.api.Test;

import com.zenika.Pile;

import static org.junit.jupiter.api.Assertions.*;

public class PileCorrectedTest {

    @Test
    public void testPushPop() {
        Pile pile = new Pile(3);
        assertThrows(IllegalStateException.class, pile::pop);
        pile.push(1);
        pile.push(2);
        pile.push(3);
        assertEquals(3, pile.pop());
        assertEquals(2, pile.pop());
        assertEquals(1, pile.pop());
    }

    @Test
    public void testIsEmpty() {
        Pile pile = new Pile(3);
        assertTrue(pile.isEmpty());
        pile.push(1);
        assertFalse(pile.isEmpty());
        pile.pop();
        assertTrue(pile.isEmpty());
    }

    @Test
    public void testIsFull() {
        Pile pile = new Pile(2);
        pile.push(1);
        pile.push(2);
        assertTrue(pile.isFull());
        assertThrows(IllegalStateException.class, () -> pile.push(3));
    }
}