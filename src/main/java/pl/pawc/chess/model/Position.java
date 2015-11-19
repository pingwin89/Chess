package pl.pawc.chess.model;

import pl.pawc.chess.model.exception.WrongInputException;

public class Position{

    private int x;
    private int y;
 
    public Position(int x, int y){
    this.x=x;
    this.y=y;
    }

    public Position(String input) throws WrongInputException{
    Position position = translate(input);
    this.x = position.getX();
    this.y = position.getY();
    }

    public void setX(int x){
    this.x=x;
    }

    public void setY(int y){
    this.y=y;
    }

    public int getX(){
    return x;
    }

    public int getY(){
    return y;
    }

    private Position translate(String input) throws WrongInputException{
    int x;
    int y;
    char[] array = input.toCharArray();

        switch(String.valueOf(array[0]).toLowerCase()){
            case "a" : y = 0; break;
            case "b" : y = 1; break;
            case "c" : y = 2; break;
            case "d" : y = 3; break;
            case "e" : y = 4; break;
            case "f" : y = 5; break;
            case "g" : y = 6; break;
            case "h" : y = 7; break;
            default : throw new WrongInputException();
        }

        try{
           Integer.parseInt(String.valueOf(array[1]));
        }
        catch(NumberFormatException e){
            throw new WrongInputException();
        }

        if(Integer.parseInt(String.valueOf(array[1]))>8||Integer.parseInt(String.valueOf(array[1]))<1){
            throw new WrongInputException();
        }
        else{
            x = Integer.parseInt(String.valueOf(array[1]))-1;
        }
        return new Position(x, y);

    }

}
