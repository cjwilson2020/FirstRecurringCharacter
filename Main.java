import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    //Google Question
    // Given an array = [2,5,2,3,3,5,1,2,4]
    // It should return 2

    //Given an array = [2,1,1,2,3,5,1,2,4]
    //It should return 1

    //Given an array = [2,3,4,5]
    // It shoule return null

    Integer[] a1 = {2,5,2,3,3,5,1,2,4};
    Integer[] a2 = {2,1,1,2,3,5,1,2,4};
    Integer[] a3 = {2,3,4,5};

    Integer first = getFirstRepeat(a1); //O(n)
    if (first == null){
      System.out.println("No repeating numbers found\ngetFirstRepeat returned " + first);
    }else{
      System.out.println("The first number to repeat in the given array is " + first);
    }
  }

  static Integer getFirstRepeat(Integer[] a){
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int cnt = 0;
    for (int i = 0; i < a.length; i++){
      if (!a[i].equals(null)){
        cnt++;
        if (map.containsKey(a[i])){
          // System.out.println(a[i]+" found in HashMap!");
          // System.out.println("Value: " + map.get(a[i]));
          map.put(a[i], map.get(a[i]) + 1); //This is just for further implementation
          // where the hashtable is storing the count of all of the repetitions for each unique element in the array
          cnt = 0;
         // System.out.println("New value: " + map.get(a[i]));
          return a[i];
        } else{
          map.put(a[i], cnt);
          cnt = 0;
        }
      }
    }
    // System.out.println("Keys in map" + map.keySet().toString());
    // System.out.println("Values in map" + map.values().toString());

    return null;
  }
}