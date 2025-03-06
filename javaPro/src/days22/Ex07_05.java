package days22;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex07_05 {
    static Queue<String> q = new LinkedList<>();
    static final int MAX_SIZE = 5; //명령어 최대 5개만 저장

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        // 사용자 입력 받는 반복문
        while (true) { //무한루프
            System.out.print(">> ");
            try (Scanner s = new Scanner(System.in)) { 
                String input = s.nextLine().trim(); //엔터치기전까지 멈춰있는다.

                // 입력이 빈 문자열이면 continue
                if ("".equals(input)) continue;

                // 종료 조건
                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);  // 프로그램 종료
                    //다른 프로세스에게 0 정수값을 전달.. (그냥 종료한다고 알리는거다)(0일때 -1일때 다른 프로세스한테 의미가있다)
                }
                // help 명령어 처리
                else if (input.equalsIgnoreCase("help")) {
                    System.out.println("help - 도움말을 출력합니다.");
                    System.out.println("q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println("history - 마지막 " + MAX_SIZE + "개의 입력을 보여줍니다.");
                }
                // history 명령어 처리
                else if (input.equalsIgnoreCase("history")) { //이 부분 수정 필요
                    save(input);  // 입력값 저장

                    // 큐의 내용 출력
                    System.out.println("History (최대 " + MAX_SIZE + "개):");
                    int i = 0;
                    for (String item : q) {
                        System.out.println(++i + ". " + item);
                    }
                }
                // 그 외의 명령어는 그냥 저장
                else {
                    save(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("오류가 발생했습니다.");
            }
        }
    }

    // 입력받은 내용을 큐에 저장하고, 최대 크기를 넘으면 가장 오래된 항목을 삭제
    public static void save(String input) {
        // 입력값이 비어있지 않으면 큐에 저장
        if (!"".equals(input)) {
            q.offer(input);
        }

        // 큐의 크기가 MAX_SIZE를 초과하면 가장 오래된 항목을 제거
        if (q.size() > MAX_SIZE) {
            q.poll();  // 큐의 가장 앞에 있는 항목을 제거
        }
    }
}
