public class ConjuntosExternosInternos {
    public static boolean verificador(int[] externo, int[] interno){
        for(int x : interno){
            boolean encontrado = false;
            for(int a : externo){
                if(a < x){
                    continue;
                }
                else if( a == x){
                    encontrado = true;
                    break; 
                }
                else{
                    return false;
                }
            }
            if(!encontrado) return false;
        }

        return true;
    }
}
