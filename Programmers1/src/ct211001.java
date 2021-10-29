// 1단계
// 이상한 문자 만들기

class Solution211001 {
    public String solution(String s) {
        String[] arrS = s.split(""); // s를 한글자씩 배열에 저장 | s.split("") : ""을 기준으로 s를 자름
        String answer = "";
        int count = 0;
        for(int i = 0; i < arrS.length; i++){
            if(arrS[i].equals(" ")){ // 배열의 i번째 방의 글자가 " "와 같으면
                count = 0; // count를 0으로 초기화
            }else{
                if(count % 2 == 0){ // count를 2로 나눈 나머지가 0이면
                    arrS[i] = arrS[i].toUpperCase(); // arrS[i]를 대문자로 바꾼 뒤 arrS[i]에 저장 | arrS[i].toUpperCase() : arrS[i]를 대문자로 변환
                    count++; // count 1 증가
                }else{ // count를 2로 나눈 나머지가 0이 아니면
                    arrS[i] = arrS[i].toLowerCase(); // arrS[i]를 소문자로 바꾼 뒤 arrS[i]에 저장 | arrS[i].toLowerrCase() : arrS[i]를 소문자로 변환
                    count++; // count 1 증가
                }
            }
            answer += arrS[i]; // answer에 arrS[i] 덧붙이기
        }
        return answer;
    }
}