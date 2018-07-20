# SUtils
日常工作代码库
#完成对基础框架的搭配
hq
文档地址
https://docs.spring.io/spring-boot/docs/2.0.3.RELEASE/reference/htmlsingle/#_advanced_topics

@EnableAutoConfiguration：启用Spring Boot的自动配置机制
@ComponentScan：@Component在应用程序所在的程序包上启用扫描（请参阅最佳做法）
@Configuration：允许在上下文中注册额外的bean或导入其他配置类
您可以自由地使用任何标准的Spring Framework技术来定义bean及其注入的依赖项。为简单起见，我们经常发现使用 @ComponentScan（找到你的bean）和使用@Autowired（做构造函数注入）效果很好。
的@SpringBootApplication注释是相当于使用@Configuration， @EnableAutoConfiguration以及@ComponentScan与他们的默认属性，如显示在下面的例子：

package com.example.myapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //与@Configuration相同@EnableAutoConfiguration @ComponentScan 
public  class Application {

	public  static  void main（String [] args）{
		SpringApplication.run（Application .class，args）;
	}

}




如果按照上面的建议构建代码（在根包中定位应用程序类），则可以添加@ComponentScan不带任何参数的代码。您的所有应用程序组件（的@Component，@Service，@Repository，@Controller等）自动注册为春豆。
