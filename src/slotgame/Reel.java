/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author vitalispiridonov
 */
public class Reel {
    
    private List<Symbol> symbols;
    private List<Symbol> dropedSymbols;

    public Reel() {
        dropedSymbols = new ArrayList<Symbol>();
    }
    
    public void drop(Symbol symbol) {
        if (dropedSymbols == null) {
            dropedSymbols = new ArrayList<Symbol>();
        }
        
        dropedSymbols.add(symbol);
    }
    
    public void reset() {
        if (dropedSymbols == null) {
            dropedSymbols = new ArrayList<Symbol>();
        }
        
        dropedSymbols.clear();
    }
    
    public boolean isDropped(Symbol symbol) {
        if (dropedSymbols == null) {
            dropedSymbols = new ArrayList<Symbol>();
        }
        
        return dropedSymbols.contains(symbol);
    }
    
    public void addSymbol(Symbol symbol) {
        if (symbols == null) {
            symbols = new ArrayList();
        }
        
        symbols.add(symbol);
    }
    
    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(symbols, new Random(seed));
        Collections.shuffle(symbols, new Random(seed));
    }

    public List<Symbol> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Symbol> symbols) {
        this.symbols = symbols;
    }
    
    public int countSymbols() {
        if (symbols == null) {
            return 0;
        }
        
        return symbols.size();
    }
    
}
