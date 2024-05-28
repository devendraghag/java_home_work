package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo3
{
	public static void main(String[] args) 
	{
		Consumer<Integer> consumer = (t) -> System.out.println("Printing value "+ t);
		consumer.accept(111);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,7);
//		list.stream().forEach(consumer);
//		list.stream().forEach((t) -> System.out.println(t));
//		list.stream().forEach(System.out::println);
		list.stream().forEach(ConsumerDemo3::hello);
	}
	private static void hello(int a){
		System.out.println("Hello " + a);
	}

}
