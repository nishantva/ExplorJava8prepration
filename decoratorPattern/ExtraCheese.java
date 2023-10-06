package decoratorPattern;

public class ExtraCheese  extends ToppingDecorator {// extends kr rha topping ko
  BasePizza basePizza;
  
  public ExtraCheese(  BasePizza basePizza) {
	  this.basePizza=basePizza;
  }
  
  
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.basePizza.cost()+10;
	}

}
