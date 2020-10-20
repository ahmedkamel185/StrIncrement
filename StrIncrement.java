public class StrIncrement { 

	//Function to increment string 
	static void incrementStr(String str, int n) 
	{ 

	char[] strArr = str.toCharArray(); 
		
	// loop through each character
	for (int i = 0; i < str.length(); i++) { 

		// storing integer ASCII value of 
		// the character in 'asc' 
		
		int asc = strArr[i]; 
		int m = n;
		
	  strArr[i] = (char)(m + asc);
      
           while (m >= 26){ 
        
            m-=26;
	    strArr[i] = (char)(m + asc); 
            System.out.println(m + asc); 
        
       
           }
      
			
	} 
	
	String str2 = String.valueOf(strArr); 
	System.out.println(str2); 
	
	} 

	//Driver code 
	public static void main(String[] args) { 
		
		String str = "a"; 
                int n = 28;

		incrementStr(str,n); 
		
		
	} 
} 
