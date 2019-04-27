/*
 * Unit
 * @author Yura Vashkiv
 */

package game.modal.entities.units;


import game.modal.entities.Copyable;
import game.exceptions.entities.units.UnitException;

import java.util.Objects;

public abstract class Unit implements Copyable{

    protected int health;
    protected int damage;
    protected int radiusOfAttack;
    protected int travelDistance;
    /* TODO: add price */
    /* TODO: add position */

    protected Unit(int health, int damage, int radiusOfAttack, int travelDistance){
        this.health = health;
        this.damage = damage;
        this.radiusOfAttack = radiusOfAttack;
        this.travelDistance = travelDistance;
    }
    /* TODO: add attacking, decreasing health, moving */
    public boolean isAlive(){
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getRadiusOfAttack() {
        return radiusOfAttack;
    }

    public int getTravelDistance() {
        return travelDistance;
    }

    @Override
    public String toString() {
        return "Unit: health="+health+", damage="+damage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(health, damage, radiusOfAttack, travelDistance);
    }

    /* TODO: change equals */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
