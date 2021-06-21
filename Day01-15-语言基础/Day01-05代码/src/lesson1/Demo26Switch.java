public class Demo26Switch {

	public static void main(String[] args) {
		/*
		 * switch-case	语句：选择结构，多个分支选择一个执行。
		 * 
		 * 语法结构：
		 * switch(表达式/变量){//byte,short,int,char,enum,String
		 * 
		 * case 数值1：分支1；
		 * 	break；
		 * 
		 * case 数据2：分支2；
		 * 	break；
		 * 
		 * case 数值3：分支3；
		 * 	break；
		 * 。。。
		 *  default：最后一个分支；
		 *  break；
		 * }
		 * 
		 */
		/*
		 * 题目：一周的食谱，每天吃啥
		 * 周一：麻辣烫
		 * 周二：红烧肉
		 * 周三：热干面
		 * 周四：炸酱面
		 * 周五：烤冷面
		 * 周六：方便面
		 * 周日：火锅
		 */
		
		int weekDay = 3;
		
		switch(weekDay){
		
		case 1:
			System.out.println("麻辣烫");
			break;
		case 2:
			System.out.println("红烧肉");
			break;
		case 3:
			System.out.println("热干面");
			break;
		case 4:
			System.out.println("炸酱面");
			break;
		case 5:
			System.out.println("烤冷面");
			break;
		case 6:
			System.out.println("方便面");
			break;
		case 7:
			System.out.println("火锅");
			break;
		default:
			//最后的操作：前面的case如果都没有匹配上，那么执行最后的这个default语句。
			System.out.println("信息有误。。");
			break;
		
		}
		
		System.out.println("over....");
	}

}

