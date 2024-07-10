import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; //Esto es el input
public class app {
    //tareita: imrpimir los n terminos de la secuencia de Fibonacci
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //define la entrada :)
        System.out.print("Ingresa la cantidad de terminos de la suceción: ");
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for(int i = 1; i <= n; i++){
            list.add(list.get(list.size() - 2) + list.get(list.size() - 1));
        }
        System.out.println(list);
        scanner.close(); // Cierra el input
    }
}
