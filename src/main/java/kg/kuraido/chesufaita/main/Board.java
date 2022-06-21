package kg.kuraido.chesufaita.main;

import kg.kuraido.chesufaita.main.pieces.Knight;

public class Board {
    Spot[][] boxes;
    public Board(){
        this.resetBoard();
    }
    public Spot getBox(int x, int y) throws Exception {
        if(x < 0 || x > 7 || y < 0 || y > 7){
            throw new Exception("Index out of bound");
        }
        return boxes[x][y];
    }

    public void resetBoard(){
        //white pieces
        boxes[0][1] = new Spot(0, 1, new Knight(true));

        //black
        boxes[7][1] = new Spot(7, 1, new Knight(false));
        for(int i = 2; i < 6; i++){
            for(int j = 0; j < 8; j++){
                boxes[i][j] = new Spot(i, j, null);
            }
        }
    }
}
