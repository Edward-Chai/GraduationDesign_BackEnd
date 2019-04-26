package priv.edward.graduationdesign.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
//自动扫描你的Dao包里面的Dao接口，我在这里使用的是mybatis操作数据库
@MapperScan("priv.edward.graduationdesign.dao")
public class DruidConfig {

    //非常简单的配置druid数据库连接池
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid(){
        return  new DruidDataSource();
    }

}
