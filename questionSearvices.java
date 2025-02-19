import java.util.Scanner;

public class questionSearvices {
    question Question[] = new question[5];//array of refarance
    String select[]=new String[5];//for store score
    public questionSearvices() {
        Question[0] = new question(1,"Which of the following option leads to the portability and security of Java?","1.Bytecode is executed by JVM","2.The applet makes the Java code secure and portable","3.Use of exception handling","4.Dynamic binding between objects","1");
        Question[1] = new question(2,"_____ is used to find and fix bugs in the Java programs.","1.JVM","2.JRE","3.JDK","4.JDB","4");
        Question[2] = new question(3,"size of int","1)5","2)2","3)6","4)4","4");
        Question[3] = new question(4,"What does the expression float a = 35 / 0 return?","1.0","2.Not a Number","3.Infinity","4.Run time exception","3");
        Question[4] = new question(5,"Evaluate the following Java expression, if x=3, y=5, and z=10:\r\n" + //
                        "\r\n" + //
                        "++z + y - y + z + x++","1.24","2.23","3.20","4.25","4");
       

    }

    public void playQuiz() {
        for(int i=0;i<Question.length;i++){
        System.out.println("Question no:"+Question[i].getId());
        System.out.println(Question[i].getQuestion());
        System.out.println(Question[i].getOpt1());
        System.out.println(Question[i].getOpt2());
        System.out.println(Question[i].getOpt3());
        System.out.println(Question[i].getOpt4());
        @SuppressWarnings("resource")
        Scanner obj=new Scanner(System.in);
        System.out.print("ans:");
        select[i]=obj.nextLine();

        
        }
    }
    public void score(){
        int score=0;
        for(int i=0;i<Question.length;i++){
            question que=Question[i];
            String ActualAns=que.getAns();
            String UserAns=select[i];
            if(ActualAns.equals(UserAns)){
                score++;
            }
            
        }
        System.out.println("your score is:"+score);

    }
}
