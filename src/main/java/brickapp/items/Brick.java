package brickapp.items;
import brickapp.utils.Position;

/**
* Descripteur d'une prique à casser
* @author Alexandre Vienne
* @version 0.1
*/

public class Brick{
	
	private Position position;
	/**
	* Hauteur de la brique
	*/
    public static final int HEIGHT = 15;
	/**
	* Largeur de la brique
	*/
	public static final int WIDTH = 40;
	

	/**
	* Constructeur de la classe 
	* @param p : position de la brique 
	*/
	public Brick(Position p){
		if (p != null){
			this.position = p;
		}else {throw new IllegalArgumentException();}
	}

	public Position getPosition(){
		return this.position;
	}
}