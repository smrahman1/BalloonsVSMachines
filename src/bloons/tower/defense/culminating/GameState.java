package bloons.tower.defense.culminating;

import java.awt.Shape;
import java.util.ArrayList;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GameState extends BasicGameState {
    private Circle turret1 = null;
    private Circle turret2 = null;
    private Circle turret3 = null;
    private Circle turret4 = null;
    private Circle shoot = null;
    //  private Circle test = null;
    int ballcheck = 0;
    int money = 100;
    int lives = 0;
    int totallives = 20;
    int a = 0;
    int c = 0;
    int c2 = 0;
    int c4 = 0;
    int c3 = 0;
    float d2 = 0;
    float d3 = 0;
    float d4 = 0;
    int ye = 1;
    int counter = 0;
    float b = (float) 0.5;
    int mousex;
    int mousey;
    int potato = 0;
    int potato2 = 0;
    int potato3 = 0;
    int potato4 = 0;
    float collision = 0;
    boolean letgo = false;
    boolean letgo2 = false;
    boolean letgo3 = false;
    boolean letgo4 = false;
    float Targetd = 625;

    float changex = 0;
    ArrayList < Integer > xpos = new ArrayList < Integer > ();
    ArrayList < Integer > ypos = new ArrayList < Integer > ();
    ArrayList < Circle > circle1 = new ArrayList < Circle > ();
    ArrayList < Circle > circle2 = new ArrayList < Circle > ();
    ArrayList < Circle > circle3 = new ArrayList < Circle > ();
    ArrayList < Circle > circle4 = new ArrayList < Circle > ();
    @Override
    public int getID() {
        return States.GAME;

    }

    @Override
    public void init(GameContainer gc, StateBasedGame s) throws SlickException {
        turret1 = new Circle(750, 50, 25, 25);
        turret2 = new Circle(750, 50, 25, 25);
        turret3 = new Circle(750, 50, 25, 25);
        turret4 = new Circle(750, 50, 25, 25);
        shoot = new Circle(900, 700, 75, 75);
    }

    @Override
    public void render(GameContainer gc, StateBasedGame s, Graphics g) throws SlickException {
        Input input = gc.getInput();

        Resources.getImage("BTDMap").draw(0, 0, 700, 600);
        Resources.getImage("SideMenu").draw(700, 0, 100, 600);
        g.setColor(Color.white);
        //      g.drawString(input.getMouseX()+"", 0, 0);
        //    g.drawString(input.getMouseY()+"", 0, 30);
        g.setColor(Color.red);
        g.drawString("$100", 730, 80);
        g.fill(turret1);
        g.setColor(Color.blue);
        g.drawString("$200", 730, 205);
        turret2 = new Circle(750, 175, 25, 25);
        g.fill(turret2);
        g.setColor(Color.green);
        g.drawString("$300", 730, 330);
        turret3 = new Circle(750, 300, 25, 25);
        g.fill(turret3);
        g.setColor(Color.yellow);
        g.drawString("$400", 730, 455);
        turret4 = new Circle(750, 420, 25, 25);
        g.fill(turret4);

        g.drawString("Lives: " + Integer.toString(totallives), 400, 0);
        g.drawString("$" + Integer.toString(money), 600, 0);



        for (int counter = 0; counter < circle1.size(); counter++) {
            g.setColor(Color.red);
            g.fill(circle1.get(counter));

            if (c > 2500 && c < 3000) {
                for (int counter1 = 0; counter1 < circle1.size(); counter1++) {

                    g.setColor(new Color(255, 0, 0, 100));
                    shoot.setCenterX(circle1.get(counter1).getCenterX());
                    shoot.setCenterY(circle1.get(counter1).getCenterY());
                    g.fill(shoot);
                    for (int counter4 = 0; counter4 < Balloons.ball.size(); counter4++) {
                        collision = (float)(Math.pow(shoot.getCenterX() - (Balloons.x[counter4] + 20), 2) + Math.pow(shoot.getCenterY() - (Balloons.y[counter4] + 20), 2));
                        if (collision < Math.pow(70 + 20, 2)) {
                            lives++;
                            money += 10;
                            Balloons.x[counter4] = 390;
                            Balloons.y[counter4] = -50;
                            Balloons.direction[counter4] = 1;
                        }
                    }
                }
            } else {
                if (c > 3000) {
                    shoot.setX(900);
                    shoot.setY(800);
                    c = 0;
                }
                //shooting


            }
        }

        for (int counter2 = 0; counter2 < circle2.size(); counter2++) {
            g.setColor(Color.blue);
            g.fill(circle2.get(counter2));

            if (c2 > 1500 && c2 < 2000) {
                for (int counter1 = 0; counter1 < circle2.size(); counter1++) {

                    g.setColor(new Color(0, 0, 255, 100));
                    shoot.setCenterX(circle2.get(counter1).getCenterX());
                    shoot.setCenterY(circle2.get(counter1).getCenterY());
                    g.fill(shoot);
                    for (int counter4 = 0; counter4 < Balloons.ball.size(); counter4++) {
                        collision = (float)(Math.pow(shoot.getCenterX() - (Balloons.x[counter4] + 20), 2) + Math.pow(shoot.getCenterY() - (Balloons.y[counter4] + 20), 2));
                        if (collision < Math.pow(70 + 20, 2)) {
                            lives++;
                            money += 10;
                            Balloons.x[counter4] = 390;
                            Balloons.y[counter4] = -50;
                            Balloons.direction[counter4] = 1;
                        }
                    }
                }
            } else {
                if (c2 > 2000) {
                    shoot.setX(900);
                    shoot.setY(800);
                    c2 = 0;
                }
                //shooting


            }
        }
        for (int counter2 = 0; counter2 < circle4.size(); counter2++) {
            g.setColor(Color.yellow);
            g.fill(circle4.get(counter2));

            if (c4 > 500 && c4 < 1000) {
                for (int counter1 = 0; counter1 < circle4.size(); counter1++) {

                    g.setColor(new Color(255, 255, 0, 100));
                    shoot.setCenterX(circle4.get(counter1).getCenterX());
                    shoot.setCenterY(circle4.get(counter1).getCenterY());
                    g.fill(shoot);
                    for (int counter4 = 0; counter4 < Balloons.ball.size(); counter4++) {
                        collision = (float)(Math.pow(shoot.getCenterX() - (Balloons.x[counter4] + 20), 2) + Math.pow(shoot.getCenterY() - (Balloons.y[counter4] + 20), 2));
                        if (collision < Math.pow(70 + 20, 2)) {
                            lives++;
                            money += 10;
                            Balloons.x[counter4] = 390;
                            Balloons.y[counter4] = -50;
                            Balloons.direction[counter4] = 1;
                        }
                    }
                }
            } else {
                if (c4 > 1000) {
                    shoot.setX(900);
                    shoot.setY(800);
                    c4 = 0;
                }
                //shooting


            }
        }
        for (int counter2 = 0; counter2 < circle3.size(); counter2++) {
            g.setColor(Color.green);
            g.fill(circle3.get(counter2));

            if (c3 > 1000 && c3 < 1500) {
                for (int counter1 = 0; counter1 < circle3.size(); counter1++) {

                    g.setColor(new Color(0, 255, 0, 100));
                    shoot.setCenterX(circle3.get(counter1).getCenterX());
                    shoot.setCenterY(circle3.get(counter1).getCenterY());
                    g.fill(shoot);
                    for (int counter4 = 0; counter4 < Balloons.ball.size(); counter4++) {
                        collision = (float)(Math.pow(shoot.getCenterX() - (Balloons.x[counter4] + 20), 2) + Math.pow(shoot.getCenterY() - (Balloons.y[counter4] + 20), 2));
                        if (collision < Math.pow(70 + 20, 2)) {
                            lives++;
                            money += 25;
                            Balloons.x[counter4] = 390;
                            Balloons.y[counter4] = -50;
                            Balloons.direction[counter4] = 1;
                        }
                    }
                }
            } else {
                if (c3 > 1500) {
                    shoot.setX(900);
                    shoot.setY(800);
                    c3 = 0;
                }
                //shooting


            }
        }
        for (int i = 0; i < counter; i++) {
            Balloons.ball.get(i).draw(Balloons.x[i], Balloons.y[i], 40, 40);
            //     test = new Circle(Balloons.x[i]+20,Balloons.y[i]+20,20,20);
            //     g.draw(test);
        }

    }

    @Override
    public void update(GameContainer gc, StateBasedGame s, int i) throws SlickException {
        a += i;
        c += i;
        c2 += i;
        c3 += i;
        c4 += i;
        Input input = gc.getInput();

        mousex = input.getMouseX();
        mousey = input.getMouseY();


        float d = (float)(Math.pow(mousex - turret1.getCenterX(), 2) + Math.pow(mousey - turret1.getCenterY(), 2));
        if (d < Targetd && money >= 100) {
            letgo = input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON);
        }

        if (letgo) {
            if (potato == 0) {
                circle1.add(new Circle(turret1.getCenterX(), turret1.getCenterY(), 25, 25));
                potato++;
                money -= 100;
            }


            if (input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON)) {
                circle1.get(circle1.size() - 1).setCenterX(mousex);
                circle1.get(circle1.size() - 1).setCenterY(mousey);
            } else if (!(input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON)) && mousex < 700) {
                letgo = false;
                potato = 0;
            }
        }



        d2 = (float)(Math.pow(mousex - turret2.getCenterX(), 2) + Math.pow(mousey - turret2.getCenterY(), 2));
        if (d2 < Targetd && money >= 200) {
            letgo2 = input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON);
        }

        if (letgo2) {
            if (potato2 == 0) {

                circle2.add(new Circle(turret2.getCenterX(), turret2.getCenterY(), 25, 25));
                potato2++;
                money -= 200;
            }


            if (input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON)) {
                circle2.get(circle2.size() - 1).setCenterX(mousex);
                circle2.get(circle2.size() - 1).setCenterY(mousey);
            } else if (!(input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON)) && mousex < 700) {
                letgo2 = false;
                potato2 = 0;
            }
        }

        d3 = (float)(Math.pow(mousex - turret3.getCenterX(), 2) + Math.pow(mousey - turret3.getCenterY(), 2));
        if (d3 < Targetd && money >= 200) {
            letgo3 = input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON);
        }

        if (letgo3) {
            if (potato3 == 0) {

                circle3.add(new Circle(turret3.getCenterX(), turret3.getCenterY(), 25, 25));
                potato3++;
                money -= 300;
            }


            if (input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON)) {
                circle3.get(circle3.size() - 1).setCenterX(mousex);
                circle3.get(circle3.size() - 1).setCenterY(mousey);
            } else if (!(input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON)) && mousex < 700) {
                letgo3 = false;
                potato3 = 0;
            }
        }
        d4 = (float)(Math.pow(mousex - turret4.getCenterX(), 2) + Math.pow(mousey - turret4.getCenterY(), 2));
        if (d4 < Targetd && money >= 200) {
            letgo4 = input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON);
        }

        if (letgo4) {
            if (potato4 == 0) {

                circle4.add(new Circle(turret4.getCenterX(), turret4.getCenterY(), 25, 25));
                potato4++;
                money -= 400;
            }


            if (input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON)) {
                circle4.get(circle4.size() - 1).setCenterX(mousex);
                circle4.get(circle4.size() - 1).setCenterY(mousey);
            } else if (!(input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON)) && mousex < 700) {
                letgo4 = false;
                potato4 = 0;
            }
        }

        //Balloon movement
        for (int directioncount = 0; directioncount < counter; directioncount++) {
            //           
            if (Balloons.direction[directioncount] == 2) {
                if (Balloons.x[directioncount] > 130 && Balloons.x[directioncount] < 350 && Balloons.y[directioncount] > 240 && Balloons.y[directioncount] < 300) {
                    Balloons.direction[directioncount] = 1;
                } else if (Balloons.y[directioncount] < 110 && Balloons.y[directioncount] > 0 && Balloons.x[directioncount] > 300 && Balloons.x[directioncount] < 350) {
                    Balloons.direction[directioncount] = 3;
                } else if (Balloons.y[directioncount] > 500 && Balloons.y[directioncount] < 550 && Balloons.x[directioncount] > 600 && Balloons.x[directioncount] < 800) {
                    Balloons.direction[directioncount] = 1;
                } else if (Balloons.x[directioncount] > 620 && Balloons.x[directioncount] < 660 && Balloons.y[directioncount] < 230 && Balloons.y[directioncount] > 0) {
                    Balloons.direction[directioncount] = 1;
                } else if (Balloons.y[directioncount] < -50) {
                    Balloons.direction[directioncount] = 0;
                } else {
                    Balloons.x[directioncount] += counter > 0 ? b * i : 0;
                }
            } else if (Balloons.direction[directioncount] == 1) {
                if (Balloons.y[directioncount] < 110 && Balloons.x[directioncount] > 100 && Balloons.x[directioncount] < 150) {
                    Balloons.direction[directioncount] = 2;
                } else if (Balloons.y[directioncount] < 360 && Balloons.y[directioncount] > 330 && Balloons.x[directioncount] > 600 && Balloons.x[directioncount] < 800) {
                    Balloons.direction[directioncount] = 4;
                } else if (Balloons.y[directioncount] < 210 && Balloons.y[directioncount] > 180 && Balloons.x[directioncount] < 430 && Balloons.x[directioncount] > 400) {
                    Balloons.direction[directioncount] = 2;
                } else if (Balloons.y[directioncount] < 50 && Balloons.y[directioncount] > 0 && Balloons.x[directioncount] > 600 && Balloons.y[directioncount] < 800) {
                    Balloons.direction[directioncount] = 4;
                } else if (Balloons.y[directioncount] < -50) {
                    Balloons.direction[directioncount] = 1;
                } else {
                    Balloons.y[directioncount] -= counter > 0 ? b * i : 0;
                }
            } else if (Balloons.direction[directioncount] == 3) {
                if (Balloons.y[directioncount] > 420 && Balloons.x[directioncount] > 300 && Balloons.x[directioncount] < 350) {
                    Balloons.direction[directioncount] = 4;
                } else if (Balloons.y[directioncount] > 520 && Balloons.x[directioncount] < 90) {
                    Balloons.direction[directioncount] = 2;
                } else if (Balloons.y[directioncount] < -50) {
                    Balloons.direction[directioncount] = 0;
                } else {
                    Balloons.y[directioncount] += counter > 0 ? b * i : 0;
                }
            } else if (Balloons.direction[directioncount] == 4) {
                if (Balloons.x[directioncount] < 50) {
                    Balloons.direction[directioncount] = 3;
                } else if (Balloons.y[directioncount] < 360 && Balloons.y[directioncount] > 330 && Balloons.x[directioncount] < 430) {
                    Balloons.direction[directioncount] = 1;
                } else if (Balloons.y[directioncount] < 80 && Balloons.x[directioncount] < 370) {
                    Balloons.direction[directioncount] = 1;
                } else if (Balloons.y[directioncount] < -50) {
                    Balloons.direction[directioncount] = 0;
                } else {
                    Balloons.x[directioncount] -= counter > 0 ? b * i : 0;
                }
            }
        }

        for (int ugh = 0; ugh < Balloons.ball.size(); ugh++) {
            if (Balloons.y[ugh] < 0) ballcheck++;
        }

        if (ballcheck == 20) {
            System.out.println(lives);
            totallives -= 20 - lives;
            lives = 0;
            counter = 0;
            ballcheck = 0;
            if (ye == 1) Balloons.round2();
            else if (ye == 2) Balloons.round3();
            else if (ye == 3) Balloons.round4();
            else if (ye == 4) Balloons.round5();
            else if (ye == 5) Balloons.round6();
            else if (ye == 6) Balloons.round7();
            else if (ye == 7) Balloons.round8();
            else if (ye == 8) Balloons.round9();
            else if (ye == 9) Balloons.round10();




            ye++;
            b += 0.05;
        } else ballcheck = 0;

        if (a >= 1500) {
            a = 0;



            if (counter < Balloons.ball.size()) counter++;




        }
        if (totallives == 0) {
            //make a state for end and get a quick image if u can
        }
    }

}
