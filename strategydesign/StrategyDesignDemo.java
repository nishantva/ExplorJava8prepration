package strategydesign;

public class StrategyDesignDemo {
	
	public static void main(String arg[]) {
		Context context=new Context(new OperationAdd());
		System.out.println(context.executeStrategy(3, 3));
		
		context=new Context(new OperationSub());
		System.out.println(context.executeStrategy(4, 2));
	}

}
