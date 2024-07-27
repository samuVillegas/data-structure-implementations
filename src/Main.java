public class Main {
    public static void main(String[] args) {
        arrayListFunc();
   }

   public static void arrayListFunc(){
       ArrayList<Integer> arrayList = new ArrayList<>();
       arrayList.add(1);
       arrayList.add(2);
       arrayList.add(3);
       arrayList.add(4);
       arrayList.add(5);
       arrayList.add(6);
       arrayList.add(7);
       arrayList.add(8);
       arrayList.add(9);
       arrayList.add(10);
       arrayList.add(11);
       arrayList.add(12);
       arrayList.add(13);
       for(int i = 0; i < arrayList.size(); i++){
           System.out.println(arrayList.get(i));
       }
       System.out.println("**************************");
       System.out.println(arrayList.contains(1));
       System.out.println("**************************");

       System.out.println("**************************");
       System.out.println(arrayList.delete(7));

       for(int i = 0; i < arrayList.size(); i++){
           System.out.println(arrayList.get(i));
       }
       System.out.println(arrayList.size());
       System.out.println("**************************");
   }
}