public class SumaMatrizDiagonal {
    public static int sumaDiagonal(int[][] arr){
        int sum = 0;
        for(int i = 0; i <arr.length; i++)sum += arr[i][i];
        return sum;
    }
}
