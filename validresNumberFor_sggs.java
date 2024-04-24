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
	boolean validString(String s1) {
		boolean fun1 = first4Digits(s1);
		boolean fun2 = branchCode(s1);
		boolean fun3 = last_3_digits(s1);
	 	 if (s1.length() == 10 && fun1 == true && fun2 == true && fun3 ==true ) {
		    return true;
		} 
		else {
		    return false;
		}
  	}
       	boolean  first4Digits(String s1) {
       		if (s1.length() == 10) {
			    if((s1.charAt(0)=='2' && s1.charAt(1)=='0' && s1.charAt(2)<='1'&& s1.charAt(3)>='0') ||
			    	 (s1.charAt(0)=='2' && s1.charAt(1)=='0' && s1.charAt(2)=='2'&& s1.charAt(3)<='4')){
				return true;
			    }
			     else {
				return false;
			    }
		}
	     return false;
        }
	boolean branchCode(String s1) {
	       String d1 = s1.substring(4, 7);
	       String[] validStrings = {"bit", "BIT", "BCS", "bcs", "BME", "bme", "BCH", "bch"};

	       for (String str : validStrings) {
		    if (d1.equals(str)) {
		        return true;
		    }
		}
	       return false;
        }
        boolean last_3_digits(String s1) {
		if (s1.length() == 10) {
			if (s1.charAt(7) >='0'&&s1.charAt(7) <='9'){
				 if(s1.charAt(8)<='9'&&s1.charAt(8)>='0'){
						 if(s1.charAt(9) <='9'&&s1.charAt(9) >='0'){
							return true;
						  }
						  
						 else{
						 	return false;
						 }
				  }
			         else {
					return false;
			         }
			 }
		        else {
		      	 	return  false;
		        }
		}
		else{
			return  false;
		}
	}
	String[] countOfValidStringArr(String[] arr){
		String[] s1=new String[arr.length];
	 	int  i=0;
	 	int k=0;
	 	while(i<arr.length){
		 	if(validString(arr[i])){
		 		s1[k]=arr[i];
		 		
		 		k++;
		 	}
		 	i++;
		}
		return  s1;	
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
		 		System.out.print("   "+arr[i]);
		 	}
		 }
	}
	public static void main(String args[]){
		CountValidString obj1=new CountValidString();
		int sizeOfStringArray=100;
		String[] w1=obj1.store1kStringInStringArray(sizeOfStringArray);
		System.out.println("\nValid String-->");
		String[] validStrings=obj1.countOfValidStringArr(w1);
		obj1.printAllStrings(validStrings);

		
	}
}
