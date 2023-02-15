public class DigPow {
	
	public static long digPow(int n, int p) {
    //MAYBE NEED TO IMPROVE
    int digits=digitsN(n);
    int comodin=n;
    int m[] = new int[digits+1];
    int suma=0,x=0;
    while(x<digits){
      m[x]=n%10;
      n=n/10;
      x++;
    }
    x=0;
    p=p+digits-1;
    while(x<digits){
      suma+= Math.pow(m[x],p);
      System.out.println("1.-"+suma+","+m[x]+","+p);
      p--;  
      x++;
      System.out.println("2.-"+suma+","+m[x]+","+p+","+digits);
    }
    
    int result = ((suma%comodin==0)?suma/comodin:-1);
    
    return result;	
  }
  public static int digitsN(int n){
    int digits=0;
    while(n>0){
      digits++;
      n=n/10;
    }
    return digits;
  }
}
