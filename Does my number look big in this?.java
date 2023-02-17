public class NumberUtils {
  public static boolean isNarcissistic(int number) {
    String num = Integer.toString(number);
    int x=0,y=0;
    char values[] = num.toCharArray();
    for(char c: values){
      x = c - '0';
      y+=Math.pow(x,values.length);
    }
    if(number == y)
      return true;
    else
      return false;
  }
}
