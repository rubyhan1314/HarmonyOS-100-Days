public class Demo25If {

	public static void main(String[] args) {
		//给定一个性别和年龄，判断是否可以结婚
		//男：不能小于22周岁
		//女：不能小于20周岁
		
		char sex = '男';
		
		int age = 23;
		
		if(sex == '男'){
			//男性，年龄
			if(age >= 22){
				System.out.println("可以娶媳妇啦。。好开心。。");
			}else{
				System.out.println("还小呢，再等等。。。");
			}
		}else if(sex == '女'){
			//女性，年龄
			if(age >= 20){
				System.out.println("可以找婆家了。。。");
			}else{
				System.out.println("太小了，不能嫁人。。。");
			}
		}else{
			System.out.println("搞不清楚性别，不能结婚。。");
		}
		
	}

}

