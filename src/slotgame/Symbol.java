/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotgame;

/**
 *
 * @author vitalispiridonov
 */
public class Symbol {

    private double chance;
    private int type;
    
    public Symbol(double chance, int type) {
        this.chance = chance;
        this.type = type;
    }

    public double getChance() {
        return chance;
    }

    public void setChance(double chance) {
        this.chance = chance;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + "";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Symbol other = (Symbol) obj;
        if (this.type != other.type) {
            return false;
        }
        return true;
    }
    
}
