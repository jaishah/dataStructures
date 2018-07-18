import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise {

	public static void main(String[] args) {
		Exercise java = new Exercise();
		java.sum();
		java.evensum();
		int idx = java.search(6, new Integer[] { 1, 2, 3, 4, 6 });
		System.out.println("Array idx of found element: " + idx);
		Integer idx1 = java.maximum(new Integer[] { 0, 0, 0 });
		System.out.println("Max element: " + idx1);
		Double avg = java.average(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println("Avg of list: " + avg);
		List<String> str = java.upperCase(Arrays.asList("jai", "pranita", "jiya"));
		System.out.println("List of Strings in upperCase: ");
		str.forEach(s -> System.out.println("," + s));// TODO Auto-generated
														// method stub
		/*
		 * Integer nth = java.getElement(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,
		 * 9, 10),5); System.out.println("Nth element of the list: " + nth);
		 */
		String evn_odd = java.getString(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println("Even Odd String: " + evn_odd);
		String decoded = java.decode("xvm");
		System.out.println("Decoded String: " + decoded);

		java.isPalindrome("Nitin");
	}

	public void sum() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("Double Integer Sum: " + numbers.stream().mapToInt(n -> n * 2).sum());
	}

	public void evensum() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println(
				"Double Even Integer Sum: " + numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n * 2).sum());
	}

	public int search(Integer n, Integer[] list) {
		int[] idx = IntStream.range(0, list.length).filter(i -> (list[i] == n)).toArray();

		if (idx.length == 0) {
			return -1;
		} else {
			return idx[0];
		}

	}

	public Integer maximum(Integer[] list) {

		return Arrays.stream(list).max(Integer::compare).get();

	}

	public Double average(List<Integer> list) {
		return list.stream().mapToDouble(i -> i).average().getAsDouble();
	}

	public List<String> upperCase(List<String> list) {

		return list.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
	}

	/*
	 * public Integer getElement(List<Integer> list, Integer n) { IntStream is =
	 * IntStream.range(0, list.size()).filter(i->i==n); return
	 * is.map(i->Integer.valueOf(i)).; //map(i->{if(n>i)return -1;else return
	 * list.get(n);}).;
	 * 
	 * }
	 */
	public List<String> search(List<String> list) {
		return list.stream().filter(i -> i.startsWith("a")).filter(i -> i.length() == 3).collect(Collectors.toList());
	}

	public String getString(List<Integer> list) {
		return list.stream().map(i -> i % 2 == 0 ? "e" + i : "o" + i).collect(Collectors.joining(","));
	}

	public String decode(String code) {

		int lastCharValue = 'z';
		int alphabetLength = 'z' - 'a' + 1;
		String decoded = code.chars().map(i -> {
			i = i + 5;
			i = i < lastCharValue ? i : i - alphabetLength;
			return i;
		}).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

		return decoded;
	}

	public boolean isPalindrome(String word) {
		boolean check = false;
		String rev = IntStream.range(0, word.length() - 1).map(i -> word.charAt(word.length() - i - 1))
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

		check = word.equalsIgnoreCase(rev);

		return check;
	}

	public Boolean packageRice(Integer big, Integer small, Integer goal) {

		boolean check = false;
		if (goal > (big * 5 + small))
			check = false;
		else {
			int remainder = goal % 5;
			if (remainder == 0 && (goal < big * 5)) {
				check = true;
			} else if (remainder > 0 && remainder <= small) {
				check = true;
			}
		}

		return check;
	}

}
