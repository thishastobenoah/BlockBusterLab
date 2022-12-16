import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MovieAppTests {

	@Test
	void test1() {
		//Act: create a DVD
		DVD dvd1 = new DVD ("Mr. Magorium's Wonder Emporium", 100);
		//assert: DVD was created and fields were set
		assertNotNull(dvd1); //this line is optional
		assertEquals("Mr. Magorium's Wonder Emporium", dvd1.getTitle());
		assertEquals(100, dvd1.getRunTime());
	}
	@Test
	void test2() {
		VHS  vhs1  = new VHS ("Jumanji", 104);
		assertNotNull(vhs1); //this line is optional
		assertEquals("Jumanji", vhs1.getTitle());
		assertEquals(104, vhs1.getRunTime());
		assertEquals(0, vhs1.getCurrentTime());
	}
	@Test
	void test3 () {
		//Arrange - need to create vhs and set currentTime to 1
		VHS  vhs1  = new VHS ("Jumanji", 104);
		vhs1.getScenes().add("Scene 1");
		vhs1.getScenes().add("Scene 2");
		vhs1.getScenes().add("Scene 3");
		vhs1.play(); //this increments currentTime  to 1
		//Act - call rewind
		vhs1.rewind();
		//Assert - check that currentTime is 0
		assertEquals(0, vhs1.getCurrentTime());
	}

}
