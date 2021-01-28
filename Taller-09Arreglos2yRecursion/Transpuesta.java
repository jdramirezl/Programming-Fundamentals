public class Transpuesta {
    public static void transpuesta(int[][] arr){
        int[][] nueva = new int[arr[0].length][arr.length];
        for(int i = 0; i<arr[0].length; i++){
            for(int j = 0; j <arr.length; j++){
                System.out.print(arr[j][i]); 
            }
            System.out.println();
        }
    }
}
