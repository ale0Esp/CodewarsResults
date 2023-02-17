import java.util.ArrayList;
public class DirReduction {
    public static String[] dirReduc(String[] arr) {
      int x=0;
      //nees to improved
      ArrayList<String> arr2 = new ArrayList<>();
      for(String dir : arr){
          arr2.add(dir);
        }
      while(x+1<arr2.size()){
        if(arr2.get(x).equals("NORTH") && arr2.get(x+1).equals("SOUTH") 
           ||arr2.get(x).equals("SOUTH") && arr2.get(x+1).equals("NORTH")){
          arr2.remove(x);
          arr2.remove(x);
          x=0;
        }else if(arr2.get(x).equals("EAST") && arr2.get(x+1).equals("WEST") 
           ||arr2.get(x).equals("WEST") && arr2.get(x+1).equals("EAST")){
          System.out.println(arr2.get(x)+arr2.get(x+1));
          arr2.remove(x);
          arr2.remove(x);
          x=0;
        }else{
          x++;
        }
      }
      String[] arr3 = new String[arr2.size()];
      return (arr3=arr2.toArray(arr3));
    }
}
