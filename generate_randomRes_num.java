class CountValidString{
	String getRandomString(){
		String str="";
			str=str+'2';
			str=str+'0';
			for(int i=2;i<4;i++){
				int num1=(int)System.nanoTime()%10;
				str=str+num1;
			}
			String branchcode[]={"bit", "BIT", "BCS", "bcs", "BME", "bme", "BCH", "bch"};
			int index=(int)(System.nanoTime()%8);
			str=str+branchcode[index];
					
			for(int i=8;i<=10;i++){
				int num2= (int)System.nanoTime()%10;
				str=str+num2;
			}
	return str;		
	}
	String[] store1kStringInStringArray(int sizeOfString){
	 	String[] str=new String[sizeOfString];
	 	for(int i=0;i<sizeOfString;i++){
	 		str[i]=getRandomString();
	 	}
	 	
	return str;
	}
	void printAllStrings(String[] arr){
	 	for(int i=0;i<arr.length;i++){
		 	if(arr[i]==null){
		 		continue;
		 	}
		 	else{
		 		System.out.println(arr[i]+" "+(i+1));
		 	}
		 }
	}
	public static void main(String args[]){
		CountValidString obj1=new CountValidString();
		int sizeOfStringArray=25;
		String[] w1=obj1.store1kStringInStringArray(sizeOfStringArray);
		obj1.printAllStrings(w1);
	}
}
