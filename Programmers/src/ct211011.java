// 1단계
// 신규 아이디 추천

class Solution211011 {
    public String solution(String new_id) {
        String answer = "";
        // 1단계
        new_id = new_id.toLowerCase(); // 모두 소문자로 변환
        // 2단계
        new_id = new_id.replaceAll("[^0-9a-z-_.]", ""); // 0~9, a~z, -, _, .가 아닌 문자들은 ""로 변환(지우기)
        // 3단계
        new_id = new_id.replaceAll("[.]{2,}", "."); // .이 2개 이상 반복되면 . 1개로 변환
        // 4단계
        new_id = new_id.replaceAll("^[.]|[.]$", ""); // .이 맨 앞이나 맨 뒤에 오면 ""으로 변환(지우기)
        // 5단계
        if(new_id.equals("")) new_id += "a"; // new_id가 비어있으면 "a"추가
        // 6단계
        if(new_id.length() >= 16){ // 문자열 길이가 16 이상이면
            new_id = new_id.substring(0, 15); // new_id를 0번쨰부터 14번째 글자까지 잘라서 new_id에 대입
            new_id = new_id.replaceAll("[.]$", ""); // .이 맨 뒤에 오면 ""으로 변환(지우기)
        }
        // 7단계 
        if(new_id.length() <= 2){ // 문자열 길이가 2 이하면
            while(new_id.length() < 3){ // 문자열 길이가 3보다 작지 않을 때까지 반복
                new_id += new_id.charAt(new_id.length() - 1); // new_id에 new_id의 마지막 글자 추가
            }
        }
        answer = new_id;
        return answer;
    }
}
public class ct211011 {

}
