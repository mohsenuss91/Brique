package brickapp.utils;

/**
 * @author Alexandre Vienne
 * @version 0.1
 * Va créer ce qu'il faut pour retourner un terain de jeu de base pour la suite (quelques briques...)
 */



import brickapp.items.Ball;
import brickapp.items.Bar;
import brickapp.items.Brick;
import java.util.ArrayList;
import java.util.List;

public final  class InitPlayField {

    static final int NBRIQUES=5;
    static final int POS=50;
    static final int BPOS=250;
    static final int RAYON=25;
    static final int BARPOSX=200;
    static final int BARPOSY=550;


    private InitPlayField(){

    }

    public static  List<Brick> getInitBrickList(){
           List<Brick> lb = new ArrayList<Brick>();
        for (int i=0;i<NBRIQUES;i++) {
             lb.add(new Brick(new Position(i*POS,i*POS)));
        }
        return lb;
    }

    public static Ball getInitBall(){
        return new Ball(new Position(BPOS,BPOS),RAYON);
    }

    public static Bar getInitBar(){

        return new Bar(new Position(BARPOSX,BARPOSY));
    }

}
