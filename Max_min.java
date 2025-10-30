public class Max_min {
    public static void main(String[] args) {
        int arr []={13,4,5,6,7,18};
        System.out.println("The max element is -> " + max_ele(arr)+ " And the min element is -> " + min_ele(arr));
    }

    static int max_ele(int a[]){
        int max= Integer.MIN_VALUE;
        for(int A : a){
            if(A>max){
                max=A;
            }
        }
        return max;
    }

    static int min_ele(int a[]){
        int min= Integer.MAX_VALUE;
        for(int A: a){
            if(A<min){
                min=A;
            }
        }
        return min;
    }
}
