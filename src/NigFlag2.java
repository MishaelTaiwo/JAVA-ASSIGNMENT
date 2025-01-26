public class NigFlag2 {
    public static void main(String[]args){
        int rows = 4;
        int columns = 12;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                if (j < 4 || j >= 8){
                    System.out.print("*");
                }else {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
}
