package interfacedemo;

public class Third  extends Second implements First
{
    
}

class MainClass
{
   public static void main(String[] args) 
   {
       First f = new Third();
        
       f.myMethod();
   }
}
