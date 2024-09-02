import java.util.*;
class Main{
    public static void main(String[] args) {
        List<Integer> oop = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<5;i++){
            int n=sc.nextInt();
            oop.add(n);
        }
        int sum =oop.stream().reduce(0,(x,y) -> (x+y));
        int avg = sum/oop.size();
        System.out.println("avg is " +avg);
    }
}