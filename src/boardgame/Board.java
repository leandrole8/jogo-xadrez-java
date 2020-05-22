package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;//matriz para as pe�as do tabuleiro
	
	public Board(int rowns, int columns) {
		this.rows = rowns;
		this.columns = columns;
		pieces = new Piece[rowns][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rowns) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}

}
