/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloons.tower.defense.culminating;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author smrahman5566
 */
public class Menu extends BasicGameState{

    @Override
    public int getID() {
        return States.MENU;
      
    }

    @Override
    public void init(GameContainer gc, StateBasedGame s) throws SlickException {
       
    }

    @Override
    public void render(GameContainer gc, StateBasedGame s, Graphics g) throws SlickException {
        Resources.getImage("MenuImage").draw(0,0,800,600);
       

    }

    @Override
    public void update(GameContainer gc, StateBasedGame s, int i) throws SlickException {
        Input input = gc.getInput();
        
 
        if (input.isMousePressed(Input.MOUSE_LEFT_BUTTON)){

     if (Mouse.getX()>=55&& Mouse.getY()<=495 && Mouse.getX()<=735 && Mouse.getY()>=311) {
         Balloons.round1();
         s.enterState(States.GAME);
     }
     if (Mouse.getX()>=55&& Mouse.getY()<=262 && Mouse.getX()<=735 && Mouse.getY()>=81) {
        gc.exit();
     }
     }
    }
    

    }

