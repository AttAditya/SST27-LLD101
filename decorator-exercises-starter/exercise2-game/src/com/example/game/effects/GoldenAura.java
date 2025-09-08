package com.example.game.effects;

import com.example.game.Character;

public class GoldenAura implements Character {
    private final Character character;
    private final int speedBoost;
    private final int damageBoost;

    public GoldenAura(Character character) {
        this.character = character;
        this.speedBoost = 3;  // Fixed speed boost
        this.damageBoost = 5; // Fixed damage boost
    }

    @Override
    public void attack() {
        character.attack();
    }

    @Override
    public void move() {
        character.move();
    }

    @Override
    public int getSpeed() {
        return character.getSpeed() + speedBoost;
    }

    @Override
    public int getDamage() {
        return character.getDamage() + damageBoost;
    }

    @Override
    public String getSprite() {
        return character.getSprite() + "_golden";
    }
}
