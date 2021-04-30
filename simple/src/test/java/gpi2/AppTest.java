package gpi2;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

	
	    String actual = "Rigorous Test :-)";

	    String expected = "Rigorous Test :-)";

		assertEquals( actual, expected );
    
    }

    /**
     * Test practica
     */
    @Test
    public void testEqualStrings()
    {
	
	    String actual = "Rigorous Test :-)";

	    String expected = "Rigorous Test :-)";

		assertTrue( expected.equals( actual ) );
    
    }
}
