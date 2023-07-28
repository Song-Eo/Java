import java.util.Scanner;

public class testStack {
    public static void main(String[] args){
        LinkedStack stack = new LinkedStack();
        Scanner sc = new Scanner(System.in);

        while(true){
            int select = 0;
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("| 1. 값 넣기, 2. 값 빼기, 3. 값 체크, 4. 스택 크기, 5. 전체 출력, 6. 나가기, 7. 비우기 |");
            System.out.println("----------------------------------------------------------------------------------------");

            try{
                select = sc.nextInt();
                if(select == 6){
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                switch (select){
                    case 1:
                        System.out.println("넣을 값을 입력하세요");
                        stack.push(sc.next());
                        System.out.println("입력 완료");
                        break;
                    case 2:
                        System.out.println(stack.pop() + " 제거완료");
                        break;
                    case 3:
                        System.out.println(stack.peek());
                        break;
                    case 4:
                        System.out.println(stack.size());
                        break;
                    case 5:
                        stack.display();
                        break;
                    case 7:
                        stack.clear();
                        break;
                    default:
                        System.out.println("잘못된 선택입니다.");
                }
                
            }catch(Exception e){
                System.out.println("숫자가 아닙니다.");
                continue;
            }
        }
        sc.close();
    }
    
}
