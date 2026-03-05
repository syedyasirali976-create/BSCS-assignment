                   //ARRAYS HAMESHA ZERO SE STSRT HOTE HAI:


//1--FIRST STEP OF ARRAYS:
/*public class into_Array {
public static void main(String[] args){
   
int [] marks =new int[3];   //---3 is size
marks[0]=2;
marks[1]=4;
marks[2]=6;
  System.out.println(marks[0]);
  System.out.println(marks[1]);
  System.out.println(marks[2]);
  }    
} */

//2--SECOND STEP OF ARRAY:
/*public class into_Array {
public static void main(String[] args){
int [] marks = {88,78,38};  //----88,78,38 are elements
System.out.println(marks[0]);
System.out.println(marks[1]);
System.out.println(marks[2]);
System.out.println(marks.length); //yeh karne se hame length/size malom hajate hai
}}*/

//3--Use of FOR LOOP in Array:
      //for loop use karte hai take hame bar bar print na karna pare elements ko
   /*public class into_Array {
public static void main(String[] args){
int [] marks = {88,78,38};
for(int i = 0 ; i<marks.length; i=i+1)
  System.out.println(marks[i]);
}}
*/
//USE OF FOR LOOP IN ARRAY TO PRINT THE VALUE IN REVERSE ORDER:
  /*public class into_Array {
public static void main(String[] args){
int [] marks = {88,78,38};
System.out.println(marks.length);
for(int i = marks.length -1 ; i>=0 ; i--)
  System.out.println(marks[i]);
}}*/

//4--ARRAYS MAI INPUT jab hame size givin hoo or element givin na hoo :Difficult
/*import java.util.Scanner;
public class into_Array {
public static void main(String[] args){
Scanner key = new Scanner(System.in);
    int [] marks = new int[3];
for(int i = 0; i<3; i=i+1){  //for loop ham use karte hai take hamene bar bar sout likhna na pare.
     marks[i] = key.nextInt();
   System.out.println(marks[i]);
}
}}*/


//5--Array mai input jab size or element dono given na hoo:
/*import java.util.Scanner;
public class into_Array {
public static void main(String[] args){
Scanner key = new Scanner(System.in);
  int size = key.nextInt();
  int [] marks = new int[size];
  for(int y = 0 ; y<size ; y=y+1){
    marks[y] = key.nextInt();
   System.out.println(marks[y]);
  }

   System.out.println("task complete");
  }}*/



/*public class into_Array {
public static void main(String[] args){
String[]students = {"yasir","Amir","ashar"};
        System.out.println(students.length);
        for(int i=0; i<students.length; i++)
        System.out.println(students[i]);
    }}*/


