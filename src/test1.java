import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
	public class Streams1 {

		// @Test
		public void regular() {

			ArrayList<String> names = new ArrayList<String>();
			names.add("shilpa");
			names.add("Shwetha");
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

	// @Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("shilpa");
		names.add("shwetha");
		names.add("College");
		names.add("Board");
		names.add("sbi");
		long c = names.stream().filter(s -> s.startsWith("s")).count();
		System.out.println(c);
		System.out.println(c);
		long d = Stream.of("shilpa", "shwetha", "shyla", "shreya", "anu", "dini", "Ram").filter(s -> {
			s.startsWith("s");
			return true;
		}).count();
		System.out.println(d);
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(2).forEach(s -> System.out.println(s));
	}

	// @Test
	public void streamMap() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("qwe");
		names.add("wer");
		names.add("ert");
		names.add("rty");
		names.add("ty");

		// Stream.of("shilpa", "shwetha", "shyla", "shreya", "anu", "dini", "Ram",
		// "amam").filter(s -> s.endsWith("m"))
		// .map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		List<String> a = Arrays.asList("shilpa", "shwetha", "shyla", "shreya", "anu", "dini", "Ram", "amam");
		a.stream().filter(s -> s.startsWith("a")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		// merging 2 different lists
		Stream<String> newStream = Stream.concat(names.stream(), a.stream());
		// newStream.sorted().forEach(s -> System.out.println(s));
		boolean q = newStream.anyMatch(s -> s.equalsIgnoreCase("ama44m"));
		System.out.println(q);
		Assert.assertTrue(q);

	}

	@Test
	public void streamCollect() {

		List<String> ls = Stream.of("shilpa", "shwetha", "shyla", "shreya", "anu", "dini", "Ram", "amam")
				.filter(s -> s.endsWith("m")).map(s -> s.toUpperCase()).collect(Collectors.toList());

		System.out.println(ls.get(1));
		List<Integer> values = Arrays.asList(1,2, 5, 3, 6, 9, 8, 4, 4, 4, 2, 3, 3);
		//values.stream().distinct().forEach(s -> System.out.println(s));
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));

	}

}
