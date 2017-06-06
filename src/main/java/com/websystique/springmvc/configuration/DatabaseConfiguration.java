package com.websystique.springmvc.configuration;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@MapperScan({"com.websystique.springmvc.repositories"})
public class DatabaseConfiguration extends WebMvcConfigurerAdapter {
	
 	//@Autowired
	//DataSource dataSource;

 	@Bean
	public DataSource getDataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://110.74.194.125/LYMENG");
		dataSource.setPassword("123456");
		dataSource.setUsername("postgres");
		return dataSource;
	}

	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean(){
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		sessionFactoryBean.setDataSource(getDataSource());
		return sessionFactoryBean;
	}
	
	@Bean
	public DataSourceTransactionManager dataSourceTransactionManager(){
		return new DataSourceTransactionManager(getDataSource());
	}




	 /*@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**")
				.allowedOrigins("*")
				.allowedMethods("PUT", "DELETE", "GET", "POST", "PATCH");
		}*/
	
}
