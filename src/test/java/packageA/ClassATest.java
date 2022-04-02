package packageA;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassATest 
{
	@Tag("Sanity")
	@Test
	public void test1()
	{
		System.out.println("Inside test1");
	}

}
