import java.util.Arrays;
public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
    double arr[] = Arrays.copyOf(s,n);
    int init=3;
      for(int x=2;x<n-1;x++){
        arr[x+1] += arr[x]+arr[x-1]+arr[x-2];
      }
    return arr;
  }
