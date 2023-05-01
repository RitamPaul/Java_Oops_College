import java.util.Scanner;

class ClassMain{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of array items = ");
        int n = scan.nextInt();
        scan.nextLine();
        int arr[] = new int[n];
        System.out.println("Enter the array items :- ");
        for(int i=0; i<n; ++i){
            System.out.print("["+(i+1)+"] = ");
            arr[i] = scan.nextInt();
            scan.nextLine();
        }

        for(int i=0; i<n-1; ++i){
            for(int j=0; j<(n-1-i); ++j){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }

        System.out.println("Now your array in increasing order :-");
        for(int i=0; i<n; ++i){
            System.out.print(arr[i]+" ");
        }

        scan.close();
    }
}