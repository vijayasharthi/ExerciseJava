public class LinearString {
    public static void main(String[] args) {
        String a="Vinayagar is my favourite GOD";
         boolean k=str("Vinayagar is my favourite GOD",'D');
         System.out.println(k);
    }
    static boolean str(String a,char bb){
        for(char c:a.toCharArray()){
           if(c==bb){
            return true;
           }
        }
        return false;
    }
}
