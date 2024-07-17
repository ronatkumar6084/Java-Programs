class Student{
    int mark;
    String name;
    int rollno;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.mark=45;
        s1.name="Deff";
        s1.rollno=22;

        Student s2 = new Student();
        s2.name="Mnbv";
        s2.mark=34;
        s2.rollno=12;

        Student s3 = new Student();
        s3.rollno=45;
        s3.mark=89;
        s3.name="qwer";

       Student student[] = new Student[3];
       student[0]=s1;
       student[1]=s2;
       student[2]=s3;
       
    //    for(int i=0;i<student.length;i++)
	// 	{
	// 		System.out.println(student[i].name+":"+student[i].mark+":"+student[i].rollno);
	// 	}
    for(Student stud: student)
		{
			System.out.println(stud.name +":"+stud.mark+":"+stud.rollno);
		}

    }
}
