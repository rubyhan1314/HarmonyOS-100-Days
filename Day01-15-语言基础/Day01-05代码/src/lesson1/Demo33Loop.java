public class Demo33Loop {

	public static void main(String[] args) {
		/*
		 * 多层循环嵌套：
		 * 
		 * 外层循环i的值，每变化一次，里层j的循环，完整的执行1遍。
		 */
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.println("i:" + i + ", j:" + j);
			}
		}
	}

}

