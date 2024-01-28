class Dhanshri {
    static void Display_array(int a[]) {
        // for printing an array elements
        for (int i = 0; i < a.length; i++) {
            System.out.print("  " + a[i]);
        }
    }

	    static int First_element(int a[]) {
		int first = a[0];
		return first;
	    }

		    static int last_element(int a[]) {
			int last = a[a.length - 1];
			return last;
		    }

			    static int sum(int a[]) {
				int sum = 0;
				for (int i = 0; i < a.length; i++) {
				    sum += a[i];
				}
				return sum;
			    }

			   public static void main(String[] args) {
				int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
				 Display_array(array);
			         System.out.println("  ");
			         System.out.println(First_element(array));
				 System.out.println(last_element (array));
				 System.out.println(sum(array));
				 System.out.println(" \n ");
			 }
}

  
