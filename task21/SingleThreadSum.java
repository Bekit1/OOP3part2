package task21;

public class SingleThreadSum implements Runnable {
	private int[] array;
	private int begin;
	private int end;
	private long sum;
	private Thread thr;
	public SingleThreadSum(int[] array, int begin, int end) {
		super();
		this.array = array;
		this.begin = begin;
		this.end = end;
		thr = new Thread(this);
		thr.start();
		this.sum=begin;
	}
	
	public Thread getThr() {
		return thr;
	}

	public long getSum() {
		return sum;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=begin;i<end;i++){
			this.sum=this.sum+array[i];
		}
	}
	
}
