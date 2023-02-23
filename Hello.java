class Student{

    int rollNo;
    String name;
    int marks;
}


class Hello{

    public static void main(String args[])
    {
        
       Student s1= new Student();
       s1.rollNo =1;
       s1.name="navin";
       s1.marks= 88;

       Student s2= new Student();
       s2.rollNo =1;
       s2.name="navin";
       s2.marks= 88;

       Student student[] = new Student[2];
       student[0]= s1;
       student[1]=s2;

       //for (int i=0; i<student.length; i++){

       // System.out.println(student[i].name +" " + student[i].marks);
       //}

       for (Student stud : student)
       System.out.println(stud.name +" " + stud.marks);
        
    }
}