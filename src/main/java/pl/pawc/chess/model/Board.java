package pl.pawc.chess.model;

import pl.pawc.chess.model.exception.WrongInputException;

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
        return getFigures()[position.getX()][position.getY()];
    }

    public Figure getFigure(String input) throws WrongInputException{
        return getFigure(new Position(input));
    }

    public void put(Position position, Figure figure){
        figures[position.getX()][position.getY()] = figure;
    }

    public void put(String input, Figure figure) throws WrongInputException{
       Position position = new Position(input);
       put(position, figure);
    }

    public void move(Position position1, Position position2){
        figures[position2.getX()][position2.getY()] = getFigure(position1);
        figures[position1.getX()][position1.getY()] = null;
        getFigure(position2).setPosition(position2);
        getFigure(position2).setPosition(position2);
    }

    public void move(String input1, String input2) throws WrongInputException{
        move(new Position(input1), new Position(input2));
    }

}
