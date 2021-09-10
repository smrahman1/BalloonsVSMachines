/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloons.tower.defense.culminating;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;
import org.newdawn.slick.SpriteSheet;

/**
 *
 * @author smrahman5566
 */
public class Resources {
    private static Map< String, Image> images;
     private static Map< String, SpriteSheet> sprites;
      private static Map< String, Sound> sounds;
   public Resources(){
    images = new HashMap <String, Image>();
    sprites = new HashMap <String, SpriteSheet>();
    sounds = new HashMap <String, Sound>();
    try {
            images.put("SideMenu",loadImage("res/SideMenu.png"));
        } catch (SlickException e) {
            System.out.println("Game crashed!");
        }
        try {
            images.put("MenuImage",loadImage("res/MenuImage.png"));
        } catch (SlickException e) {
            System.out.println("Game crashed!");
        }
         try {
            sprites.put("RealBalloons",loadSprite("res/RealBalloons.png",63,82));
        } catch (SlickException e) {
            System.out.println("Game crashed!");
        }
         try {
            images.put("BTDMap",loadImage("res/BTDMAP.png"));
        } catch (SlickException e) {
            System.out.println("Game crashed!");
        }
} 
   private Image loadImage(String path) throws SlickException {
   return new Image(path, false, Image.FILTER_NEAREST); 
   }
   private SpriteSheet loadSprite(String path, int tw, int th) throws SlickException {
   return new SpriteSheet(loadImage(path), tw, th); 
   }
   public static Image getImage (String getter){
        return images.get(getter);
    }
    public static Image getSpriteImage (String getter, int x, int y){
        return sprites.get(getter).getSubImage(x,y);
    }
}
