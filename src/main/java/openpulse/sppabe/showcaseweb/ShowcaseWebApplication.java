package openpulse.sppabe.showcaseweb;

import openpulse.sppabe.showcaseweb.entities.ItemService;
import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ShowcaseWebApplication {

    public static void main(String[] args) {
        // log4j enable
        BasicConfigurator.configure();

        SpringApplication.run(ShowcaseWebApplication.class, args);

        System.out.println(sleep());
    }

    public static ItemService itemService;

    public static String sleep() {
        System.out.println("ok1");
        String i = itemService.getItems();
        return i;
    }
}
