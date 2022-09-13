			import java.util.Scanner;
			
			public class EvenOdds {
			
				public static void main(String[] args) {
					// TODO Auto-generated method stub
					Scanner sc = new Scanner(System.in);
					long n = sc.nextLong();
					long k = sc.nextLong();
					
					if (k  <= (n+1)/2) {
						System.out.println(2*(k)-1);
					}else {
						long x = (k) - (n+1)/2;
						System.out.println(2*x);
					}
					
				}
			
			}
