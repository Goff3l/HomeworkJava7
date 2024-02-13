import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {


        ArrayList<Integer> numbersListA = new ArrayList<>();
        numbersListA.add(7);
        numbersListA.add(4);
        numbersListA.add(5);

        ArrayList<Integer> numbersListB = new ArrayList<>();

        numbersListB.add(8);
        numbersListB.add(3);
        numbersListB.add(5);


        int largestNumber = findLargestNumber(numbersListA, numbersListB);
        System.out.println("The largest number is: " + largestNumber);
    }
    public static int findLargestNumber(ArrayList<Integer> listA, ArrayList<Integer> listB) {
        int maxNumber = Integer.MIN_VALUE;

        for (int number : listA) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        for (int number : listB) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        return maxNumber;
    }
}
