import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    int a=0,x=0,y=0; 
    int[] arr;
    for(x=0;x<stops.size();x++){
      for(y=0;y<2;y++){
        arr=stops.get(x);
        if(y==0)
          a+=arr[y];
        else
          a-=arr[y];
      }
    }
    return a;
  }
}
