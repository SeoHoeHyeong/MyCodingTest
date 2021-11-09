class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int [3];
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
            if(n == 5){
                n = 0;
            }
            if(m == 8){
                m = 0;
            }
            if(l == 10){
                l = 0;
            }
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
        
        for(int i = 0; i < 3;i++){
            if(max < count[i]){
                max = count[i];
            }
        }
        int test = 0;
        for(int i = 0; i < count.length;i++){
            if(count[i] == max){
                answer[test] = i;
                test++;
            }
        }
        
        return answer;
    }
}
