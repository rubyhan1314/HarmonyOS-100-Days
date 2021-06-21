import java.util.Arrays;

public class Demo64ArrayCopy {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		
		int[] b = new int[10];
		//数组的拷贝：
		//方法一：自己通过循环依次复制，吭哧吭哧
		for(int i=0;i<a.length;i++){
			b[i] =a[i];
		}
		
		for(int e :b){
			System.out.println(e);
		}
		System.out.println("---------");
		
		//方法二：借助于Arrays类
		/*
		 * copyOf(int[] 原始数组，int 新数组的长度)
		 * 返回值就是新的数组
		 * 
		 */
		int[] c = Arrays.copyOf(a, 5);//int[] c = {1,2,3,0,0}
		for(int e:c){
			System.out.println(e);
		}
		
		
		System.out.println("--------");
		//方法三：借助于System类
		/*
		 * arraycopy(src, srcPos, dest, destPos, length)
		 * 第一个参数：原始数组
		 * 第二个参数：从原始数组的哪个下标开始复制
		 * 第三个参数：目标数组
		 * 第四个参数：目标数组从哪个下标开始贴
		 * 第五个参数：拷贝几个数据
		 */
		//int[] a = {1,2,3};
		int [] d = new int[10];
		System.arraycopy(a, 1, d, 5, 2);
		for(int e:d){
			System.out.print(e+"\t");
		}
		
	}

}

