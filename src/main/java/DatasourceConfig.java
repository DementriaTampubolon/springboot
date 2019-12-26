
import javax.activation.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 

/**
 *
 * @author DELL
 */
@Configuration
public class DatasourceConfig {
    @Bean
    public DataSource datasource() {
        return (DataSource) DataSourceBuilder.create()
          .driverClassName("com.mysql.cj.jdbc.Driver")
          .url("jdbc:mysql://localhost:3306/hr_system")
          .username("root")
          .password("")
          .build(); 
    }
}
