import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author Pandy
 * @Date 2021/8/7 12:17
 */
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("provider.xml");
        classPathXmlApplicationContext.start();
        System.in.read();
    }
}
