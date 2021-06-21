class Demo66Array 
{
	public static void main(String[] args) 
	{
		//1.定义二维数组
        int [][] a = { {1,2}, {2,3,4,5}, {5,6,7}};
		for(int i = 0; i < a.length; i++) {   
            for(int j = 0; j < a[i].length; j++) {
                System.out.println("a["+ j + "][" + j + "]=" + a[i][j] + ", ");
            }
            System.out.println();
        }
    }
}

