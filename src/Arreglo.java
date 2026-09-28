import java.util.Arrays;

public class Arreglo {

    char C;
    int num = 20;
    int MAX = num - 1;
    int N = -1;
    Arrays A;

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

}
