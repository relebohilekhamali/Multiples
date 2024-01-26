import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Student myStudent = new Student();
        myStudent.firstName = "Lebo";
        myStudent.lastName = "Khamali";
        myStudent.major = "Computer";
        myStudent.age = 21;
        myStudent.gpa = 2.3;
        myStudent.onProbation = false;

        System.out.println("FirstName is : " + myStudent.firstName + "LastName is:" + myStudent.lastName);

         */

        String q1 = "What colour are apples?\n" + "(a)red/green\n(b)Orange\n(c)Magenta\n";
        String q2 = "What colour are banana?\n" + "(a)red/green\n(b)Yellow\n(c)Blue\n";

          Question[] questions = {new Question(q1,"a"),
                                 new Question(q2,"b")};
          takeTest(questions);
        }
          public static void takeTest(Question[] questions){
          int score = 0;
          Scanner keyboardInput = new Scanner(System.in);
          for(int i = 0; i< questions.length; i++){
              System.out.println(questions[i].prompt);
              String answer = keyboardInput.nextLine();

              if(answer.equals(questions[i].answer)){
                 score++;
              }
          }

              System.out.println("You got " + score + "/" + questions.length);
          }
        }


