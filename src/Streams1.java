import java.util.ArrayList;

import org.testng.annotations.Test;

public class Streams1 {
	@Test
	public void regular() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("shilpa");
		names.add("shwetha");
		names.add("College");
		names.add("Board");
		names.add("Zobi");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			if (name.startsWith("s")) {
				count++;
			}

		}
		System.out.println(count);
	}
}
