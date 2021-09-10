/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloons.tower.defense.culminating;

import java.util.ArrayList;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author smrahman5566
 */
public class Balloons extends BasicGame {

    static ArrayList<Image> ball = new ArrayList();
    
    static float [] x = new float [20];
      static float [] y = new float [21];
      static int [] direction = new int [20];
    public Balloons(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {

    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gc, Graphics grphcs) throws SlickException {

    }

    static void round1() {
        for (int counter = 0; counter < 20; counter++) {
            ball.add(Resources.getSpriteImage("RealBalloons", 0, 0));
            x[counter]=0;
            y[counter]=263;
             direction[counter]=2;
        }
    }

    static void round2() {
Balloons.ball.clear();
        for (int counter = 0; counter<20;counter++){
        x[counter]=0;
        y[counter]=263;
         direction[counter]=2;
             
                ball.add(Resources.getSpriteImage("RealBalloons", 1, 0));
            }
        
    }

    static void round3() {
        ball.clear();
         for (int counter = 0; counter < 20; counter++) {
            ball.add(Resources.getSpriteImage("RealBalloons", 2, 0));
            x[counter]=0;
            y[counter]=263;
             direction[counter]=2;
        }
    }

    static void round4() {
 ball.clear();
        for (int counter = 0; counter < 20; counter++) {
            ball.add(Resources.getSpriteImage("RealBalloons", 3, 0));
            x[counter]=0;
            y[counter]=263;
             direction[counter]=2;
        }
    }

    static void round5() {
 ball.clear();
         for (int counter = 0; counter < 20; counter++) {
            ball.add(Resources.getSpriteImage("RealBalloons", 4, 0));
            x[counter]=0;
            y[counter]=263;
             direction[counter]=2;
        }
    }

    static void round6() {
 ball.clear();
        for (int counter = 0; counter < 20; counter++) {
            ball.add(Resources.getSpriteImage("RealBalloons", 5, 0));
            x[counter]=0;
            y[counter]=263;
             direction[counter]=2;
        }
    }

    static void round7() {
 ball.clear();
         for (int counter = 0; counter < 20; counter++) {
            ball.add(Resources.getSpriteImage("RealBalloons", 6, 0));
            x[counter]=0;
            y[counter]=263;
             direction[counter]=2;
        }
    }

    static void round8() {
 ball.clear();
       for (int counter = 0; counter < 20; counter++) {
            ball.add(Resources.getSpriteImage("RealBalloons", 3, 0));
            x[counter]=0;
            y[counter]=263;
             direction[counter]=2;
        }
    }

    static void round9() {
 ball.clear();
         for (int counter = 0; counter < 20; counter++) {
            ball.add(Resources.getSpriteImage("RealBalloons",2, 0));
            x[counter]=0;
            y[counter]=263;
             direction[counter]=2;
        }
    }

    static void round10() {
 ball.clear();
         for (int counter = 0; counter < 20; counter++) {
            ball.add(Resources.getSpriteImage("RealBalloons", 1, 0));
            x[counter]=0;
            y[counter]=263;
             direction[counter]=2;
        }

}
}
