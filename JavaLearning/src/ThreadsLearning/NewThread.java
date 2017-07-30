package ThreadsLearning;

public class NewThread extends Thread{
	
	public NewThread(String name){
		super(name);
	}

//	class TestSleepMethod1 extends Thread{  
		 public void run(){  
		  for(int i=1;i<5;i++){  
		    try{Thread.sleep(5000);}catch(InterruptedException e){System.out.println(e + this.getName());}  
		    System.out.println(i + this.getName());  
		  }  
		 }  
		 public static void main(String args[]){  
		  NewThread t1=new NewThread("Thread-1");  
		  NewThread t2=new NewThread("Thread-2");  
		   
		  t1.start();  
		  t2.start();  
		 }  
	 
}
