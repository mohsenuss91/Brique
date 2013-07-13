package brickapp.items;


import brickapp.utils.Position;

public class Ball {
    public static final int VITESSE=-2;



    private Position pos;
    private int rayon;
    private int vitx=VITESSE;
    private int vity=VITESSE;

    public Ball(Position p ,int r){
        this.pos=p;
        this.rayon=r;
    }

    public int getRayon(){
        return rayon;
    }
    public Position getPosition(){
        return pos;
    }
    public int getVitX() {
        return vitx;
    }
    public int getVitY(){
        return vity;
    }
    public void setPos(Position pos) {
        this.pos = pos;
    }

    public void invertVitX() {
        this.vitx = -vitx;
    }
    public void invertVitY() {
        this.vity = -vity;
    }
}
