public class DuplicateEncoder {
	static String encode(String word){
    boolean f = false;
    char[] a = word.toLowerCase().toCharArray();
    boolean[] isPosChange = new boolean[word.length()];
    for (int x = 0; x < a.length; x++) {
      if(isPosChange[x])
        continue;
      for (int i = x+1; i < a.length; i++) {
        if (a[x] == a[i] && !isPosChange[i]) {
          a[i]=')';
          isPosChange[i]=true;
          f=true;
        }
      }
      if(f){
        a[x]=')';
        f=false;
        isPosChange[x]=true;
      }
    }
    for (int i = 0; i < a.length; i++) {
      if(!isPosChange[i]){
      a[i]='(';
      }
    }
    return String.valueOf(a);
  }
}
