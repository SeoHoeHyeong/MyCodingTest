//ArrayList를 사용하기 위해 사용
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        //길이를 유동적으로 하기 위해 ArrayList 선언
        ArrayList<Integer> answerInput = new ArrayList<>(); 
        int [] num1 = {1,2,3,4,5};
        int [] num2 = {2,1,2,3,2,4,2,5};
        int [] num3 = {3,3,1,1,2,2,4,4,5,5};
        int n = 0;
        int m = 0;
        int  l = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for(int i = 0; i < answers.length; i++){
            //한 바퀴 돌면 초기화
            if(n == 5){
                n = 0;
            }
            if(m == 8){
                m = 0;
            }
            if(l == 10){
                l = 0;
            }
            //답이 같다면 카운트 증가
            if(num1[n] == answers[i]){
                count1++;
            }
            if(num2[m] == answers[i]){
                count2++;
            }
            if(num3[l] == answers[i]){
                count3++;
            }
              n++;
              m++;
              l++;
        }
        int max = 0;
        int [] count = {count1,count2,count3}; 
        //가장 최댓값 구하기
        for(int i = 0; i < 3;i++){
            if(max < count[i]){
                max = count[i];
            }
        }
        int test = 0;
        //max와 같다면 인덱스+1을 넣어줌
        for(int i = 0; i < count.length;i++){
            if(count[i] == max){
                answerInput.add(i+1);
                test++;
            }
        }
        int[] answer = new int [answerInput.size()];
        //값 출력
        for(int i = 0; i < answer.length;i++){
            answer[i] = answerInput.get(i);
        }
        return answer;
    }
}
