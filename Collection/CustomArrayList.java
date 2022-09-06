package Collection;

import java.util.ArrayList;

public class CustomArrayList  extends ArrayList{
	
	@Override
	public boolean add(Object o) {
		if(this.contains(o)) {
			return true;
		}
		else {
			return super.add(o);
		}
		
	}
	//this the custo arraylist not allow duplicate
	
	public static void main(String arg[]) {
		
		CustomArrayList list=new CustomArrayList();
		list.add(1);
		list.add(1);
		
		list.add(1);
		
		list.add(2);
		System.out.print(list);
		
		
	}
	
	

}
