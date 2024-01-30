import java.util.Scanner;
class calsi{
 
 /*static int add(int a,int b){
	return a+b;
	}
		static int sub(int a,int b){
		return a-b;
		}
				static int mul(int a,int b){
			return a*b;
			}*/
				       static int div(int a,int b){
						 if(b==0){
						// System.out.print("Can't divide by one\n");
						 return -1;
						 }
						 else{
						 return a/b;
						}
				      } 
					       
			
				 public static void main(String[] args){
						 
					  int a,b;
					  Scanner obj=new Scanner(System.in);
					  a=obj.nextInt();
					  b=obj.nextInt();
					  div(a,b);
					  System.out.println(div(a,b));
				}
		}	
				 

