//Write a program to sort a list of students on the basis of the marks. 

package Assignment2;

import java.util.Scanner;

class student {
    public String name;
    public double marks;

}

public class seven {
  public static void main(String[] args) {
    int no;

    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter limit :- ");
    no = sc.nextInt();

    student[] s1 = new student[no];
    student temp = new student();
    for(int i=0;i<no;i++)
    {
        s1[i] = new student();  
        System.out.print("\nEnter your name :- ");
        s1[i].name = sc.next();
        System.out.print("\nEnter Mark :- ");
        s1[i].marks = sc.nextDouble();
    }


    for(int i=0;i< no-1;i++)
    {
        for(int j=i+1;j< no;j++)
        {
            if(s1[i].marks>s1[j].marks)
            {
                temp = s1[i];
                s1[i]= s1[j];
                s1[j] = temp;
            }
        }
    }
    System.out.print("\nShorted Details :-  ");

    for(int i=0;i<no;i++)
    {
        System.out.print("\n"+(i+1)+"Name = "+s1[i].name);
        System.out.print(" ,  Marks = "+s1[i].marks);
    }
  
    }
}
