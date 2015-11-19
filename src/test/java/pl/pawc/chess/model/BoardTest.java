package pl.pawc.chess.model;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BoardTest extends TestCase{
    public BoardTest(String testName){
        super(testName);
    }

    public static Test suite(){
        return new TestSuite(BoardTest.class);
    }

    public void testConstructor(){
    Board board = new Board();
    assertNotNull(Board);
    assertTrue(board instance of Board);
    }

    public void testBoard(){
    Board board = new Board();
    board.put("A1", new Figure(0,0,0));
    assertNotNull(board.getFigure("A1"));
    }

}
