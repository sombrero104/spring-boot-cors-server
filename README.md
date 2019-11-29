# 스프링 MVC CORS

## SOP과 CORS
- SOP(Single-Origin Policy)
- CORS(Cross-Origin Resource Sharing)

### Origin?
- URI 스키마 (http, https)
- hostname (sombrero.com, localhost)
- 포트 (8080, 18080)

### 스프링 MVC @CrossOrigin
https://docs.spring.io/spring/docs/5.0.7.RELEASE/spring-framework-reference/web.html#mvc-cors <br/>
@Controller나 @RequestMapping에 추가하거나<br/>
WebMvcConfigurer 사용해서 글로벌 설정.<br/>
<br/>

