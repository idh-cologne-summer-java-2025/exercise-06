package idh.java;

public class Fibonacci_memory {

		
			
			public static int memonacci(int n) {
			    
				int o = 0;
				int p = 1;
				int q = 0;
				
			    if (n == 0)
			            return o;
			        
			    if (n == 1)
			            return p;
			       
			    if (n > 1) {
			    	  for (int i = 2; i <= n;i++) {
			    		  q = o + p;
			    		  o = p;
			    		  p = q;
			    	  }
			    	  return q;
			        }
			return 0;
		}

			
				
			
		

		public static void main(String[] args) {
			int n = 50; 
			System.out.println("Die ersten " + n + " Fibonacci-Zahlen:");
			for (int i = 0; i < n; i++) {
				System.out.print(memonacci(i) + " ");
				
			}
		
		}

	}


