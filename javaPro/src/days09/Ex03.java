package days09;

import java.util.Random;

import days08.Ex07;

public class Ex03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String card = "7655-8988-9234-5677";
        String[] cardNum = card.split("-"); 
        
       // int index = Ex07.getRandomInteger(0, 3);
        //rnd.nextBoolean();// 알아서 참 거짓 랜덤값 돌린다.
        //rnd.nextInt(); // 인티져 범위만큼 랜덤값.
        Random rnd = new Random();
        //rnd.nextInt(4); //0~3까지의 정수가 돌아감. nextInt(bound)
        //int n = (int) (Math.random() * 4);  
        //cardNum[n] = "****";  
        //int index = new Random().nextInt(4);
        int index = rnd.nextInt(4); // 0, 1, 2, 3 랜덤
        
        cardNum[index] = "****";
        		
        //System.out.printf("%s-%s-%s-%s",  cardNum[0], cardNum[1], cardNum[2], cardNum[3]);
        
        String result = String.join("-", cardNum); //붙이는거
        System.out.println(result);

      
    }//main
}//class
