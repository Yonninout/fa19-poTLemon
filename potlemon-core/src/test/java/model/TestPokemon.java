package model;

import static org.junit.Assert.*;

import org.junit.Test;

import potlemon.model.Pokemon;

public class TestPokemon {

    @Test
    public void TestLostHp() {
        Pokemon p = new Pokemon(200);
        p.lostPV(20);
        assertEquals(180, p.getHp());
    }

    @Test
    public void TestAddHp() {
        Pokemon p = new Pokemon(200);
        p.addPV(20);
        assertEquals(220, p.getHp());
    }

    @Test
    public void TestHeal() {
        Pokemon p = new Pokemon(200);
        p.lostPV(20);
        assertEquals(180, p.getHp());
        p.heal();
        assertEquals(p.getHpMax(), p.getHp());
    }

}


