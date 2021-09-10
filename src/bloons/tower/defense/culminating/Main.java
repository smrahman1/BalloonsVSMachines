/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloons.tower.defense.culminating;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author smrahman5566
 */
public class Main extends StateBasedGame{

   public static boolean _APPLET=true;
    public static void main(String[] args) {
        _APPLET=false;
        File f = new File("natives");
        if (f.exists())System.setProperty("org.lwjgl.librarypath", f.getAbsolutePath());
        try {
            AppGameContainer game = new AppGameContainer(new Main());
            game.setDisplayMode(Window.Width, Window.Height, false);
            game.start();
        } catch (SlickException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Main() {
        super("BloonsTowerDefenseCulminating");
    }

    
    @Override
    public void initStatesList(GameContainer gc) throws SlickException {
        gc.setTargetFrameRate(60);
    gc.setAlwaysRender(true);
    gc.setMaximumLogicUpdateInterval(60);
    gc.setVSync(true);
    gc.setShowFPS(false);
    
       new Resources();
        this.addState(new Menu());
    this.addState(new GameState());

    }
    
}

