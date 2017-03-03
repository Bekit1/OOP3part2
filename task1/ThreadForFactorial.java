package task1;

import java.math.BigInteger;

public class ThreadForFactorial extends Thread{
private int number;

	public ThreadForFactorial(int number) {
	super();
	this.number = number;
}

	public ThreadForFactorial() {
		super();
	}

	public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		BigInteger s=BigInteger.valueOf(1);
		
		for (int i = 1; i<=number;i++) {
			s = s.multiply(BigInteger.valueOf(i));
			System.out.println(Thread.currentThread()
					.getName()+" "+i+"!="+s);
			
			
		}
	}

}
