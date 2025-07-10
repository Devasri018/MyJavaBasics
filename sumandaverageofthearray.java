public class sumandaverageofthearray {
    public static void main(String[] args) {
        int [] n={10,20,30,40,50};
        int sum=0;
        double average;
        for(int num:n){
            sum=sum+num;
        }
        average=(double)sum/n.length;
        System.out.println(+sum);
        System.out.println(+average);
    }
}
