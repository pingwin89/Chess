package pl.pawc.chess.model;

public class Board{

    private Figure[][] figures;

    public Board(){
        figures = new Figure[8][8];
        for(Figure[] f1 : figures){
            for(Figure f2 : f1){
                  f2 = null;
            } 
        }
    }

    public Figure[][] getFigures(){
        return figures;
    }

    public Figure getFigure(Position position){
        return getFigures[position.getX()][position.getY()];
    }

    public void put(Position position, Figure figure){
        getFigure(position) = figure;
    }

    public void move(Position position1, Position position2){
        getFigure(position2) = getFigure(position1);
        getFigure(position1) = null;
        getFigure(position2).setX(position2.getX());
        getFigure(position2).setY(position2.getY());
    }

}
