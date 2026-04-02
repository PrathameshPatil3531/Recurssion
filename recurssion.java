public class recurssion {

    public static int pow(int n ,int p ){
        if(p == 1){
            return n;
        }else{
          if(p %2 ==0 ){
            return pow(n , p/2) *pow(n , p/2);
          }else{
            return n *pow(n , p/2) *pow(n , p/2);
          }
        }
       
    }

    public static int tiling(int n){
      if ( n == 0 || n ==1){
        return 1;

      }
      int fnm1 = tiling((n-1));
      int fnm2 = tiling(n-2);
      return fnm1 + fnm2;
    }

    public static void main (String args[]){

        System.out.println(tiling(5));

    }
    
}
