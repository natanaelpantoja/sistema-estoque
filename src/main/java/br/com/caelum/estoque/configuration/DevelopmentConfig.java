package br.com.caelum.estoque.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevelopmentConfig {
	 
//    @Bean
//    public DataSource dataSource() {
//        return new EmbeddedDatabaseBuilder()
//            .setType(EmbeddedDatabaseType.HSQL)
//            .addScript("classpath:com/bank/config/sql/schema.sql")
//            .addScript("classpath:com/bank/config/sql/test-data.sql")
//            .build();
//    }
	

}
