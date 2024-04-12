class calsi{
	double real;
	double imaginary;
	calsi obj1;
	calsi obj2;
	calsi(int real,int img){
		this.real=real;
		this.imaginary=img;
	}
	String  sum(calsi obj1,calsi obj2){
		this.obj1=obj1;
		this.obj2=obj2;
		double real_add=(obj1.real+obj2.real);
		double img_add=(obj1.imaginary+obj2.imaginary);
		String str=(real_add+"+"+img_add+"i");
		return str;
	}

	double addition(double a,double b){
		return a+b;
	}
	double subtracrion(double a,double b){
		return a-b;
	}
	double multiplication(double a,double b){
		return a*b;
	}
	double division(double a,double b){
		if(b==0){
			return 0;
		}
		else{
			return  a/b;
		}
	}
	double square(double a){
		return a*a;
	}
	double cube(double a){
		return a*a*a;
	}
	
	double squareRoot(double a){
		double num=a;
		for(int i=0;i<a;i++){
			if(i*i==num){
				return i;
			}
		}
		return -1;
	}
	double cubeRoot(double a){
		double num=a;
		for(int i=0;i<a;i++){
			if(i*i*i==num){
				return i;
			}
		}
		return -1;
	}
	
	double modulus(double a,double b){

		return a%b;
	}
	double percentage(double a,double b){
		//a=50,b=2
		return (a*b/100);
	}
	double powerFunction(int base,int power){
		double res=1;
		for(int i=1;i<=power;i++){
			res=res*base;	
		}
		return res;
	}
	double logArithmetic(double base, double input){
		double res=1;
		for(int i=1;i<=input;i++){
			res=res*base;	
			if(input==res){
				return i;
			}
		}
		return -1;
	}
	double modValue(double num){
		if(num>0){
			return num;
		}
		else if(num==0){
			return 0;
		}	
		else{
			return -1*num;
		}
	}
	int min(int a,int b){
		if(a<b){
			return a;
		}
		else{
			return b;
		}
	}
	int max(int a,int b){
		if(a>b){
			return a;
		}
		else{
			return b;
		}
	}
	void  generatefraction(int n1,int n2){
		int minnum=min(n1,n2);
		int i;
		for( i=min(n1,n2);i>0;i--){
			if(n1%i==0&&n2%i==0){
				System.out.println((n1/i)+"/"+(n2/i));
				//res =((n1/i)+"/"+(n2/i));
				break;
			}
		}
		//return (float)((n1/i)+"/"+(n2/i));
	}
	void mixFraction(int a,int b){
		if(b==0){
			System.out.println("can not be divided by 0");
		}
		int quotient=a/b;
		int rem=a%b;
		for(int i=min(rem,b);i>0;i--){
			if(rem%i==0&&b%i==0){
				System.out.println(quotient+"_"+(rem/i)+"/"+(b/i));
				break;
			}
		}
	
	}
	double exponentialPower(int power){
		//value of e=2.71828
		double e=2.71828;
		double res=1;
		if(power==0){
			return 1;
		}
		else if(power<0){
			//double res1=1;
			for(int i=0;i<(-power);i++){
				res=res/e;
		        }
		      // res=(1/res1);
		}
		else if(power>0){
			for(int i=0;i<power;i++){
					res=res*e;
				}
		}
		return res;
	}
	long ncr(long n,long r){
		long n_fact=n*(factorial(n-1));
		long r_fact=r*(factorial(r-1));
		long nr_fact=(n-r)*factorial((n-r)-1);
		long res =(n_fact/(r_fact*nr_fact));
		return res;
	}
	long npr(long n,long r){
		long n_fact=n*(factorial(n-1));
		long nr_fact=(n-r)*factorial((n-r)-1);
		long res =(n_fact/(nr_fact));
		return res;
	}
	long factorial(long num){
		if(num==0){
			return 1;
		}
		else if(num<0){
			return -1;
		}
		else if(num>0){
			//long fact=num*factorial(num-1);
			return num*factorial(num-1);
		}
		return num*factorial(num-1);
	}
	public static void main(String args[]){
		calsi c1=new calsi(2,4);
		//1:addition
				//double res1=c1.a(1000);	
		//double res1=c1.cubeRoot(1000);	
		//System.out.println("sq-root:"+res1);
				//double res1=c1.squareroot(1000);	
				//System.out.println("sq-root:"+res);
		//double res=c1.percentage(50,4);	
		//System.out.println("percentage->:"+res);
				//double res=c1.powerFunction(2,4);	
				//System.out.println("power function->:"+res);
		//double num=c1.modValue(-231);
		//System.out.println(num);
				//for finding an fraction of two number
				//System.out.println(c1.generatefraction(15,25));
				//c1.generatefraction(225,321);
		//for finding an mixed fration
		//c1.mixFraction(20,8);
				//sumof two complex number
				/*calsi c1 =new calsi(4,6);
				calsi c2 =new calsi(2,-3);
				System.out.println(c1.sum(c1,c2));
				*/
		//finding factorial
		//System.out.println(c1.factorial(5));
				//finding Exponential power
				/*
				System.out.println(c1.exponentialPower(-2));
				System.out.println(c1.exponentialPower(4));							  
				System.out.println(c1.exponentialPower(0));
				*/
	//finding an ncr series ans
				System.out.println(c1.ncr(5,2));			
				System.out.println(c1.npr(5,2));			
					
			
	}	
}
