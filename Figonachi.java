
public class Figonachi {
	
	 public static int  figo(int a) {
		 System.out.print("0 1");
		 	int var1=0;
			int var2=1;
			int var3=0;
			int var4=0;
				for (int i=0;i<(a-2);) {
				
					var3=var1+var2;
					System.out.print(" "+var3);
					i++; if (i>=(a-2)) {break;}
					var4=var2+var3;
					System.out.print(" "+var4);
					i++;if (i>=(a-2)) {break;}
					var1=var3+var4;
					System.out.print(" "+var1);
					i++;if (i>=(a-2)) {break;}
					var2=var4+var1;
					System.out.print(" "+var2);
					i++;if (i>=(a-2)) {break;}
				}	
		 return(1);
			
	 }
	public static void main(String[] args) {
		figo(10);	
	}
}
