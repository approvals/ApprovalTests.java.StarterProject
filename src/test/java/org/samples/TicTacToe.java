package org.samples;

import org.lambda.utils.Grid;

public class TicTacToe {

	private String[][] board = new String[3][3];

	@Override
	public String toString() {
		return Grid.print(3, 3, this::printCell);
	}

	public String printCell(int x, int y) {
		return board[x][y];
	}

	public void put(String player, int x, int y) {
		board[x][y] = player;
	}

	public String getWinner() {
		if (playerWinsInAColumn("X") || playerWinsInARow("X") || playerWinsInDownDiagonal("X")
				|| playerWinsInUpDiagonal("X"))
			return "X";
		if (playerWinsInAColumn("O") || playerWinsInARow("O") || playerWinsInDownDiagonal("O")
				|| playerWinsInUpDiagonal("O"))
			return "O";
		return "";
	}

	private boolean playerWinsInDownDiagonal(String player) {
		return board[0][0] == player && board[1][1] == player && board[2][2] == player;
	}

	private boolean playerWinsInUpDiagonal(String player) {
		return board[0][2] == player && board[1][1] == player && board[2][0] == player;
	}

	private boolean playerWinsInARow(String player) {
		return isRowFull(0, player) || isRowFull(1, player) || isRowFull(2, player);
	}

	private boolean isRowFull(int i, String player) {
		return board[0][i] == player && board[1][i] == player && board[2][i] == player;
	}

	public boolean playerWinsInAColumn(String player) {
		return isColumnFull(0, player) || isColumnFull(1, player) || isColumnFull(2, player);
	}

	private boolean isColumnFull(int i, String player) {
		return board[i][0] == player && board[i][1] == player && board[i][2] == player;
	}
}
