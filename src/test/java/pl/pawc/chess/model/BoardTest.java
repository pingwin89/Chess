package pl.pawc.chess.model;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import pl.pawc.chess.model.exception.WrongInputException;

public class BoardTest extends TestCase{
    public BoardTest(String testName){
        super(testName);
    }

    public static Test suite(){
        return new TestSuite(BoardTest.class);
    }

    public void testConstructor(){
    assertTrue(true);
    Board board = new Board();
    assertNotNull(board);
    assertTrue(board instanceof Board);
    }

    public void testBoard(){
        try{
            Board board = new Board();
            Position position1 = new Position("A1");
            board.put(position1, new Figure(position1, 0));
            assertNotNull(board.getFigure(position1));
            assertTrue(board.getFigure(position1).getPosition().getX()==0);
            assertTrue(board.getFigure(position1).getPosition().getY()==0);
            Position position2 = new Position("B2");
            board.move(position1, position2);
            assertNull(board.getFigure(position1));
            assertNotNull(board.getFigure(position2));
            assertTrue(board.getFigure(position2).getPosition().getX()==1);
            assertTrue(board.getFigure(position2).getPosition().getY()==1);

            board.put("H8", new Figure(new Position("H8"), 0));
            assertNotNull(board.getFigure("H8"));
            assertTrue(board.getFigure("H8").getPosition().getX()==7);
            assertTrue(board.getFigure("H8").getPosition().getY()==7);            
            board.move("H8", "G7");
            assertNull(board.getFigure("H8"));
            assertNotNull(board.getFigure("G7"));
            assertTrue(board.getFigure("G7").getPosition().getX()==6);
            assertTrue(board.getFigure("G7").getPosition().getY()==6);
        }
        catch(WrongInputException e){
        fail();
        }
    }

}
