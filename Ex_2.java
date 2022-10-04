import java.util.Scanner;

class GradeSubject {
   private int math;
   private int science;
   private int english;
   GradeSubject(int m, int s, int e) {
      this.math = m;
      this.science = s;
      this.english = e;
   }
   public int average() {
      return (math + science + english) / 3;
   }
}

public class Ex_2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
      int math = scanner.nextInt();
      int science = scanner.nextInt();
      int english = scanner.nextInt();
      
      GradeSubject me = new GradeSubject(math, science, english);
      System.out.println("평균은 "+me.average());
      
      scanner.close();
   }

}