/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotgame;

import slotgame.Symbol;

/**
 *
 * @author vitalispiridonov
 */
public class LineAward {
    
    private Symbol symbol;
    private int lineLenght;
    private int award;

    public LineAward(Symbol symbol, int lineLenght, int award) {
        this.symbol = symbol;
        this.lineLenght = lineLenght;
        this.award = award;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public int getLineLenght() {
        return lineLenght;
    }

    public void setLineLenght(int lineLenght) {
        this.lineLenght = lineLenght;
    }
    
    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.symbol.hashCode();
        hash = 79 * hash + this.lineLenght;
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
        final LineAward other = (LineAward) obj;
        if (!this.symbol.equals(other.symbol)) {
            return false;
        }
        if (this.lineLenght != other.lineLenght) {
            return false;
        }
        return true;
    }

    public LineAward(Symbol symbol, int lineLenght) {
        this.symbol = symbol;
        this.lineLenght = lineLenght;
    }

    @Override
    public String toString() {
        return symbol + "x" + lineLenght + " win " + award;
    }

    
    
    
}
