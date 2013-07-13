package test;

import brickapp.items.Ball;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import brickapp.utils.Position;


public class BallTest {
       @Test
       public void InitBallTest(){
           Ball b =  new Ball(new Position(10,10),5);
           assertThat(b.getRayon(),is(5));
           assertThat(b.getPosition().getx(),is(10));
           assertThat(b.getPosition().gety(),is(10));
       }

        @Test
        public void TestRebound(){
            Ball b =  new Ball(new Position(10,10),5);
            assertThat(b.getVitX(),is(b.VITESSE));
            assertThat(b.getVitY(),is(b.VITESSE));
            b.invertVitX();
            b.invertVitY();
            assertThat(b.getVitX(),is(-(b.VITESSE)));
            assertThat(b.getVitY(),is(-(b.VITESSE)));
        }

}
