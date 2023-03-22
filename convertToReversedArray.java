public static int[] digitize(long n) {
    List<Integer> l = new ArrayList<>();
    int a= 0;
    char values[] = Long.valueOf(n).toString().toCharArray();
    for(int x=values.length-1;x>=0;x--) {
      a= values[x] - '0';
      l.add(a);
    }
    return l.stream().mapToInt(i->i).toArray();
  }
