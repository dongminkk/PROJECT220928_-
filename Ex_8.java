import java.util.Scanner;

class Phone {
   private String name;
   private String tel;
   Phone(String name, String tel) {
      this.name = name;
      this.tel = tel;
   }
   public String getName() {
      return name;
   }
   public String getTel() {
      return tel;
   }
}

public class Ex_8 { 
   
   public static void main(String[] args) {
	   
      Scanner scanner = new Scanner(System.in);
      Phone phone[];
      int i;
      
      System.out.print("인원수 >> ");
      int num = scanner.nextInt();
      phone = new Phone[num];
      
      for(i=0; i<phone.length; i++) {
         System.out.print("이름과 전화번호>>");
         String name = scanner.next();
         String tel = scanner.next();
         phone[i] = new Phone(name, tel);
      }
      
      System.out.println("저장되었습니다...");
      while(true) {
         System.out.print("검색할 이름 >>");
         String n = scanner.next();
         for(i=0; i<num; i++) {
            if(n.equals(phone[i].getName())) {
               System.out.println(n+"의 번호는 "+phone[i].getTel()+" 입니다.");
               i--;
               break;
            }
         }
         
         if(n.equals("그만")) 
        	 break;
         if (i == num) System.out.println(n+"이 없습니다.");
      }
      scanner.close();
   }
}