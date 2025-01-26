public class USAFlag2 {
    public static void main(String[]args){
         int row = 6;
         int column = 11;

         for (int i = 0; i < row; i++){
             for (int j = 0; j < column; j++){
                 if (i < 3) {
                     if (j < 4) {
                         System.out.print("*");
                     } else {
                         System.out.print("=");
                     }
                 }else {
                     System.out.print("=");
                 }
             }
             System.out.println();
         }


    }
}
