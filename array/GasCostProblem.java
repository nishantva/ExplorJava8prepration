
public class GasCostProblem {
	
	public static void main(String arg[]) {
		int cost[]= {3,4,5,1,2};
		int gas[]= {1,2,3,4,5};
		
		
		 int totalgas=0,totalcost=0;

	        for(int i=0;i<gas.length;i++){
	            totalgas+=gas[i];
	            totalcost+=cost[i];
	        }
	        if(totalgas<totalcost){
	            System.out.print("not possible");
	            return;
	        }
	     int tankgas=0,start=0;
	        for(int i=0;i<gas.length;i++){
	           tankgas += (gas[i]-cost[i]);
	           if(tankgas< 0){
	               start =i+1;
	               tankgas=0;
	           }

	}
	        
	        System.out.print(start);

}
}
