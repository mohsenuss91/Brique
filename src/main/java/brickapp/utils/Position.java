package brickapp.utils;


/**
* Classe décrivant la position des objet sur le panneau de jeu 2 dimmentions
* @author Alexandre Vienne
* @version 0.1
*
*/
public class Position{
	/**
	* Positions sur les axes des abscisses et ordonnées
	*/
	private int x,y;
	
	/**
	* Initialise l'objet avec deux entiers représentant la position sur les deux axes
	*@param  x  Position sur l'axe des abscisses (x > 0)
	*@param  y  Position sur l'axe des ordonnées (y > 0)
	*@throws IllegalArgumentException
	*/
	public Position (int x, int y){

		if ((x>=0) && (y>=0)){
			this.x=x;
			this.y=y;
		}else {throw new IllegalArgumentException();}
	}

	/**
	* Retourne la position de l'objet sur l'axe des abscisses
	*@return  Postition sur x
	*/
	public int getx(){
		return x;
	}

	/**
	* Retourne la position de l'objet sur l'axe des ordonnées
	*@return  Postition sur y
	*/
	public int gety(){
		return y;
	}


    public void setX(int x){
        if(x>=0){
            this.x=x;
        }
        else throw new IllegalArgumentException();
    }
	public void setPosition(int x, int y){
		if ((x>=0) && (y>=0)){
			this.x=x;
			this.y=y;
		}
		else{ throw new IllegalArgumentException();}

	}
}