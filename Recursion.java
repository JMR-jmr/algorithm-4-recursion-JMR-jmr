public class Recursion{
   //part1: factorial non-recursion
   for(int i=2;i<=n;i++){
      int a=*i;
   }
   return a;
     
   //part2: factorial recursion
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
   
   
   //part3: fibonacci sequence non-recursion
   for(int i=0;i<n;i++){
      int a=
   }

   
   
   //part4: fibonacci sequence recursion
     public static int fio(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fio(n - 1) + fio(n - 2);
    }


