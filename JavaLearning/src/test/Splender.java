package test;
class Bike{  
  void run(int a){System.out.println("running");}  
}  
class Splender extends Bike{  
  void run(String a){System.out.println("running safely with 60km");}  
  
  public static void main(String args[]){  
    Bike b = new Splender();//upcasting  
    b.run(5);  
  }  
}