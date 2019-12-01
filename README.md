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
기본적으로 아래처럼 'Access-Control-Allow-Origin'이 헤더 정보에 없기 때문에 차단된다.<br/>

<pre>
Access to XMLHttpRequest at 'http://localhost:8080/hello'
from origin 'http://localhost:18080' has been blocked by CORS policy:
    No 'Access-Control-Allow-Origin' header is present on the requested resource.
</pre>

### 스프링 MVC @CrossOrigin
https://docs.spring.io/spring/docs/5.0.7.RELEASE/spring-framework-reference/web.html#mvc-cors <br/>
@Controller나 @RequestMapping에 추가하거나<br/>
WebMvcConfigurer 사용해서 글로벌 설정.<br/>
<br/>

