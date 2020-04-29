package TechnicaltestJava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFile {
	
	@Test
	void test(int nbr) throws BadBadValueException {
		TimeDuration tester = new TimeDuration(nbr);
		assertEquals(0, tester.ResultInHours(0), "must be $s");
		assertEquals(0, tester.ResultInHours(500), "must be in form of $m $s");
		assertEquals(0, tester.ResultInHours(1000), "must be in form of $h $m $s");
	}
}
