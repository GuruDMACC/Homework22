package edu.dmacc.codedsm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameLogicTest {

	Object classUnderTest;
	GameRunner stubGameRunner ;

	@Before
	public void setUp() throws Exception {

		stubGameRunner= new GameRunner() {

			@Override
			public boolean isVictorious() {
				// TODO Auto-generated method stub
				return true;
			}

			@Override
			public boolean isDefeated() {
				// TODO Auto-generated method stub
				return false;
			}

		};

	}

	@Test
	public void whenVictory() {
		stubGameRunner.isVictorious();
		GameLogic classUnderTest = new GameLogic(stubGameRunner);

		int victory =  classUnderTest.runGame("Guru").getScore();

		assertEquals(10000,victory);
		 
	}
	
	@Test
	public void whenDefeated() {
		stubGameRunner.isDefeated();
		GameLogic classUnderTest = new GameLogic(stubGameRunner);

		int defeat =  classUnderTest.runGame("Guru").getScore();

		assertNotEquals(100,defeat);
	}
}