class sumOf2complex{
	double real;
	double imaginary;
	sumOf2complex obj1;
	sumOf2complex obj2;
	sumOf2complex(int real,int img){
		this.real=real;
		this.imaginary=img;
	}
	String  sum(sumOf2complex obj1,sumOf2complex obj2){
		this.obj1=obj1;
		this.obj2=obj2;
		double real_add=(obj1.real+obj2.real);
		double img_add=(obj1.imaginary+obj2.imaginary);
		String str=(real_add+"+"+img_add+"i");
		return str;
	}

	public static void main(String args[]){
		sumOf2complex c1 =new sumOf2complex(4,6);
		sumOf2complex c2 =new sumOf2complex(2,-3);
		System.out.println("Addition of two Complex Number-->"+c1.sum(c1,c2));	
	}
}
