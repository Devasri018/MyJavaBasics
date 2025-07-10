public class MinimumAndMaximumInArray {
    public static void main(String[] args) {
        int [] n={10,4,3,5,22,4,3,7,8,};
        int max=n[0];
        int min=n[0];
        for(int num: n){
            if(num>max)
                max=num;
            if(num<min)
                min=num;
        }
        System.out.println(+max);
        System.out.println(+min);
    }
}
