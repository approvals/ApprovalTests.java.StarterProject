package org.samples;

import static org.junit.Assert.assertEquals;

import org.approvaltests.Approvals;
import org.junit.Test;

public class TicTacToeTests {

	@Test
	public void xWins() {
		TicTacToe game = new TicTacToe();
		game.put("X", 0, 2);
		game.put("O", 2, 1);
		game.put("X", 0, 0);
		game.put("O", 1, 1);
		// check there is no winner
		assertEquals("", game.getWinner());
		game.put("X", 0, 1);
		assertEquals("X", game.getWinner());
		// check x won
		// verify the game
		Approvals.verify(game);
	}

	@Test
	public void oWinsInEachColumn() {
		assertColumnWin("O", 0);
		assertColumnWin("O", 1);
		assertColumnWin("O", 2);
	}

	@Test
	public void xWinsInEachColumn() {
		assertColumnWin("X", 0);
		assertColumnWin("X", 1);
		assertColumnWin("X", 2);
	}

	@Test
	public void xWinsInEachRow() {
		assertRowWin("X", 0);
		assertRowWin("X", 1);
		assertRowWin("X", 2);
	}

	@Test
	public void oWinsInEachRow() {
		assertRowWin("O", 0);
		assertRowWin("O", 1);
		assertRowWin("O", 2);
	}

	@Test
	public void xWinsDownDiagonal() {
		assertPlayerWinsDownDiagonal("X");
	}

	@Test
	public void oWinsDownDiagonal() {
		assertPlayerWinsDownDiagonal("O");
	}

	public void assertPlayerWinsDownDiagonal(String player) {
		TicTacToe game = new TicTacToe();
		game.put(player, 0, 0);
		game.put(player, 1, 1);
		game.put(player, 2, 2);
		assertEquals(player, game.getWinner());
	}

	@Test
	public void xWinsUpDiagonal() {
		assertPlayerWinsUpDiagonal("X");
	}

	@Test
	public void oWinsUpDiagonal() {
		assertPlayerWinsUpDiagonal("O");
	}

	public void assertPlayerWinsUpDiagonal(String player) {
		TicTacToe game = new TicTacToe();
		game.put(player, 0, 2);
		game.put(player, 1, 1);
		game.put(player, 2, 0);
		assertEquals(player, game.getWinner());
	}

	public void assertColumnWin(String player, int column) {
		TicTacToe game = new TicTacToe();
		game.put(player, column, 2);
		game.put(player, column, 1);
		game.put(player, column, 0);
		assertEquals(player, game.getWinner());
	}

	public void assertRowWin(String player, int row) {
		TicTacToe game = new TicTacToe();
		game.put(player, 2, row);
		game.put(player, 1, row);
		game.put(player, 0, row);
		assertEquals(player, game.getWinner());
	}

}
