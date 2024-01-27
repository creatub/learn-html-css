package my.com; //패키지 선언문 => 이 패키지에 file을 묶겠다 => compile 된 file이 이 패키지에 저장됨?

import java.lang.System; // import문, 대문자로 쓴 애들은 모두 Class다.
import java.util.Date; // import 패키지명.클래스명;

//클래스 선언문: 클래스명과 파일명은 동일하게
public class Hello{
  public static void main(String[] args){
    System.out.println("Hello World"); // java는 문자열을 ""로 해야한다.
    System.out.print("안녕? ");
    System.out.print("자바야?");
    System.out.println("The End");

    Date today = new Date(); // 객체 생성자
    System.out.println(today);
  }//main()-----------------------------
}//class----------------------------------------------
// 함수를 java, 객체지향언어에서는 method라고 한다.

// 이 코드는 원시코드라고 한다. 
// Hello.java(원시코드)
// [1] 컴파일 => .class file이 나옴
// 이클립스가 없어도 DOS에서 컴파일하는 방법 :
// javac -d . Hello.java ==> my/com/Hello.class (클래스파일, 바이트코드 :JVM이 해석할 수 있는 코드)
// [2] 인터프리터로 실행: java my.com.Hello ==> 클래스 파일을 불러서 main() 메소드부터 찾아 한 줄 한 줄 해석하고 아웃풋을 낸다.

// java는 기본적으로 Unicode 형식인데 VSCODE는 windows-949로 인코딩해서 javac -encoding utf-8 -d . Hello.java 로 수정

// DOS 창에서 ls 보는법 -> dir/w