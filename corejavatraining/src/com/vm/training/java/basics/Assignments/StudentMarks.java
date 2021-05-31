package com.vm.training.java.basics.Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		//Student st=sc.nextLine();
		Student san = new Student("Santosh",94);
		Student sri = new Student("Sri",87);
		Student kumar = new Student("kumar",92);
		Student krishna= new Student("krishna",95);
	           
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(san);
		list.add(sri);
		list.add(kumar);
		list.add(krishna);
		Student topStudent = null;
        int highestMark  = 0;
        for (int i = 0; i <list.size(); i++)
        { if (list.get(i).getMarks() >highestMark) {
           topStudent = list.get(i);
           highestMark  =list.get(i).getMarks();
        }
    }
        System.out.println("Marks : " + topStudent.getMarks());
        float avgNo = findAverage(list);

        //6
        for (int i = 0; i <list.size(); i++) {
            if (list.get(i).getMarks() < avgNo) 
            { System.out.println(list.get(i).getName() + " got " + list.get(i).getMarks() + " ---> Below Average ");
            }
            else {
                System.out.println(list.get(i).getName() + " got " +list.get(i).getMarks() + " ---> Above Average ");
            }
        }
    }
        
        
  	}

}
