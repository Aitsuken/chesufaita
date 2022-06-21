package kg.kuraido.chesufaita.main.pieces;

import kg.kuraido.chesufaita.main.Board;
import kg.kuraido.chesufaita.main.Piece;
import kg.kuraido.chesufaita.main.Spot;

public class Knight extends Piece {

    public Knight(boolean white){
        super(white);
    }
    @Override
    public boolean canMove(Board board, Spot start, Spot end){
        if(end.getPiece().isWhite() == this.isWhite()){
            return false;
        }

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getX() - end.getY());
        return x * y == 2;
    }
}
