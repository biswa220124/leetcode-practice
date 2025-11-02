public class removele {
    public static int removeElements(int []arr, int val){
        int k = 0;
        for(int i = 0; i< arr.length;i++){
            if(arr[i]!=val) {
                arr[k] = arr[i];
                k++;
            }

        }
        return k;
    }

    public static void main(String[] args) {
        int[]a = {5,6,7,8,9,10};
        for(int x:a){
            System.out.print(x);
        }
        System.out.println();
        int y = removeElements(a,7);
        for(int x:a){
            System.out.print(x+" ");
        }
    }
}
