import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class InitBean {

    @PostConstruct
    private void Init() {
        System.out.println("**It works!**");
    }
}
