public class MinimoBuscado {
    public static int minimoBuscado(int[][] a){
        int minimo = a[0][0];
        for(int[] b: a){
            for(int c: b){
                minimo = Math.min(minimo, c);
            }
        }
        return minimo;
    }
}
