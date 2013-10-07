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
public class Line {
    
    public static final int LINE_TOP = 0;
    public static final int LINE_MIDDLE = 1;
    public static final int LINE_BOTTOM = 2;
    
    private List<Symbol> symbols;
    
    public void addSymbol(Symbol symbol) {
        if (symbols == null) {
            symbols = new ArrayList();
        }
        
        symbols.add(symbol);
    }
    
    public void addSymbols(List<Symbol> symbolsList) {
        if (symbols == null) {
            symbols = new ArrayList();
        }
        
        symbols.addAll(symbolsList);
    }

    public List<Symbol> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Symbol> symbols) {
        this.symbols = symbols;
    }
    
    public boolean contains(Symbol symbol) {
        return symbols.contains(symbol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        for (Symbol s: symbols) {
            sb.append(s.toString()).append(" ");
        }
        
        return sb.toString().trim();
    }

}
