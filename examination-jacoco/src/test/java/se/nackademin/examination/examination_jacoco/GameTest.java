package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameTest {

	@Test
	public void testMethod1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
	}
	@Test
	public void testMethod1_1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Silva", "Rafael");
		assertEquals("The result should be 1", i, 0);
	}
	@Test
	public void testMethod2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be 1", i, 1);
	}
	@Test
	public void testMethod2_1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 1", i, 0);
	}
	@Test
	public void testMethod2_1_1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('U');
		assertEquals("The result should be 1", i, 2);
	}
	@Test
	public void testMethod3() {
		Game game = new Game();
		int i = game. calculateOutPutBasedOnAge(24);
		assertEquals("The result should be 0", i, 0);
	}
	@Test
	public void testMethod4() {
		Game game = new Game();
		String arr[] = {"a","b","c","d","e","f","g","h","i","j","k"};
		for (int i = 0; i < arr.length; i++) {
			int result = game. calculateOutPutBasedOnHomeCity(arr[i]);
			assertEquals( result, i);
		}
		
		
	}
	
	@Test
	public void testMethod6() {
		Game game = new Game();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Shipra", "Sharma", "F", "30", "Stockholm"));
		game.run(values);
		assertEquals("Age should be 30",game.getAgeFromInputValues(values),30);
		
	}
	
}
