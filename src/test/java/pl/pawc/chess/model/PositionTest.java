package pl.pawc.chess.model;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import pl.pawc.chess.model.exception.WrongInputException;

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

    public void testInputConstructor(){
        try{
            Position position1 = new Position("A1");
            assertTrue(position1.getX()==0&&position1.getY()==0);
            Position position2 = new Position("D4");
            assertTrue(position2.getX()==3&&position2.getY()==3);
            Position position3 = new Position("E5");
            assertTrue(position3.getX()==4&&position3.getY()==4);
            Position position4 = new Position("H8");
            assertTrue(position4.getX()==7&&position4.getY()==7);
        }
        catch(WrongInputException e){
            fail();
        }
    }

}
