package priv.edward.graduationdesign;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.ControllerAdvice;

@SpringBootApplication
@ControllerAdvice
@EnableAsync
//@MapperScan(value = {"priv.edward.graduationdesign.dao"})
//@ComponentScan(value = {"priv.edward.graduationdesign.*"})
public class GraduationdesignApplication {

	@Bean
	public HttpMessageConverters fastJsonConfigure(){
		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		//日期格式化
		fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");
		converter.setFastJsonConfig(fastJsonConfig);
		return new HttpMessageConverters(converter);
	}

	public static void main(String[] args) {
		SpringApplication.run(GraduationdesignApplication.class, args);
	}

}
