import static org.junit.jupiter.api.Assertions.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class solution4Test {

	@Test
	void testmerge() {
		List<Interval> result = new ArrayList<Interval>();
		result.add(new Interval(1,3));
		result.add(new Interval(2,6));
		result.add(new Interval(8,10));
		result.add(new Interval(15,18));
		
		List<Interval> res = new ArrayList<Interval>();
		res.add(new Interval(1,6));
		res.add(new Interval(8,10));
		res.add(new Interval(15,18));
		solution4 test = new solution4();
		assertTrue(equal(res,test.merge(result)));

}
	private boolean equal(ArrayList<Interval> a, ArrayList<Interval> b) {
		if(a.size() != b.size())
			return false;
		for(int i=0; i<a.size(); i++) {
			int start1 = a.get(i).start;
			int end1 = a.get(i).end;
			int start2 = b.get(i).start;
			int end2 = b.get(i).end;
			if(!(start1 == start2 && end1 == end2))
				return false;
		}
		return true;
	}
}
