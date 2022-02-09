package multiplicandoarray;

/**
 *
 * @author LucasEPO
 */
public class main {

    public static void main(String[] args) throws DifferentArraySize {
        int[] array1 = {10, 5, 98, 452};
        int[] array2 = {548, 213, 10};
        int[] array3 = {5, 21, 12};
        int[] array4 = {50, 60, 70};
        int[] array5 = {60, 70};
        int[] array6 = {1, 2, 3};
        
        int[] resultArray = new int[4];
        
        //multiplicacao array 1 * array 1
        try {
            
            for(int i=0; i<array1.length; i++){
                resultArray[i] = array1[i] * array1[i];
            }
            System.out.print("[10, 5, 98, 452] * [10, 5, 98, 452] = [");
            imprimirVetor(resultArray, 4);
        } catch (ArrayIndexOutOfBoundsException e){
            throw new DifferentArraySize();
        }
        
        //multiplicacao array 2 * array 3
        try {
            
            for(int i=0; i<array2.length; i++){
                resultArray[i] = array2[i] * array3[i];
            }
            
            System.out.print("[548, 213, 10] * [5, 21, 12] = [");
            imprimirVetor(resultArray, 3);
            
        } catch (ArrayIndexOutOfBoundsException e){
            throw new DifferentArraySize();
        }
        
        //multiplicacao array 4 * array 3
        try {
            
            for(int i=0; i<array4.length; i++){
                resultArray[i] = array4[i] * array3[i];
            }
            
            System.out.print("[50, 60, 70] * [5, 21, 12] = [");
            imprimirVetor(resultArray, 3);
        } catch (ArrayIndexOutOfBoundsException e){
            throw new DifferentArraySize();
        }
        
        //multiplicacao array 5 * array 6
        try {
            
            for(int i=0; i<array6.length; i++){
                resultArray[i] = array5[i] * array6[i];
            }
            System.out.print("[60, 70] * [1, 2, 3] = [");
            imprimirVetor(resultArray, 2);
        } catch (ArrayIndexOutOfBoundsException e){
            throw new DifferentArraySize();
        }
    }
    
    public static void imprimirVetor(int[] array, int tamanho){
        for(int i=0; i<tamanho; i++){
            System.out.print(array[i]);
            if(i+1 < tamanho){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
