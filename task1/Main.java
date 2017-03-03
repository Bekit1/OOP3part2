package task1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<100;i++){
	ThreadForFactorial thr=new ThreadForFactorial(i);
	thr.start();
}
	}

}
