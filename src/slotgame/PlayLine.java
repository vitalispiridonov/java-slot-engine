/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotgame;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vitalispiridonov
 */
public class PlayLine {

    public static final List<PlayLine> PAYLINES;

    static {
        PAYLINES = new ArrayList<>();

        PlayLine playLine1 = new PlayLine();
        playLine1.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 0));
        playLine1.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 1));
        playLine1.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 2));
        playLine1.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 3));
        playLine1.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 4));
        PAYLINES.add(playLine1);

        PlayLine playLine2 = new PlayLine();
        playLine2.addPoint(new SymbolPosition(Line.LINE_TOP, 0));
        playLine2.addPoint(new SymbolPosition(Line.LINE_TOP, 1));
        playLine2.addPoint(new SymbolPosition(Line.LINE_TOP, 2));
        playLine2.addPoint(new SymbolPosition(Line.LINE_TOP, 3));
        playLine2.addPoint(new SymbolPosition(Line.LINE_TOP, 4));
        PAYLINES.add(playLine2);


        PlayLine playLine3 = new PlayLine();
        playLine3.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 0));
        playLine3.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 1));
        playLine3.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 2));
        playLine3.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 3));
        playLine3.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 4));
        PAYLINES.add(playLine3);




        /*
         * x 0 0 0 x
         * 0 x 0 x 0
         * 0 0 x 0 0
         */

        //= {0,1,2,1,0};

        PlayLine playLine4 = new PlayLine();
        playLine4.addPoint(new SymbolPosition(Line.LINE_TOP, 0));
        playLine4.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 1));
        playLine4.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 2));
        playLine4.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 3));
        playLine4.addPoint(new SymbolPosition(Line.LINE_TOP, 4));
        PAYLINES.add(playLine4);

        /*
         * 0 0 x 0 0
         * 0 x 0 x 0
         * x 0 0 0 x
         */

        PlayLine playLine5 = new PlayLine();
        playLine5.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 0));
        playLine5.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 1));
        playLine5.addPoint(new SymbolPosition(Line.LINE_TOP, 2));
        playLine5.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 3));
        playLine5.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 4));
        PAYLINES.add(playLine5);

        /*
         * 0 x x x 0
         * x 0 0 0 x
         * 0 0 0 0 0
         */

        PlayLine playLine6 = new PlayLine();
        playLine6.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 0));
        playLine6.addPoint(new SymbolPosition(Line.LINE_TOP, 1));
        playLine6.addPoint(new SymbolPosition(Line.LINE_TOP, 2));
        playLine6.addPoint(new SymbolPosition(Line.LINE_TOP, 3));
        playLine6.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 4));
        PAYLINES.add(playLine6);


        /*
         * 0 0 0 0 0
         * x 0 0 0 x
         * 0 x x x 0
         */

        PlayLine playLine7 = new PlayLine();
        playLine7.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 0));
        playLine7.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 1));
        playLine7.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 2));
        playLine7.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 3));
        playLine7.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 4));
        PAYLINES.add(playLine7);


        /*
         * x x 0 0 0
         * 0 0 x 0 0
         * 0 0 0 x x
         */

        PlayLine playLine8 = new PlayLine();
        playLine8.addPoint(new SymbolPosition(Line.LINE_TOP, 0));
        playLine8.addPoint(new SymbolPosition(Line.LINE_TOP, 1));
        playLine8.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 2));
        playLine8.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 3));
        playLine8.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 4));
        PAYLINES.add(playLine8);

        /*
         * - - - x x
         * - - x - -
         * x x - - -
         */

        PlayLine playLine9 = new PlayLine();
        playLine9.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 0));
        playLine9.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 1));
        playLine9.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 2));
        playLine9.addPoint(new SymbolPosition(Line.LINE_TOP, 3));
        playLine9.addPoint(new SymbolPosition(Line.LINE_TOP, 4));
        PAYLINES.add(playLine9);

        /*
         * - x - x -
         * x - x - x
         * - - - - -
         */

        PlayLine playLine10 = new PlayLine();
        playLine10.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 0));
        playLine10.addPoint(new SymbolPosition(Line.LINE_TOP, 1));
        playLine10.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 2));
        playLine10.addPoint(new SymbolPosition(Line.LINE_TOP, 3));
        playLine10.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 4));
        PAYLINES.add(playLine10);

        /*
         * - - - - -
         * x - x - x
         * - x - x - 
         */

        PlayLine playLine11 = new PlayLine();
        playLine11.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 0));
        playLine11.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 1));
        playLine11.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 2));
        playLine11.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 3));
        playLine11.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 4));
        PAYLINES.add(playLine10);
        
        /*
         * x - - - x
         * - x x x -
         * - - - - - 
         */

        PlayLine playLine12 = new PlayLine();
        playLine12.addPoint(new SymbolPosition(Line.LINE_TOP, 0));
        playLine12.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 1));
        playLine12.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 2));
        playLine12.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 3));
        playLine12.addPoint(new SymbolPosition(Line.LINE_TOP, 4));
        PAYLINES.add(playLine12);

        /*
         * - - - - -
         * - x x x -
         * x - - - x 
         */

        PlayLine playLine13 = new PlayLine();
        playLine13.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 0));
        playLine13.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 1));
        playLine13.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 2));
        playLine13.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 3));
        playLine13.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 4));
        PAYLINES.add(playLine13);

        /*
         * x - x - x
         * - x - x -
         * - - - - - 
         */

        PlayLine playLine14 = new PlayLine();
        playLine14.addPoint(new SymbolPosition(Line.LINE_TOP, 0));
        playLine14.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 1));
        playLine14.addPoint(new SymbolPosition(Line.LINE_TOP, 2));
        playLine14.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 3));
        playLine14.addPoint(new SymbolPosition(Line.LINE_TOP, 4));
        PAYLINES.add(playLine14);

        /*
         * - - - - -
         * - x - x -
         * x - x - x 
         */

        PlayLine playLine15 = new PlayLine();
        playLine15.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 0));
        playLine15.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 1));
        playLine15.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 2));
        playLine15.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 3));
        playLine15.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 4));
        PAYLINES.add(playLine15);

        /*
         * - - x - -
         * x x - x x
         * - - - - - 
         */

        PlayLine playLine16 = new PlayLine();
        playLine16.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 0));
        playLine16.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 1));
        playLine16.addPoint(new SymbolPosition(Line.LINE_TOP, 2));
        playLine16.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 3));
        playLine16.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 4));
        PAYLINES.add(playLine16);

        /*
         * - - - - -
         * x x - x x
         * - - x - - 
         */

        PlayLine playLine17 = new PlayLine();
        playLine17.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 0));
        playLine17.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 1));
        playLine17.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 2));
        playLine17.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 3));
        playLine17.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 4));
        PAYLINES.add(playLine17);

        /*
         * x x - x x
         * - - - - -
         * - - x - - 
         */

        PlayLine playLine18 = new PlayLine();
        playLine18.addPoint(new SymbolPosition(Line.LINE_TOP, 0));
        playLine18.addPoint(new SymbolPosition(Line.LINE_TOP, 1));
        playLine18.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 2));
        playLine18.addPoint(new SymbolPosition(Line.LINE_TOP, 3));
        playLine18.addPoint(new SymbolPosition(Line.LINE_TOP, 4));
        PAYLINES.add(playLine18);

        /*
         * - - x - - 
         * - - - - -
         * x x - x x
         */

        PlayLine playLine19 = new PlayLine();
        playLine19.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 0));
        playLine19.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 1));
        playLine19.addPoint(new SymbolPosition(Line.LINE_TOP, 2));
        playLine19.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 3));
        playLine19.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 4));
        PAYLINES.add(playLine19);

        /*
         * x - - - x
         * - - - - -
         * - x x x -
         */

        PlayLine playLine20 = new PlayLine();
        playLine20.addPoint(new SymbolPosition(Line.LINE_TOP, 0));
        playLine20.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 1));
        playLine20.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 2));
        playLine20.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 3));
        playLine20.addPoint(new SymbolPosition(Line.LINE_TOP, 4));
        PAYLINES.add(playLine20);
        
        /*
         * - x x x -
         * - - - - -
         * x - - - x
         */

        PlayLine playLine21 = new PlayLine();
        playLine21.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 0));
        playLine21.addPoint(new SymbolPosition(Line.LINE_TOP, 1));
        playLine21.addPoint(new SymbolPosition(Line.LINE_TOP, 2));
        playLine21.addPoint(new SymbolPosition(Line.LINE_TOP, 3));
        playLine21.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 4));
        PAYLINES.add(playLine21);

        /*
         * - x - x -
         * x - - - x
         * - - x - -
         */

        PlayLine playLine22 = new PlayLine();
        playLine22.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 0));
        playLine22.addPoint(new SymbolPosition(Line.LINE_TOP, 1));
        playLine22.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 2));
        playLine22.addPoint(new SymbolPosition(Line.LINE_TOP, 3));
        playLine22.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 4));
        PAYLINES.add(playLine22);
            
        /*
         * - - x - -
         * x - - - x
         * - x - x -
         */

        PlayLine playLine23 = new PlayLine();
        playLine23.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 0));
        playLine23.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 1));
        playLine23.addPoint(new SymbolPosition(Line.LINE_TOP, 2));
        playLine23.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 3));
        playLine23.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 4));
        PAYLINES.add(playLine23);
        /*
         * x - x - x
         * - - - - -
         * - x - x -
         */

        PlayLine playLine24 = new PlayLine();
        playLine24.addPoint(new SymbolPosition(Line.LINE_TOP, 0));
        playLine24.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 1));
        playLine24.addPoint(new SymbolPosition(Line.LINE_TOP, 2));
        playLine24.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 3));
        playLine24.addPoint(new SymbolPosition(Line.LINE_TOP, 4));
        PAYLINES.add(playLine24);

        /*
         * - x - x -
         * - - - - -
         * x - x - x
         */

        PlayLine playLine25 = new PlayLine();
        playLine25.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 0));
        playLine25.addPoint(new SymbolPosition(Line.LINE_TOP, 1));
        playLine25.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 2));
        playLine25.addPoint(new SymbolPosition(Line.LINE_TOP, 3));
        playLine25.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 4));
        PAYLINES.add(playLine25);

        /*
         * x - - x -
         * - - x - -
         * - x - - x
         */

        PlayLine playLine26 = new PlayLine();
        playLine26.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 0));
        playLine26.addPoint(new SymbolPosition(Line.LINE_TOP, 1));
        playLine26.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 2));
        playLine26.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 3));
        playLine26.addPoint(new SymbolPosition(Line.LINE_TOP, 4));
        PAYLINES.add(playLine26);
        
        /*
         * - x - - x
         * - - x - -
         * x - - x -
         */
        PlayLine playLine27 = new PlayLine();
        playLine27.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 0));
        playLine27.addPoint(new SymbolPosition(Line.LINE_TOP, 1));
        playLine27.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 2));
        playLine27.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 3));
        playLine27.addPoint(new SymbolPosition(Line.LINE_TOP, 4));
        PAYLINES.add(playLine27);

        /*
         * x - - - -
         * - x - - x
         * - - x x -
         */

        PlayLine playLine28 = new PlayLine();
        playLine28.addPoint(new SymbolPosition(Line.LINE_TOP, 0));
        playLine28.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 1));
        playLine28.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 2));
        playLine28.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 3));
        playLine28.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 4));
        PAYLINES.add(playLine28);

        /*
         * - - x x -
         * - x - - x
         * x - - - -
         */

        PlayLine playLine29 = new PlayLine();
        playLine29.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 0));
        playLine29.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 1));
        playLine29.addPoint(new SymbolPosition(Line.LINE_TOP, 2));
        playLine29.addPoint(new SymbolPosition(Line.LINE_TOP, 3));
        playLine29.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 4));
        PAYLINES.add(playLine29);

        /*
         * - - - x -
         * - x - - x
         * x - x - -
         */

        PlayLine playLine30 = new PlayLine();
        playLine30.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 0));
        playLine30.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 1));
        playLine30.addPoint(new SymbolPosition(Line.LINE_BOTTOM, 2));
        playLine30.addPoint(new SymbolPosition(Line.LINE_TOP, 3));
        playLine30.addPoint(new SymbolPosition(Line.LINE_MIDDLE, 4));
        PAYLINES.add(playLine30);


    }
    private List<SymbolPosition> points;

    public List<SymbolPosition> getPoints() {
        return points;
    }

    public void setPoints(List<SymbolPosition> points) {
        this.points = points;
    }

    public void addPoint(SymbolPosition point) {
        if (points == null) {
            points = new ArrayList<SymbolPosition>();
        }

        points.add(point);
    }
}
