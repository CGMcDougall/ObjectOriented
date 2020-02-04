import java.util.Scanner;

public class Main
{
    Scanner Sc = new Scanner(System.in);
  public static void String(String[] args){
      Scanner Sc = new Scanner(System.in);
     
     
      Fraction third = new Fraction(2,6);
     Fraction half = new Fraction(2,4);
     Fraction Sum = Fraction.add(third,half);
    
     //Sum.Show();
    
     third.multiply(half);
   third.Show();
   
   // System.out.println(Fraction.GCF(252,105));  
      
    }
    
    public void Engine(){
        String Go = "WhoCares?";
        while(!Go.equalsIgnoreCase("End")){
            int RN = (int)(Math.random()*10);
         int RD = (int)(Math.random()*20);
         Fraction f = new Fraction(RN,RD);
         
         int RT = (int)(Math.random()*12);
           
         if(RT == 0)f.getNum();
          if(RT == 1)f.getDem();
           if(RT == 2)f.toString();
            
            
            
            Go = Sc.nextLine();
        }
        
        
     
        
        
    }
    
}
