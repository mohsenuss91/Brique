package brickapp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import brickapp.utils.Position;


public class AppTest{
	@Test
	public void initTest(){
		String[] arg=null;
		App.main(arg);
	}
}