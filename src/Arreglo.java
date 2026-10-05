import java.util.Arrays;
import java.util.Scanner;

public class Arreglo {

    int num = 20;
    int MAX = num - 1;
    int N = -1;
    char[] A = new char[num];
    Scanner sc = new Scanner(System.in);

    public Arreglo() {
        iniciador_Borrar();
    }

    public void iniciador_Borrar(){
        N= -1;
    }

    public int[] buscarLinealOptimizada(char ins) {
        int ciclos = 0;
        for (int i = 0; i <= N; i++) {
            ciclos++;
            int comp = compararLetras(A[i], ins);
            if (comp == 0) {
                return new int[]{
                        i, ciclos
                };
            }
            if (comp > 0) {
                return new int[]{-1, ciclos};
            }
        }
        return new int[]{-1, ciclos};
    }

    public int compararLetras(char c1, char c2) {
        char min1 = Character.toLowerCase(c1);
        char min2 = Character.toLowerCase(c2);

        if (min1 != min2) {
            return Character.compare(min1, min2);
        }
        return Character.compare(c1, c2);
    }

    public void Insertar (char ins) {
        if (N == MAX ) {
            System.out.println("Arreglo lleno");
            return;
        }
            int i = N;

            while( i >= 0 && compararLetras(A[i], ins) > 0) {
                A[i + 1] = A[i];
                i--;
            }
        A[i + 1] = ins;
        N++;
        System.out.println("Se insertó: " + ins + (i + 1));
    }

    public int[] BuscarBinario(char ins){
        int start = 0;
        int end = N;
        int si = 0;

        while (start <= end){
            si++;
            int p = (start + end) / 2;
            int comp = compararLetras(ins, A[p]);

            if (comp == 0) {
                return new int[]{p, si};
            }

            if (comp > 0) {
                start = p + 1;
            } else {
                end = p - 1;
            }
        }

        return new int[]{-1, si};
    }


    public void Mostrar () {
        if (N == -1) {
            System.out.println("Arreglo vacio");
            return;
        }
            for (int i = 0; i <= N; i++ ) {
                System.out.println("Posicion [" + i + "]: " + A[i]);
            }
    }

    public int Eliminar(char ins){
        int [] res = BuscarBinario(ins);
        int pos  = res[0];
        if (pos == -1){
            return -1;
        }
        for (int i = pos; i <N ;i++ ){
           A[i] = A[i+1];
        }
        N --;
        return pos;
    }

    public int Modificar(char ins){
        int posElim = Eliminar(ins);
                if (posElim != -1){
                    System.out.println("Escribe el nuevo valor:  ");
                    char temp = sc.nextLine().charAt(0);
                    Insertar(temp);
                    return posElim;
                }
        return -1;
    }
}
