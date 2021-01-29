package jp.co.tlzs.department.four.demo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("jp.co.tlzs.department.four.demo01.mapper")
//@MapperScan("com.kfit.*.mapper")
public class Demo01Application {
	public static void main(String[] args) {
		System.out.println("test");
		SpringApplication.run(Demo01Application.class, args);
	}

}
