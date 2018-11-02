import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution5Test {

	@Test
	void testfindMedianSortedArrays() {
		int[] a = {1,3};
		int[] b = {2};
		Solution5 test = new Solution5();
		assertEquals(test.findMedianSortedArrays(a, b),2.0);
	}

}
