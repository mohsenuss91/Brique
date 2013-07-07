package brickapp.items;


import brickapp.utils.Position;

public class Ball {
    private Position pos;
    private int rayon;

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
}
