package brickapp;

import brickapp.ihm.MainFenetre;
/**
* Classe principale de l'application casse brique. 
* Lance l'interface graphique.
* 	@author Alexandre Vienne
*/
public final class App 
{

	private App(){
	}

	/**
	* Fonction Main, initialise et lance l'application
	*/
    public static void main( String[] args )
    {
    	MainFenetre fen = new MainFenetre();
    	fen.getFrame().setVisible(true);

    }
}
