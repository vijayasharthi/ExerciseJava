public class Duplicate1{
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,3,4,5,5,6};
        System.out.println("The duplicate elements are");
        for(int i = 0;i < array.length;i++){
            for(int j = i+1; j < array.length;j++){
                if(array[i] == array[j]){    
                    System.out.println(array[i]);
                }
            }
        }
    }
}