package level1;//휴대폰 번호가 주어졌을 때
//뒤에서 4자리를 제외한 나머지는
//* 바꿔서 리턴

public class PhoneHideJava {

    public String solution(String phone_number) {
        String answer = "";

        for (int i = 0; i < phone_number.length()-4; i++) {
            answer += "*";
        }
//        System.out.println(phone_number.substring(phone_number.length()-4,phone_number.length()));
        answer = answer + phone_number.substring(phone_number.length()-4,phone_number.length());
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        PhoneHideJava phoneHideJava = new PhoneHideJava();
//        phoneHideJava.solution("01033334444");
        phoneHideJava.solution("027778888");


    }
}
