public class RECURSIVO {
    public static int factorial(int n){
        if (n<=0) return 1;                     //RECURSION DIRECTA
        else return n*factorial(n-1);
    }

    public static void main(String[] a) {
        int v=5;
        System.out.println(factorial(v));
    }
}

///Recursividad: Es una alternativa diferente para implementar estrucuturas de repeticion
///ES AQUEL QUE ESTA DEFINIDO  -N! = 1
