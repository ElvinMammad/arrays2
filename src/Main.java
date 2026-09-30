import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //1) Verilmiş array-i artan (ascending) və azalan (descending) qaydada sırala
//        int[] arr={5,4,7,2,8,0,6,3,1};
//        for (int i = 0; i < arr.length-1; i++) {
//

//            for (int j = 0; j < arr.length-1-i; j++) {
//
//                if (arr[j]>arr[j+1]){

//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j+1]=temp;
//
//                }
//            }
//        }
//        for (int element:arr){
//            System.out.println(element);
//
//
//        }

//        int[] arr={5,4,7,2,8,0,6,3,1};
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length-1-i; j++) {
//                if (arr[j]<arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//
//        }
//        for (int element:arr){
//            System.out.println(element);
//        }

        //2) İki indeksdəki elementlərin yerini dəyişilməsi(Swap):
        //İstifadəçidən 2 indeks al və həmin indekslərdəki qiymətlərin yerini dəyiş.
//
//        int[] arr={5,4,7,2,8,0,6,3,1};
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("birinci indexi daxil edin (0-8 aralığında) :");
//        int input1 = scanner.nextInt();
//        System.out.print("ikinci indexi daxil edin(0-8 aralığında) :");
//        int input2 = scanner.nextInt();
//        int temp = arr[input1];
//        arr[input1]=arr[input2];
//        arr[input2]=temp;
//        for (int element:arr) {
//            System.out.print(element);
//        }


        //3) Array-dən yalnız cüt ədədləri saxla, tək ədədləri sil.
//        int[] numbers = {5, 4, 7, 2, 8, 0, 6, 3, 1,-2};
//
//        int count = 0;
//        for (int elem = 0; elem < numbers.length; elem++) {
//
//            if (numbers[elem] != 0 && numbers[elem] % 2 == 0) {
//
//                count++;
//
//            }
//
//        }
//        int[] evenNumbers = new int[count];
//        int secondIndex = 0;
//        for (int elem = 0; elem < numbers.length; elem++) {
//
//            if (numbers[elem] != 0 && numbers[elem] % 2 == 0) {
//
//
//                evenNumbers[secondIndex] = numbers[elem];
//                secondIndex++;
//
//            }
//
//        }
//        for (int i:evenNumbers){
//            System.out.println(i);
//        }

        //4) Array-də təkrarlanan elementləri tap və sil, hər element yalnız bir dəfə qalsın.
//        int[] numbers = {5, 4, 4, 4, 2, 8, 0, 0, 3, 1, -2};
//
//        int uniqueCount = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            boolean isDuplicate = false;
//            for (int j = 0; j < i; j++) {
//                if (numbers[i] == numbers[j]) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if (!isDuplicate) {
//                uniqueCount++;
//            }
//        }
//
//        int[] unique = new int[uniqueCount];
//        int index = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            boolean isDuplicate = false;
//            for (int j = 0; j < i; j++) {
//                if (numbers[i] == numbers[j]) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if (!isDuplicate) {
//                unique[index++] = numbers[i];
//            }
//        }

        //5) Array içindəki ikinci ən böyük və ikinci ən kiçik ədədi tap.

        int[] arr = {5, 4, 4, 4, 2, 8, 0, 0, 3, 1, -2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int secondMin = arr[1];
        int secondMax = arr[arr.length - 2];

    }
}