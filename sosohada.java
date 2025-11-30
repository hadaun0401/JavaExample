public class sosohada {
    // 기본 자료형
    // int, long, double, float, char, boolean, byte, short : 실제 데이트 값을 저장
    // 참조 자료형
    // class, interface, array, enum : 데이터가 저장된 메모리 주소 값을 저장

    // 주석
    /* 주석 */

    // 상수
    final int hour = 24;
    // hour =25; // 에러

    // 형 변환
    // int -> long -> float -> double : 묵시적 형 변환
    // double -> float -> long -> int : 명시적 형 변환

    // 대입 연산자
    int a = 10;
    a += 1; // a = a + 1;

    // 비교 연산자
    // ==, !=, >, <, >=, <=

    // 논리 연산자
    // &&(AND), ||(OR), !(NOT)

    // 삼항 연산자
    // 조건식 ? 참일 때 값 : 거짓일 때 값
    int b = (a > 5) ? 100 : 200;

    // 문자열
    String str = "Hello, World!";

    str.length(); // 문자열 길이
    str.toUpperCase(); // 대문자 변환
    str.toLowerCase(); // 소문자 변환
    str.contains("World"); // 포함 여부 확인
    str.indexOf("o"); // 문자 위치 반환
    str.lastIndexOf("o"); // 마지막 문자 위치 반환
    str.substring(0, 5); // 부분 문자열 추출
    str.replace("World", "Java"); // 문자열 치환
    str.trim(); // 양쪽 공백 제거
    str.isEmpty(); // 빈 문자열 여부 확인
    str.startsWith("Hello"); // 시작 문자열 확인
    str.endsWith("!"); // 끝 문자열 확인
    str.replace(" ", "_"); // 공백을 언더스코어로 치환
    str.concat(" Let's code."); // 문자열 연결
    

    // 문자열 비교

}
