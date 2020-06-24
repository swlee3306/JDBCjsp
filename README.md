# JDBCjsp
JDBCjsp복습
## 실행화면 및 이론문제
  
  ### 9. 동적 페이지의 필요성<br>
    (1) 동적인 페이지를 만들려고 할 때, HTML을 이용하면 또는 서블릿을 이용하면 어려운 점은 무엇 인가?<br>
        답 : 정적인 페이지라서 동적인 작업을 할 수 없기 때문에 동적인 페이지를 만드는데 한계가 있어서 어려움이 있다.
        
    (1) myjspexample1.jsp를 생성 후 아래 링크의 계산기 프로그램 소스의 style과 body 부분을 복사하여 myjspexample1.jsp에 붙여넣고 해당 페이지 실행했을 때,<br>
        https://github.com/Yeunwoong/ServletProject/blob/master/WebContent/Calculator3.html<br>
        사용자로부터 num1과 num2를 URL get 방식의 "쿼리문으로" 입력받으면 계산기 결과창에 num1과 num2의 합으로 보여질 수 있도록 myjspexample1.jsp를 수정해보자.<br> 
        단 이 때 태그를 스크립트릿 태그와 표현식 태그만 사용하도록 한다.<br>
        (계산기 결과는 <td class="output" colspan="4">0</td> 이 부분을 의미한다.)
        
   ![9-1번 문제](https://user-images.githubusercontent.com/63589323/85503158-f6dcd680-b623-11ea-8296-06e2ad48e978.png) 
   
     (2)myjspexample1.jsp를 복사해서 myjspexample2.jsp를 생성 후 해당 페이지 실행했을 때,
        선언문 태그를 이용해서 두 정수를 곱하는 multiple이라는 이름의 메소드를 정의하고,
        사용자로부터 num1과 num2를 "쿼리문으로" 입력받으면 계산기 결과창에 두 정수의 muliple 메서드 결과값이 출력되도록 
        myjspexample2.jsp를 수정해보자.
        
   ![9-2번 문제](https://user-images.githubusercontent.com/63589323/85503165-f8a69a00-b623-11ea-820a-aa485554544e.png)
     
     (3)myjspexample3.jsp를 생성 후 아래 링크의 계산기 프로그램 소스의 style과 body 부분을 복사하여 myjspexample3.jsp에 붙여넣고,
        https://github.com/Yeunwoong/ServletProject/blob/master/WebContent/Calculator3.html
        myforward 클래스 파일을 생성해서 실행했을 때, 사용자로부터 "쿼리문으로" num1과 num2를 입력받으면, 
        그 값들을 request에 실어서 myjspexample3.jsp로 "forward"시키도록 myforward 클래스를 수정하고,
        해당 정보를 myjspexample3.jsp가 수신하여 num1과 num2를 더한 값이 계산기 결과창에 보여질 수 있도록 수정해보자. 
        단 이 때 태그를 스크립트릿 태그와 표현식 태그만 사용하도록 한다.
        (계산기 결과는 <td class="output" colspan="4">0</td> 이 부분을 의미한다.)
   
   ![9-3번 문제(1)](https://user-images.githubusercontent.com/63589323/85503167-f9d7c700-b623-11ea-8a05-ec3e02cbe306.png)
   ![9-3번문제(2)](https://user-images.githubusercontent.com/63589323/85503168-fa705d80-b623-11ea-852b-775234828539.png)
   
  ### 13. 표준액션태그
      (1) 강의자료 20페이지에 있는 actionex.jsp와 forwardex.jsp, includeex.jsp를 생성하고,
          actionex.jsp에서 표준액션태그를 이용해서 forward를 시행했을 때의 결과 화면과 include를 시행했을 때의 결과 화면을 캡처하자.
  
  ![13-forward](https://user-images.githubusercontent.com/63589323/85503171-fb08f400-b623-11ea-9465-8cd5f34da3c1.png)
  ![13-include](https://user-images.githubusercontent.com/63589323/85503172-fb08f400-b623-11ea-8eb8-6a88e0c78ac6.png)
  
   ### 14. EL
      (1) 위에서 생성한 myjspexample1.jsp를 복사해서 myjspexample4.jsp를 생성하여
          기본 태그 (스크립트릿 태그와 표현식 태그) 없이, EL로만 구현해서 사용자로부터 num1과 num2를 "쿼리문으로" 입력받으면 
          계산기 결과창에 num1과 num2의 합으로 보여질 수 있도록 myjspexample4.jsp를 수정해보자.
  
  ![14번 문제(1)](https://user-images.githubusercontent.com/63589323/85503173-fba18a80-b623-11ea-9abb-45c1b48903c5.png)
      
      (2) 위에서 생성한 myjspexample3.jsp를 복사해서 myjspexample5.jsp를 만들고, myforward 클래스 파일을 수정해서 실행했을 때, 
          myjspexample5.jsp로 "forward"시키도록 myforward 클래스를 수정하고,
          myforward 실행했을 때 사용자로부터 "쿼리문으로" num1과 num2를 입력받으면, 그 값들을 request에 실어서 
          해당 정보를 myjspexample5.jsp가 수신하여 num1과 num2를 더한 값이 계산기 결과창에 보여질 수 있도록 수정해보자.
          단 이 때 기본 태그 (스크립트릿 태그와 표현식 태그)없이 EL로만 구현해보자.
          
  ![14번 문제(2)](https://user-images.githubusercontent.com/63589323/85503176-fc3a2100-b623-11ea-89e2-7438ac5cc268.png)
  
   ### 15. 커스텀 태그
        (1) 강의자료를 그대로 참고해서, 클래스 파일 기반 커스텀태그를 개발할 것인데, (이미 강의시간에 하신 분들은 현재 코드 그대로 이용해도 무방)
            MyTagHandler 클래스 파일을 생성하여 멤버변수 5개를 받고, quick sort 알고리즘을 붙여넣고 (강의자료 28페이지)
            해당 클래스 파일을 선언해주는 TLD 파일을 생성해서 name을 myquick으로 설정해주고, MyTagTest.jsp를 생성해서 본인이 생성한 
            myquick 태그를 호출하여 결과를 확인하자.
            
   ![15번 문제](https://user-images.githubusercontent.com/63589323/85503177-fcd2b780-b623-11ea-8349-e169e6d515cd.png)
   
   ### 16. JSTL
       (1) arithmatic.jsp를 생성하여 실행했을 때, 사용자로부터 "쿼리문으로" start, end, step을 입력받으면 
           forEach를 이용해서 start값부터 end까지 step 간격으로 숫자를 출력해주는 코드를 작성해보자.
   
   ![16번 문제](https://user-images.githubusercontent.com/63589323/85503178-fcd2b780-b623-11ea-8c1f-8eebcdd6a01d.png)
        
           
      
         
   
   
    
