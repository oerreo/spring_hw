package likelionhw.Jpasession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpasessionApplication {



	public static void main(String[] args) {
		Oreo check_oreo = new Oreo();
		check_oreo.setData("String");
		String data = check_oreo.getData();
		System.out.println("hello = "+data);
		SpringApplication.run(JpasessionApplication.class, args);
	}

}
