package brickapp;

import brickapp.items.Brick;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import brickapp.utils.Position;

public class BrickTest{
	

	@Test(expected=IllegalArgumentException.class)
    public void testBrickInitFaillPosition(){
        Position p = null;
        Brick br = new Brick(p);
    }
    @Test
    public void testBrickInitPosition(){
        Position p = new Position(1,1);
        Brick br = new Brick(p);
        Position p2 = br.getPosition();
        assertThat(p2, is(p));
        assertThat(Brick.HEIGHT, is(15));
        assertThat(Brick.WIDTH, is(40));
    }


}
