# 스프링 MVC CORS

## SOP과 CORS
- SOP(Single-Origin Policy)
- CORS(Cross-Origin Resource Sharing)

### Origin?
- URI 스키마 (http, https)
- hostname (sombrero.com, localhost)
- 포트 (8080, 18080)

<br/>
origin이 다른 곳에서 요청을 보낼 경우,<br/>
기본적으로는 헤더 정보에 'Access-Control-Allow-Origin'이 없기 때문에 <br/>
아래와 같이 에러 메시지가 뜨고 차단된다.<br/>
<br/>

* 예제)<br/>
CORS Server -> http://localhost:8080/hello<br/>
CORS Client -> http://localhost:18080<br/>
<br/>

<pre>
Access to XMLHttpRequest at 'http://localhost:8080/hello'
from origin 'http://localhost:18080' has been blocked by CORS policy:
    No 'Access-Control-Allow-Origin' header is present on the requested resource.
</pre>
<br/>

### 스프링 MVC @CrossOrigin
https://docs.spring.io/spring/docs/5.0.7.RELEASE/spring-framework-reference/web.html#mvc-cors <br/>
@Controller나 @RequestMapping에 추가하거나<br/>
WebMvcConfigurer 사용해서 글로벌 설정.<br/>
<br/>

아래처럼 서버쪽에 @CrossOrigin를 설정한다.<br/>
<pre>
@CrossOrigin(origins = "http://localhost:18080")
@GetMapping("/hello")
public String hello() {
    return "hello";
}
</pre>
<br/>