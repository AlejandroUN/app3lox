package comp.app3lox.models;

public class Game {

		private String firstPlayer;
		private String secondPlayer;
		private String winner;
		private int matrixOrder;
		
		public String getFirstPlayer() {
			return firstPlayer;
		}
		public void setFirstPlayer(String firstPlayer) {
			this.firstPlayer = firstPlayer;
		}
		public String getSecondPlayer() {
			return secondPlayer;
		}
		public void setSecondPlayer(String secondPlayer) {
			this.secondPlayer = secondPlayer;
		}		
		public String getWinner() {
			return winner;
		}
		public void setWinner(String winner) {
			this.winner = winner;
		}
		public int getMatrixOrder() {
			return matrixOrder;
		}
		public void seMatrixOrder(int matrixOrder) {
			this.matrixOrder = matrixOrder;
		}
}
