public class SumaRecursiva {
    public static int sumaRecursiva(int n){
        if(n==1)return 1;
        return n+sumaRecursiva(n-1);
    }
}