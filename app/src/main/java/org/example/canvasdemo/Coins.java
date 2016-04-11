package org.example.canvasdemo;
import android.view.View;

import java.util.Random;

/**
 * Created by martindamm on 11/04/16.
 */
public class Coins {
    Random r = new Random();
    private int xCircle;
    private int yCircle;

    boolean taken = false;

    public Coins() {

        xCircle = r.nextInt(400);
        yCircle = r.nextInt(400);
    }

    // GET
    public int getxCircle(){
        return this.xCircle;
    }

    public void setxCircle(int xCircle){
        this.xCircle = r.nextInt(400);
    }

    // GET
    public int getyCircle(){
        return this.yCircle;
    }
    public void setyCircle(int yCircle){
        this.yCircle = r.nextInt(400);
    }
}
