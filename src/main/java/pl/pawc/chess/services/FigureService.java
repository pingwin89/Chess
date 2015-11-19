package pl.pawc.chess.services;

import pl.pawc.chess.model.Board;
import pl.pawc.chess.model.Position;

public interface FigureService{
 
    boolean isMoveValid(Position position1, Position position2, Board board);
    String toString(int color);

}
