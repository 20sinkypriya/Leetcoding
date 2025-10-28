//Print the spiral order matrix as output for a given matrix of numbers. 

package array;
import java.util.*;
public class spiralarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(("Number of rows: "));
        int rows=sc.nextInt();
        System.out.println("Number of columns: ");
        int cols=sc.nextInt();
        
        
        int arr [][]= new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter the element for ("+i+","+j+"): ");
                arr[i][j]=sc.nextInt();
            }
        }
        
        int row_start=0;
        int row_end=rows-1;
        int col_start=0;
        int col_end=cols-1;


        while(row_start<=row_end && col_start<=col_end){
            for(int i=col_start;i<=col_end;i++){
                System.out.print(arr[row_start][i]+" ");
            }
            row_start++;
    
            for(int i=row_start;i<=row_end;i++){
                System.out.print(arr[i][col_end]+" ");
            }
            col_end--;
    
            for(int i = col_end;i>=col_start;i--){
                System.out.print(arr[row_end][i]+" ");
            }
            row_end--;
    
            for(int i = row_end;i>=row_start;i--){
                System.out.print(arr[i][col_start]+" ");
            }
            col_start++;
        }
    sc.close();
    }    
}
