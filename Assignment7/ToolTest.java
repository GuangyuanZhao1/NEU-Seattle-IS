import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ToolTest {

	Scissors s = new Scissors(5);
	Paper p = new Paper(7);
	Rock r = new Rock(15);
	
	
	@Test
	void testfight() {
		assertTrue(s.fight(p));
        assertFalse(p.fight(r));
	}

}
