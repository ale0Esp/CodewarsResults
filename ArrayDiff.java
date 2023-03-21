import java.util.Arrays;

public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {
        for(int x=0;x<b.length;x++){
            for(int y=0;y<a.length;y++){
                if(a[y]==b[x]){
                    a= values(a,b[x]);
                }
            }
        }
    return a;
  }
  
      public static int[] values(int a[], int item){
        return  Arrays.stream(a)
                .filter(i -> i != item)
                .toArray();
    }
