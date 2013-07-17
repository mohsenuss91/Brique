/**
* @author Alexandre Vienne
* @version 0.1
* PlayPan est le composant de l'ihm représentant le plateau de jeu, il y dessine
* les différents composant du jeu.
*/

package brickapp.ihm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.List;

import brickapp.items.Ball;
import brickapp.items.Bar;
import brickapp.items.Brick;
import brickapp.utils.Position;

public class PlayPan extends JPanel implements MouseMotionListener {
	private List<Brick> brickList;
    private Ball ball;
    private Bar bar;
    private Timer moveBall = new Timer(25,new ActionListener() {
        public void actionPerformed(ActionEvent actionEvent) {
            displaceBall();
            repaint();
        }
    });
    private boolean isInBar=false;



    /**
	* Methode privée qui dessine les briques
	*/
	private void paintBrick(Graphics g){
        g.setColor(Color.white);
        g.fillRect(0,0,400,600);
		for (Brick b : this.brickList){
            g.setColor(Color.red);
            g.fillRect(b.getPosition().getx(),b.getPosition().gety(),Brick.WIDTH,Brick.HEIGHT);
		}
        g.setColor(Color.blue);
        g.fillOval(ball.getPosition().getx(), ball.getPosition().gety(), ball.getRayon(), ball.getRayon());
        g.setColor(Color.black);
        g.fillRoundRect(bar.getPosition().getx(), bar.getPosition().gety(), Brick.WIDTH, Brick.HEIGHT / 2, 10, 10);
	}


	/**
	* Instancie le playground
	* @param bl liste des briques du niveau
	*/
	public PlayPan(List<Brick> bl,Ball b, Bar bar){
		brickList = bl;
        ball=b;
        this.bar=bar;
        addMouseMotionListener(this);
        moveBall.start();
	}

	/**
	* Dessine le playground (appelé à chaque événement sur l'ihm)
	*/
	public void paintComponent(Graphics g){

		paintField(g);
	}

	
	/**
	* Dessine les briques à l'écran
	*/
	public void paintField(Graphics g){
		paintBrick(g);
	}

    public void mouseDragged(MouseEvent mouseEvent) {

    }

    public void mouseMoved(MouseEvent mouseEvent) {
        this.bar.setBarPosition(mouseEvent.getX());
    }

    protected void displaceBall(){

        int vx = ball.getVitX();
        int vy = ball.getVitY();
        Position p = ball.getPosition();
        p.setX(p.getx()+vx);
        p.setY(p.gety()+vy);
        ball.setPos(p);
        detectCol();
    }
    protected void detectCol(){
        Position pos=ball.getPosition();

        //Testing colision with wall
        if (pos.getx()<=0){
            ball.invertVitX();
        }else{
            if(pos.getx() >= (MainFenetre.WIDTH-ball.getRayon())){
                ball.invertVitX();
            }
        }
        if (pos.gety()<=0){
            ball.invertVitY();
        }

        findCollisionWithBar();
        findCollisionWithBrick();

    }

    private void findCollisionWithBrick() {
        int xball= this.ball.getPosition().getx();
        int yball= this.ball.getPosition().gety();

        for(Brick b : this.brickList ){
            int xbrick =  b.getPosition().getx();
            int ybrick =  b.getPosition().gety();
            if((xball>=xbrick) && (xball<= xbrick+Brick.WIDTH) )
            if(yball<=ybrick+Brick.HEIGHT){

                     if(yball>=ybrick){
                         ball.invertVitY();
                     }
                 }
        }
    }

    protected void findCollisionWithBar(){
        int posx = ball.getPosition().getx();
        int posy = ball.getPosition().gety();
        int diameter = ball.getRayon();


        if (!this.isInBar){
            if (posy+diameter >= bar.getPosition().gety()){
                //The ball may fall ^^ trying to save it.

                if (posx >=bar.getPosition().getx() && posx<=bar.getPosition().getx() + Brick.WIDTH){
                    ball.invertVitY();
                    this.isInBar=true;
                }
            }
        }

        if (!(posx >=bar.getPosition().getx() && posx<=bar.getPosition().getx() + Brick.WIDTH))      {
            this.isInBar=false;
        }

    }
}