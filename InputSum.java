public class InputSum {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};

        System.out.println(inputSum(a));
    }

    static int inputSum(int a[]){
        int total_sum=0;
        for(int i=0;i<a.length;i++){
            total_sum = total_sum + a[i];
        }
        return total_sum;
    }
}
