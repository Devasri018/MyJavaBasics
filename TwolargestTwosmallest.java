public class TwolargestTwosmallest {
    public static void main(String[] args) {
        int [] n={34,65,42,31,21,76,45};
        int min1=n[0],min2=n[0];
        int max1=n[0],max2=n[0];
        if(min1>min2){
            int temp=min1;
            min1=min2;
            min2=temp;
        }
        if(max1<max2){
            int temp=max1;
            max1=max2;
            max2=temp;
        }
        for(int i=2;i<n.length;i++){
            int num =n[i];
            if(num<min1){
                min2=min1;
                min1=num;
            }else if(num<min2){
                min2=num;
            }
            if(num>max1){
                max2=max1;
                max1=num;
            }else if(num>max2){
                max2=num;
            }
        }
        System.out.println(+min1+","+min2);
        System.out.println(+max1+","+max2 );
    }
}
