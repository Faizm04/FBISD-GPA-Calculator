//FBISD UNWEIGHTED GPA SCALE IS USED


import java.util.Scanner;
class GPAcalc{
   public static void main(String[] args){
   Scanner key = new Scanner(System.in);
   System.out.print("Type in the number of classes here :: ");
   int numof = key.nextInt();
      double[] arr = new double[numof];
      double gpa = 0.0;
      for(int i =0;i<arr.length;i++){
     System.out.print("Type in grade for class :: ");
   arr[i] = key.nextDouble();
      //for testing pourposes//System.out.println(arr[i]);
      if(arr[i]>=90){
      arr[i]=4.0;}
      else if((arr[i]<=89)&&(arr[i]>=80)){
      arr[i]=3.0;}
      else if((arr[i]<=79)&&(arr[i]>=70)){
      arr[i]=2.0;}
      else{arr[i]=0.0;}
       gpa = arr[i]+gpa;
      }
      gpa = gpa/arr.length;
      System.out.printf("%.2f",gpa);
      System.out.println();
}
}
   