package brickapp.items;

import brickapp.utils.Position;

public class Bar {

    private Position position;

    public Bar (Position p){
        position=p;
    }

    public Position getPosition() {
        return position;
    }
    public void setBarPosition(int x){
        if (x>0){
            this.position.setX(x);
        }
    }

}
