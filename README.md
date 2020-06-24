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
       
        <img src="https://user-images.githubusercontent.com/63589323/85503158-f6dcd680-b623-11ea-8296-06e2ad48e978.png"  width="700" height="370">
        
