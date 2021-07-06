import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] Array = new int[10];
        int i = 0;
        while (i < Array.length) {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhập số");
            Array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < Array.length; j++) {
            System.out.print(Array[j] + "\t");
        }
        int max = Array[0];
        int index =1;
        for(int j=0;j<Array.length;j++){
            if(Array[j]>max){
                max = Array[j];
                index =j+1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
