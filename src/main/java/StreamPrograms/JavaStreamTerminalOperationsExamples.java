package StreamPrograms;

import java.util.*;
import java.util.stream.*;

/**
 * Java 8 Stream Terminal Operations Examples
 *
 * @author www.codejava.net
 *
 */
public class JavaStreamTerminalOperationsExamples {
	private List<Person> listPersons = new ArrayList<>();

	public JavaStreamTerminalOperationsExamples() {
		listPersons.add(new Person("Alice", "Brown", "alice@gmail.com",
				Gender.FEMALE, 26));
		listPersons.add(
				new Person("Bob", "Young", "bob@gmail.com", Gender.MALE, 32));
		listPersons.add(new Person("Carol", "Hill", "carol@gmail.com",
				Gender.FEMALE, 23));
		listPersons.add(new Person("David", "Green", "david@gmail.com",
				Gender.MALE, 39));
		listPersons.add(
				new Person("Eric", "Young", "eric@gmail.com", Gender.MALE, 26));
		listPersons.add(new Person("Frank", "Thompson", "frank@gmail.com",
				Gender.MALE, 33));
		listPersons.add(
				new Person("Gibb", "Brown", "gibb@gmail.com", Gender.MALE, 27));
		listPersons.add(new Person("Henry", "Baker", "henry@gmail.com",
				Gender.MALE, 30));
		listPersons.add(new Person("Isabell", "Hill", "isabell@gmail.com",
				Gender.FEMALE, 22));
		listPersons.add(new Person("Jane", "Smith", "jane@gmail.com",
				Gender.FEMALE, 24));
	}

	public void allMatch() {
		System.out.println("\n==== TEST allMatch() ====");
		boolean areAllMale = listPersons.stream()
				.allMatch(p -> p.getGender().equals(Gender.MALE));
		System.out.println("Are all persons male? " + areAllMale);
		boolean useGMail = listPersons.stream()
				.allMatch(p -> p.getEmail().endsWith("gmail.com"));
		System.out.println("Does everyone use GMail? " + useGMail);
	}

	public void anyMatch() {
		System.out.println("\n==== TEST anyMatch() ====");
		boolean anyFemale = listPersons.stream()
				.anyMatch(p -> p.getGender().equals(Gender.FEMALE));
		System.out.println("Is there any female? " + anyFemale);
		boolean anyTeenager = listPersons.stream()
				.anyMatch(p -> p.getAge() < 20);
		System.out.println("Is there any teenager? " + anyTeenager);
	}

	public void noneMatch() {
		System.out.println("\n==== TEST noneMatch() ====");
		boolean noYahooMail = listPersons.stream()
				.noneMatch(p -> p.getEmail().endsWith("yahoo.com"));
		System.out.println("No one uses Yahoo mail? " + noYahooMail);
		boolean noHill = listPersons.stream()
				.noneMatch(p -> p.getLastName().equals("Hill"));
		System.out.println("No one comes from Hill family? " + noHill);
	}

	public void collect() {
		System.out.println("\n==== TEST collect() ====");
		List<String> listEmails = listPersons.stream().map(p -> p.getEmail())
				.collect(Collectors.toList());
		System.out.println("List of Emails: " + listEmails);
		Set<String> setEmails = listPersons.stream().map(p -> p.getEmail())
				.collect(Collectors.toCollection(TreeSet::new));
		System.out.println("Set of Emails: " + setEmails);
		Map<Gender, List<Person>> byGender = listPersons.stream()
				.collect(Collectors.groupingBy(p -> p.getGender()));
		System.out.println("Groups by gender:\n" + byGender);
		String firstNames = listPersons.stream().map(p -> p.getFirstName())
				.collect(Collectors.joining(", "));
		System.out.println("First Names: " + firstNames);
	}

	public void count() {
		System.out.println("\n==== TEST count() ====");
		long totalMale = listPersons.stream()
				.filter(p -> p.getGender().equals(Gender.MALE)).count();
		System.out.println("Total male: " + totalMale);
	}

	public void forEach() {
		System.out.println("\n==== TEST forEach() ====");
		System.out.println("People are female:");
		listPersons.stream().filter(p -> p.getGender().equals(Gender.FEMALE))
				.forEach(System.out::println);
	}

	public void min() {
		System.out.println("\n==== TEST min() ====");
		Optional<Person> min = listPersons.stream()
				.filter(p -> p.getGender().equals(Gender.FEMALE))
				.min((p1, p2) -> p1.getAge() - p2.getAge());
		if (min.isPresent()) {
			Person youngestGirl = min.get();
			System.out.println("The youngest girl is: " + youngestGirl + " ("
					+ youngestGirl.getAge() + ")");
		}
	}

	public void max() {
		System.out.println("\n==== TEST max() ====");
		Optional<Person> max = listPersons.stream()
				.filter(p -> p.getGender().equals(Gender.MALE))
				.max((p1, p2) -> p1.getAge() - p2.getAge());
		if (max.isPresent()) {
			Person oldestMan = max.get();
			System.out.println("The oldest man is: " + oldestMan + " ("
					+ oldestMan.getAge() + ")");
		}
	}

	public void reduce() {
		System.out.println("\n==== TEST reduce() ====");
		Optional<String> reducedValue = listPersons.stream()
				.map(p -> p.getFirstName())
				.reduce((name1, name2) -> name1 + ", " + name2);
		if (reducedValue.isPresent()) {
			String names = reducedValue.get();
			System.out.println(names);
		}

		int[] numbers = {123, 456, 789, 246, 135, 802, 791};
		int sum = Arrays.stream(numbers).reduce(0, (x, y) -> (x + y));
		System.out.println("sum = " + sum);
		// sum = Arrays.stream(numbers).reduce(0, (x, y) -> (x + y),
		// Integer::sum);
	}

	public static void main(String[] args) throws Exception {
		JavaStreamTerminalOperationsExamples tester = new JavaStreamTerminalOperationsExamples();
		tester.allMatch();
		tester.anyMatch();
		tester.noneMatch();
		tester.collect();
		tester.count();
		tester.forEach();
		tester.min();
		tester.max();
		tester.reduce();
	}
}