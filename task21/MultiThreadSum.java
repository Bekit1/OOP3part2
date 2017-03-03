package task21;


public class MultiThreadSum {
static void sum(int[]array, int threadNumber){
	SingleThreadSum[] threadarray = new SingleThreadSum[threadNumber];
	for (int i = 0; i < threadarray.length; i++) {
		int size = array.length / threadNumber;
		int begin = size * i;
		int end = ((i + 1) * size);
		if ((array.length - end) < size) {
			end = array.length;
		}
		threadarray[i] = new SingleThreadSum(array, begin, end);
	}
	long s=0;
	for (int i = 0; i < threadarray.length; i++) {
		try {
				
			threadarray[i].getThr().join();
			s=threadarray[i].getSum()+s;
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	System.out.println(s);
}
}

