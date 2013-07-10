/**
* @author Alexandre Vienne
* @version 0.1
* Décrit la fenettre principale du jeu, instancié par la méthode main
*/

package brickapp.ihm;

import brickapp.utils.InitPlayField;

import javax.swing.JFrame;


public class MainFenetre{
	
	private JFrame frame;

	/**
	*Titre de la fenetre
	*/
	static final String TITRE = "Casse Brique App";
	
	/**
	* Largeur de la fenetre
	*/
	static final int WIDTH =400;
	
	/**
	* Hauteur de la fenetre
	*/
	static final int HEIGHT =600;

	/**
	*Initialise la fenetre aux dimmentions décrites par les constantes
	* WIDTH et HEIGHT
	*/
	public MainFenetre(){
		frame = new JFrame(TITRE);
		frame.setSize(WIDTH,HEIGHT);
		frame.setContentPane(new PlayPan(InitPlayField.getInitBrickList(),InitPlayField.getInitBall(),InitPlayField.getInitBar()));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	* Renvoit le frame de la windows pour y mettre les composants
	*@return javax.swing.JFrame 
	*/
	public JFrame getFrame(){
		return this.frame;
	}
	
}