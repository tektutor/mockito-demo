package org.tektutor;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.mockito.*;

public class MyClassTest {

	private MyClass mockedMyClassObj;

	@Before
	public void init() {
		MyClass myClass = new MyClass();
		mockedMyClassObj = Mockito.spy ( myClass );
	}

	@Test
	public void test() {

		try {

		Mockito.doReturn ( 20 ).doThrow(new RuntimeException()).when ( mockedMyClassObj ).getX() ;

		mockedMyClassObj.F1();

		} 
		catch( RuntimeException e ) {
			System.out.println ( "Checkpoint 1");
			Mockito.verify( mockedMyClassObj, Mockito.times(2) ).getX();
		}

	}

}
