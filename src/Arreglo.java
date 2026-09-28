import java.util.Arrays;

public class Arreglo {

    char C;
    int num = 20;
    int MAX = num - 1;
    int N = -1;
    Arrays A ;


    public Arreglo() {
    }

    public void iniciador_Borrar(){
        N= -1;
    }

    public void Insertar (char ins) {
        if (N == MAX - 1) {
            System.out.println("Arreglo lleno");
        } else {
            int i = N;

            while( i > 0 && A[i] ) {
                A[i + 1] = ins;
                N = N + 1;
            }

        }
    }

    public int BuscarBinario(char ins){
        int start = 0;
        int end = N;
        int si = 0;
        while (start <= end){
            int p = (start + end)/2;
            if (A[p] == ins){
                return p;
            }
            if (ins > A[p]){
                start = p + 1;
            } else {
                end = p - 1;
            }
            si ++;
        }
        return -1;
    }


    public int Buscar(char ins){
        for (int i =0; i == N ; i++){
            if (ins = A[i]){
                return i;
            }
            if (A[i] > v){
                return -1;
            }
            i ++;
        }
        return -1;
    }
}
