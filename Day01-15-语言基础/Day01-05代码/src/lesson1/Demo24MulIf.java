public class Demo24MulIf {

	public static void main(String[] args) {
		/*
		 * 多重if语句：多选一
		 * if(条件1){
		 * 	//条件1成立，执行此处的代码，后面的代码都不执行了
		 * 
		 * }else if(条件2){
		 * 	//条件1不成立，条件2成立，执行此处代码。。
		 * 
		 * }else if(条件3){
		 * 	//条件1,2都不成立，条件3成立，执行此处代码。。。
		 * 	
		 * }。。。
		 */
		
		String sex = "猴";
		
		if("男性".equals(sex)){
			System.out.println("男厕所。。"+sex);
		}else if("女性".equals(sex)){
			System.out.println("女厕所。。"+sex);
		}else{
			System.out.println("我也不知道了， 也许不去厕所吧。。");
		}
		
		System.out.println("over..");
	}

}

