public class oops{

    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fb1 = fib(n-1);
        int fb2 = fib(n-2);
        return fb1 + fb2;
        
    }
    public static boolean firstocc(int a[] , int i ){
        if(i == a.length-1){
            return true;
        }
        if(a[i] > a[i+1]){
            return false;
        }
        return firstocc(a , i+1);

        
    } 

    public static int wfc(int a[] ,int i,int k){
        try {
            
            if(a[i] == k){
                return i;
            }
            return wfc(a ,i+1 ,k);
           
        } catch (Exception e) {
            return -1;
        }
    }

    @SuppressWarnings("empty-statement")
    public static int lastocc(int a[] ,int i,int key ){
        if(i == a.length){
            return -1;

        }
        if(a[i] === key){
            lastocc(a, i+1, key);
        }else{

            return i;
        };

        return lastocc(a, i+1, key);

        
    }
    public static void main(String args[]){

System.out.println(wfc((new int[]{1,4,3,4,5}), 0 , 10));        

    }
}



