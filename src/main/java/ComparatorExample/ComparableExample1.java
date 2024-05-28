package ComparatorExample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableExample1 {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Devendra", "Kalyan1", 1.1));
		al.add(new Employee("Devendra1", "Kalyan2", 1.0));
		al.add(new Employee("Devendra2", "Kalyan", 1.1));
		
		Collections.sort(al, new An());
		
		for(Employee e: al)
		{
			System.out.println(e.getLocation() + " " + e.getName() + " " + e.getSalary());
		}





		//method one
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};

		//Method two
		Comparator<Integer> comparator2 = (o1, o2) -> o1.compareTo(o2);

		//Method three
		Label label = new Label();
		Button button = new Button("Send");
		button.addActionListener((ActionEvent e) -> label.setText("Sent..."));
	}
}
