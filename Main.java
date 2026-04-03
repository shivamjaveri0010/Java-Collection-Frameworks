/*----------Day-18----------*/
/*-----Collection Frameworks-----*/
/*----------Exercise of ArrayList----------*/

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;

// public class Main {
//     public static void main(String[] args) {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         ArrayList<String> fruitList = new ArrayList<>();
        
//         try {
//             System.out.println("Enter five fruits: ");

//             for (int i=0; i<5; i++) {
//                 String fruit = br.readLine();
//                 fruitList.add(fruit);
//             }

//             System.out.println("Fruits are: ");

//             for (String fruit : fruitList) {
//                 System.out.println(fruit);
//             }

//             System.out.println("Total number of fruits: " + fruitList.size());
            
//             if (!fruitList.isEmpty()) {
//                 System.out.println("First Fruit: " + fruitList.get(0));
//                 System.out.println("Last Fruit: " + fruitList.get((fruitList.size() -1)));
//             }

//         } catch (IOException e) {
//             System.out.println("Error while reading input!");
//             e.printStackTrace();
//         }
//     }
// }

/*----------Exercise----------*/

// import java.util.ArrayList;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<Integer> nums = new ArrayList<>();
//         nums.add(1);
//         nums.add(2);
//         nums.add(3);
//         nums.add(4);
//         nums.add(5);

//         System.out.print("Original List: " + nums);

//         nums.remove(Integer.valueOf(2));

//         int index = nums.indexOf(4);

//         if (index != -1) {
//             nums.set(index, 7);
//         }

//         System.out.println();
//         System.out.println("Updated List: " + nums);
//     }
// }

// /*----------Exercise----------*/
// import java.util.ArrayList;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<Integer> nums = new ArrayList<>();
//         Scanner sc= new Scanner(System.in);

//         System.out.print("Enter 10 numbers: ");

//         for (int i=1; i<=10; i++) {
//             int n = sc.nextInt();
//             nums.add(n);
//         }

//         int sum = 0;
//         System.out.println("Even numbers are: ");

//         for (int num : nums) {
            
//             //print even numbers
//             if (num % 2 == 0) {
//                 System.out.println(num);
//             }

//             //sum of all numbers
//             sum += num;
//         }
//         System.out.println("Sum of all numbers: " + sum);

//         sc.close();
//     }
// }

