package lambda;




public  class LambdaExample  implements  Sayable {

	Sayable  str1=(message)->{
		String str2="hii all";
		return message;
	};

	@Override
	public String say(String message) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
