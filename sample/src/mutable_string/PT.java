package mutable_string;

public class PT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long bufferstartTime=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("java");
		for(int i=1;i<=100000;i++)
		{
			sb.append("java");
			
		}
		long bufferendTime=System.currentTimeMillis();
		long builderstartTime=System.currentTimeMillis();
		
		StringBuffer s=new StringBuffer("java");
		for(int i=1;i<=100000;i++)
		{
			s.append("java");
			
		}
		long builderendTime=System.currentTimeMillis();
		System.out.println("Buffer: "+(bufferendTime-bufferstartTime)+"ms");
		System.out.println("Builder: "+(builderendTime-builderstartTime)+"ms");
		
		int a[]= {6,9,6,8,9};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println();
		for(int i:a)
		{
			System.out.print(" "+i);
		}


	}

}
