package brickapp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import brickapp.utils.Position;

public class PositionTest{

    
    @Test
    public void testPosition(){

        brickapp.utils.Position p = new brickapp.utils.Position(3,4);

        assertThat(p.getx(),is(3));
        assertThat(p.gety(),is(4));
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testPossitionWithWrongInitArg(){
        Position p = new Position(-3,4);

    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testPossitionWithWrongInitArg2(){
        Position p = new Position(3,-4);

    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testPossitionWithWrongSetArg(){
        Position p = new Position(3,4);
        p.setPosition(-2,3);

    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testPossitionWithWrongSetArg2(){
        Position p = new Position(3,4);
        p.setPosition(2,-3);

    }

    
}