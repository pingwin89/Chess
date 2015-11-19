package pl.pawc.chess.model;

public class Figure{

    private Position position;
    private int color;
    private int moveCounter;

    public Figure(Position position, int color){
    this.position = position;
    this.color = color;
    moveCounter = 0;
    }

    public void setPosition(Position position){
    this.position = position;
    }

    public void setColor(int color){
    this.color=color;
    }

    public Position getPosition(){
    return position;
    }

    public int getColor(){
    return color;
    }

    public void incrementMoveCounter(){
    this.moveCounter++;
    }
  
    public int getMoveCounter(){
    return moveCounter;
    }

}
