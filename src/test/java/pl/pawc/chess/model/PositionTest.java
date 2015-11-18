package pl.pawc.chess.model;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PositionTest extends TestCase{
    public PositionTest(String testName){
        super(testName);
    }

    public static Test suite(){
        return new TestSuite(PositionTest.class);
    }

    public void testConstructor(){
    Position position = new Position(1,2);
    assertNotNull(position);
    }

    public void testMutators(){
    Position position = new Position(1,2);
    assertTrue(position.getX()==1);
    assertTrue(position.getY()==2);
    position.setX(3);
    position.setY(4);
    assertTrue(position.getX()==3);
    assertTrue(position.getY()==4);
    }

}
