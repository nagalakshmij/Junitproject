package packageB;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassBTest
{
	@Tag("Sanity")
	@Test
	public void test2()
	{
		System.out.println("Inside test2");
	}
}
