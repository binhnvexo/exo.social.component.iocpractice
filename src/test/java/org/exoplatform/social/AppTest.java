package org.exoplatform.social;

import org.exoplatform.container.xml.InitParams;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
      AClass a = new AClass(new BClass(new InitParams())) ;
      a.addListener(new SimpleListenerImpl()) ;
      
      return new TestSuite( AppTest.class );
        
        
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
