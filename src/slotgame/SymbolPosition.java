/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotgame;

/**
 *
 * @author vitalispiridonov
 */
public class SymbolPosition {
    
    private int line;
    private int reel;

    public SymbolPosition(int line, int reel) {
        this.line = line;
        this.reel = reel;
    }
    
    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getReel() {
        return reel;
    }

    public void setReel(int reel) {
        this.reel = reel;
    }
    
    
}
