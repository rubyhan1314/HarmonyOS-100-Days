/**
*位移运算
*/
public class Demo17ShiftBitwiseOperators 
{
	public static void main(String[] args) 
	{
		int x = 2227;
		System.out.println(Integer.toBinaryString(x));
		/*
		*2227		00000000 00000000 00001000 10110011
		*左移3位	00000 00000000 00001000 10110011  000，低位补3个0
		*右移3位	000  00000000 00000000 00001000 10110，低位舍弃后3位，高位补0
		*无符号右移		正数同右移
		*
		*-2227		11111111 11111111 11110111 01001101
		*左移3位	11111 11111111 11110111 01001101  000，低位补3个0
		*右移3位	111  11111 11111111 11110111 01001101，低位舍弃后3位，高位补1
		*无符号右移	000  11111 11111111 11110111 01001101，低位舍弃后3位，高位补0	
		*/
		//左移3位
		int num1 = x << 3;
		System.out.println(num1);//17816
		System.out.println(Integer.toBinaryString(num1));//100010110011000
		//右移3位
		int num2 = x >> 3;
		System.out.println(num2);//278
		System.out.println(Integer.toBinaryString(num2));//100010110
		//无符号右移
		int num3 = x >>> 3;
		System.out.println(num3);//278
		System.out.println(Integer.toBinaryString(num3));//100010110

		System.out.println("-------");

		int y = -2227;
		System.out.println(Integer.toBinaryString(y));
		//左移3位
		int num4 = y << 3;
		System.out.println(num4);//-17816
		System.out.println(Integer.toBinaryString(num4));//11111111111111111011101001101000
		//右移3位
		int num5 = y >> 3;
		System.out.println(num5);//-279
		System.out.println(Integer.toBinaryString(num5));//11111111111111111111111011101001
		//无符号右移
		int num6 = y >>> 3;
		System.out.println(num6);//536870633
		System.out.println(Integer.toBinaryString(num6));//11111111111111111111011101001
		

		


		
	}
}

