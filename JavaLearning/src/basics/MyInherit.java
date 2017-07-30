package basics;

class MyInherit
{
     public void Display()
     {
         System.out.println("Base display()");
     }
      
     public static void main(String args[])
     {
         MyInherit t1 = new Derived();
         t1.Display();
     }     
}
class Derived extends MyInherit
{
     @Override
     public void Display()
     {
         System.out.println("Derived display()");
     }
}