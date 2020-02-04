
public class Fraction
{
   private int Num = 1;
   private int Dem = 1;
    public Fraction() {
        Num = 1;
        Dem = 1;
        
    }
    
    public Fraction(int N, int D){
     Num = N;
     Dem = D;
     if(Dem == 0)Dem = 1;
     if(Dem < 0 && Num < 0){
         Dem*=-1;
         Num*=-1;
        }
    }
    
    public Fraction(String a){
     Num = Integer.parseInt(a.substring(0));
     Dem = Integer.parseInt(a.substring(a.length()-1)); 
     if(Dem == 0)Dem = 1;
      if(Dem < 0 && Num < 0){
         Dem*=-1;
         Num*=-1;
        }
    }
    
    public Fraction(Fraction f) {
        this.Num = f.Num;
        this.Dem = f.Dem;
        if(Dem == 0)Dem = 1;
    }
    public void Show(){
    System.out.println(Num);   
    System.out.println("/");   
    System.out.println(Dem);   
    }
    public int getNum() {   
     return Num;   
    }
    public int getDem(){
     return Dem;   
    }
    public String toString(){
        String Re = "";
       Re = String.valueOf(Num) +"/"+ String.valueOf(Dem);
       return Re;
    }
    public double toDouble() {
     double Re; 
     Re = Num / Dem;
     return Re;
    }
    public void reduce(){
        int x =1;
        for(int i = 2; i <= Num; i++){
         if(Dem  % i == 0 && Num % i == 0)x = i;  
        }
       
        Num = Num/x;
        Dem = Dem/x;
    }
    public void setNum(int x){
        Num = x;
    }
    public void setDem(int x){
     Dem = x;   
    }
    public static Fraction multiply(Fraction a, Fraction b){
    int N = a.Num * b.Num;
     int D = a.Dem * b.Dem;
     Fraction f = new Fraction(N,D);
     
     f.reduce();
     return f;
     
    }
    public void multiply(Fraction a){
      this.Num = a.Num * this.Num;
     this.Dem = a.Dem * this.Dem;
     this.reduce();
    }
    
    public static Fraction divide(Fraction a,Fraction b){
        int N = a.Num * b.Dem;      
     int D = a.Dem * b.Num;
     Fraction f = new Fraction(N,D);
     f.reduce();
     return f;
    }
    public static Fraction add(Fraction a,Fraction b){
      int N = (a.Num * b.Dem) + (b.Num * a.Dem);
      System.out.println(N);
      int D = (a.Dem * b.Dem);
      System.out.println(D);
      Fraction f = new Fraction(N,D);
     f.reduce();
     return f;
    }
    public static Fraction subtract(Fraction a,Fraction b){
        int N = (a.Num * b.Dem) - (b.Num * a.Dem);
      int D = (a.Dem * b.Dem);
      Fraction f = new Fraction(N,D);
     f.reduce();
     return f;
    }
    
    public static int GCF(int A, int B){
     int a = A;
     int b = B;
     while(1 < 2){
     if(a == b)break;
    
     if(a > b)a = a-b;
     else b = b -a; 
        }
        return a;
    }
    
 
    
}
