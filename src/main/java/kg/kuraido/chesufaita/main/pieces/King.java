package kg.kuraido.chesufaita.main.pieces;

import kg.kuraido.chesufaita.main.Board;
import kg.kuraido.chesufaita.main.Piece;
import kg.kuraido.chesufaita.main.Spot;

public class King extends Piece {
    private boolean castlingDone = false;

    public King(boolean white){
        super(white);
    }

    public boolean isCastlingDone(){
        return castlingDone;
    }

    public void setCastlingDone(boolean castlingDone){
        this.castlingDone = castlingDone;
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end){
        if(end.getPiece().isWhite() == this.isWhite()){
            return false;
        }

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        if(x + y == 1){
            return true;
        }
        return this.isValidCastling(board,  start,  end);
    }

    public boolean isValidCastling(Board board, Spot start, Spot end){

        if(this.isCastlingDone()){
            return false;
        }
        //for now logic not finished
        return true;
    }

    public boolean isCastlingMove(Spot start, Spot end){

        // check if the starting and
        // ending position are correct


        //logic unfinished
        return true;
    }

}
