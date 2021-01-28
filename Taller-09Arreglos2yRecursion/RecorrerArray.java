public class RecorrerArray {
    public static void recorrerArray(int[] array, int indice){
        System.out.println(array[indice]);
        if(indice == array.length-1)return ;
        recorrerArray(array, indice+1);
    }
}
