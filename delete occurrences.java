import java.util.*;
public class EnoughIsEnough {
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
    int ocurrencesLimit=0;
    boolean isMaxLimit=false;
    ArrayList<Integer> n = new ArrayList<>();
    for(int x=0; x<elements.length;x++){
      ocurrencesLimit=0;
      isMaxLimit=false;
      n.add(elements[x]);
      for(int y=0; y<n.size();y++){
        if(n.get(y)== elements[x]){
          isMaxLimit = (ocurrencesLimit==maxOccurrences)?true:false;
          ocurrencesLimit+=1;
          if(isMaxLimit)
            n.remove(y);
        }
      }
    }
    int[] values = new int[n.size()];
    values =  n.stream().mapToInt(i->i).toArray();
		return values;
	}
}
