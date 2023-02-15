public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    int x=0,y=0;
    if(walk.length ==10){
      for(char letter: walk){
        x += (letter == 'n')?1:0;
        y += (letter=='e')?1:0;
        x -= (letter == 's')?1:0;
        y -= (letter=='w')?1:0;
      }
      return (x==0 && y==0)?true:false;
    }
    return false;
  }
}
