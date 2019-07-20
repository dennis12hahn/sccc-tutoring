package inc_vs_dec;

public class Demo {

	public static void main(String[] args) {
		test(10);		
	}
	
	private static void test(int runs) {
		for (int i = 0; i < runs; i++) {
			
			int N = 1000000000;
			System.out.println("Testing loops: ");
			
			long start = 0;
			long elapsed = 0;
			
			System.out.println("Incrementing");
			start = System.nanoTime();
			incLoop(N);
			elapsed = System.nanoTime() - start;
			
			System.out.println("Time for incrementing ");
			System.out.println(elapsed);
			
			
			System.out.println("Decrementing");
			start = System.nanoTime();
			decLoop(N);
			elapsed = System.nanoTime() - start;
			
			System.out.println("Time for decrementing ");
			System.out.println(elapsed);
			
			
		}
	}
	
	private static void incLoop(int N) {
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += i;
		}
	}
	
	private static void decLoop(int N) {
		int sum = 0;
		for (int i = N; i > 0; i--) {
			sum += i;
		}
	}

}
