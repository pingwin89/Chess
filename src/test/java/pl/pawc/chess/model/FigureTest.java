package pl.pawc.chess.model;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FigureTest extends TestCase{
    public FigureTest(String testName){
        super(testName);
    }

    public static Test suite(){
        return new TestSuite(FigureTest.class);
    }

    public void testConstructor(){
    Position position = new Position(1,2);
    Figure figure = new Figure(position, 0);
    assertNotNull(figure);
    }

    public void testMutators(){
    Position position = new Position(1,2);
    Figure figure = new Figure(position, 0);
    assertTrue(figure.getPosition().getX()==1);
    assertTrue(figure.getPosition().getY()==2);
    Position position2 = new Position(3,4);
    figure.setPosition(position2);
    assertTrue(figure.getPosition().getX()==3);
    assertTrue(figure.getPosition().getY()==4);
    assertTrue(figure.getColor()==0);
    figure.setColor(1);
    assertTrue(figure.getColor()==1);
    assertTrue(figure.getMoveCounter()==0);
    figure.incrementMoveCounter();
    assertTrue(figure.getMoveCounter()==1);
    }

}
