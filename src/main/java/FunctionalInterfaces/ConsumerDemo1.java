package FunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerDemo1 implements Consumer<Integer>
{
	@Override
	public void accept(Integer t) 
	{
		System.out.println("printing "+ t);
	}
	
	public static void main(String[] args) 
	{
		ConsumerDemo1 consumer = new ConsumerDemo1();
		consumer.accept(10);
	}

}
