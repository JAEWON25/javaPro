package days23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Ex01_02 {

    public static void main(String[] args) {
    	String fileName = ".\\src\\days23\\1차_조편성.txt";
    	String line = null;
    	
    	//Set X -> 동명이인이 있을 수 도 있다. 중복 x
    	//List O -> AL(읽기전용), V, LL(삽입/삭제 용이), S, QUEUE -> ArrayList 컬렉션 클래스 적합
    	ArrayList<String> team1 = new ArrayList<>(); //요소의 타입은 String이다 (이름 넣을거니까)
    	ArrayList<String> team2 = new ArrayList<>();
    	ArrayList<String> team3 = new ArrayList<>();
    	ArrayList<String> team4 = new ArrayList<>();
    	
    	//위에 team1 ~ team4 담을 하나의 5강의장 파일을 만들거다.
    	//순서는 유지필요 / 중복은 상관없다(다 다르니까)
    	ArrayList<ArrayList<String>> class5 = new ArrayList<>();
    	//나중에 출력 함수 넘길때 team1~team4까지 넘기는게 너무 힘들어서 하나의 보따리로 싼다.
    	ArrayList<String> team = null;
    	String[] lineArr = null;
    	try (FileReader reader = new FileReader(fileName);
    			BufferedReader br = new BufferedReader(reader);){ //bufferedreader -> 한 라인씩 읽어올때 사용
			
    		while((line = br.readLine()) != null) {
    			
    			team = new ArrayList<String>(); //팀이 늘더라도 상관없다.
    			
    			lineArr = line.split("[/:]"); // : 이거 또는 / 이걸로 split하겠다.
//    			lineArr[0]; //1조 2조 3조 등을 나타낸다.
    			
    			
    			for (int i = 0; i < lineArr.length; i++) {
					team.add(lineArr[i]);
				} //for i
    			
    			class5.add(team);
	
    		}//while
    		
    		//각 팀원 출력 형식 출력
    		//dispTeam(team1, team2, team3, team4);
    		dispClass(class5);
    		
		} catch (Exception e) {
			System.out.println(e.toString());
		}
        
    }//main

	private static void dispClass(ArrayList<ArrayList<String>> class5) {
		
		Iterator<ArrayList<String>>  ir = class5.iterator();
		int no = 1; //team 번호
		while(ir.hasNext()) {
			System.out.printf("[%d조]\n", no++);
			ArrayList<String> team = ir.next();
			Iterator<String> ir2 = team.iterator();
			char seq = 'A';
			while (ir2.hasNext()) {
				String name = (String) ir2.next();
				System.out.printf(" %c. %s\n", seq++, name);
				
			}
		}
		System.out.println();
		
	}
}//class