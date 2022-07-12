import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Calculate {
	
	@Test
	public void Test() {
		Add add = new Add();
		int result = add.Sum(2, 3);
		assertEquals(4,result);
		
	}

}
