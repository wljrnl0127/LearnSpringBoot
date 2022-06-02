package com.cfz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration // 声明为配置类
@EnableSwagger2 // 启用Swagger2, 启用Swagger2后, 在项目中需要配置swagger-ui.html
@EnableWebMvc // 启用SpringMVC, 否则Swagger2会报错, 因为Swagger2需要依赖SpringMVC
public class SwaggerConfig {

    /**
     * 配置Swagger2的Docket
     */
    @Bean
    public Docket docket(Environment environment) {
        // 设置要显示swagger的环境
        Profiles of = Profiles.of("dev", "test");
        // 判断当前是否处于该环境
        // 通过 enable() 接收此参数判断是否要显示
        boolean b = environment.acceptsProfiles(of);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("黄建妹")
                //配置是否启用Swagger，如果是false，在浏览器将无法访问
                .enable(b)
                // 通过.select()方法，去配置扫描接口,RequestHandlerSelectors配置如何扫描接口
                .select()
                //basePackage("com.cfz.controller")表示扫描com.cfz.controller包下的所有接口
                .apis(RequestHandlerSelectors.basePackage("com.cfz.controller"))
                .build();
    }

    @Bean
    public Docket docket1(Environment environment) {
        return new Docket(DocumentationType.SWAGGER_2).groupName("陈凤振");
    }

    @Bean
    public Docket docket2(Environment environment) {
        return new Docket(DocumentationType.SWAGGER_2).groupName("HJM");
    }

    @Bean
    public Docket docket3(Environment environment) {
        return new Docket(DocumentationType.SWAGGER_2).groupName("CFZ");
    }

    /**
     * 配置Swagger2的基本信息
     */
    private ApiInfo apiInfo() {

        // 文档的基本信息
        Contact contact = new Contact("cfz", "http://www.cfz.com", "fz-c@qq.com");

        return new ApiInfo(
                "HJM の Swagger2 API 文档",
                "LOVE CFZ",
                "1.0",
                "http://www.cfz.com",
                "CFZ",
                "cfz",
                "http://www.cfz.com"
        );
    }

}
