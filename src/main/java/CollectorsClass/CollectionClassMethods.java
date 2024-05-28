package CollectorsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionClassMethods {
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Paul", 11, "Economics", 78.9));
		studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
		studentList.add(new Student("Harish", 13, "History", 83.7));
		studentList.add(new Student("Xiano", 14, "Literature", 71.5));
		studentList.add(new Student("Soumya", 15, "Economics", 77.5));
		studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
		studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
		studentList.add(new Student("Mitshu", 18, "History", 73.5));
		studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
		studentList.add(new Student("Harry", 20, "History", 71.9));
		
		List<Student> top3Students = studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).collect(Collectors.toList());
		System.out.println(top3Students);
		
		Set<String> subjects = studentList.stream().map(Student::getSubject).collect(Collectors.toSet());
		System.out.println(subjects);
		
		Map<String, Double> namePercentageMap = studentList.stream().collect(Collectors.toMap(Student::getName, Student::getPercentage));
		System.out.println(namePercentageMap);

		LinkedList<Student> studentLinkedList = studentList.stream().limit(3).collect(Collectors.toCollection(LinkedList::new));
		System.out.println(studentLinkedList);
		
		String namesJoined = studentList.stream().map(Student::getName).collect(Collectors.joining(", "));        
		System.out.println(namesJoined);
		
		Long studentCount = studentList.stream().collect(Collectors.counting());        
		System.out.println(studentCount);
		
		Optional<Double> highPercentage = studentList.stream().map(Student::getPercentage).collect(Collectors.maxBy(Comparator.naturalOrder()));        
		System.out.println(highPercentage);

		Optional<Double> lowPercentage = studentList.stream().map(Student::getPercentage).collect(Collectors.minBy(Comparator.naturalOrder()));
		System.out.println(lowPercentage);
		
		Double sumOfPercentages = studentList.stream().collect(Collectors.summingDouble(Student::getPercentage));        
		System.out.println(sumOfPercentages);
		
		Double averagePercentage = studentList.stream().collect(Collectors.averagingDouble(Student::getPercentage));        
		System.out.println(averagePercentage);

		DoubleSummaryStatistics studentStats = studentList.stream().collect(Collectors.summarizingDouble(Student::getPercentage));        
		System.out.println("Highest Percentage : "+studentStats.getMax());		         
		System.out.println("Lowest Percentage : "+studentStats.getMin());		         
		System.out.println("Average Percentage : "+studentStats.getAverage());
		
		Map<String, List<Student>> studentsGroupedBySubject = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));        
		System.out.println(studentsGroupedBySubject);
		
		Map<Boolean, List<Student>> studentspartionedByPercentage = studentList.stream().collect(Collectors.partitioningBy(student -> student.getPercentage() > 80.0));        
		System.out.println(studentspartionedByPercentage);
		
		List<Student> first3Students = studentList.stream().limit(3).collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
		System.out.println(first3Students);
		         
	}
}