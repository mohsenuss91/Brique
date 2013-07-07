/**
* @author Alexandre Vienne
* @version 0.1
* PlayPan est le composant de l'ihm représentant le plateau de jeu, il y dessine
* les différents composant du jeu.
*/

package brickapp.ihm;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.List;

import brickapp.items.Ball;
import brickapp.items.Brick;

public class PlayPan extends JPanel {
	private List<Brick> brickList;
    private Ball ball;

	/**
	* Methode privée qui dessine les briques
	*/
	private void paintBrick(Graphics g){
		for (Brick b : this.brickList){
			g.fillRect(b.getPosition().getx(),b.getPosition().gety(),Brick.WIDTH,Brick.HEIGHT);
		}
        g.fillOval(ball.getPosition().getx(),ball.getPosition().gety(),ball.getRayon(),ball.getRayon());
	}


	/**
	* Instancie le playground
	* @param bl liste des briques du niveau
	*/
	public PlayPan(List<Brick> bl,Ball b){
		brickList = bl;
        ball=b;
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
}