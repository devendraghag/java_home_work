package FunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerDemo2
{
	public static void main(String[] args) 
	{
		Consumer<Integer> consumer = (t) -> System.out.println("Printing value "+ t);
		consumer.accept(111);

//		Consumer<Integer> obj = new Consumer() {
//			@Override
//			public void accept(Object o)
//			{
//				System.out.println("Printing value "+ o);
//			}
//		};
//		obj.accept(11);
	}

}