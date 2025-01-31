public class Main {


  public static void main(String[] args) {
   
          int m = 10 ,p = 20, c = 25, d = 35, e = 45, f = 65;
          int j = (((m*p) * (c-d) )/ (e%f));
          int H =  --j;
            System.out.println(Math.abs(H));
                  
          int G = 45;
                  System.out.println(H);
           String value = (H > G) ? "is it the corect value" : "is not correct value";
           System.out.println(value);
           switch(G) {
               case 10:
                   System.out.println("10");
                   break;
               case 20:
                   System.out.println("20");
                   break;
               case 30: 
                   System.out.println("30");
                   break;
               case 50:
                   System.out.println("it is correct ans");
                   break;

                   default;
                   system.out.println (" The user dose not exsits")
                   
           }
                   
        
  }
}