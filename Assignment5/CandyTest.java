import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandyTest {

	
    Candy candy = new Candy("abc", 1.11, 100 );
	
	
	@Test
	public void testGetCost() {
		assertEquals(111, candy.getCost());
	}


}
