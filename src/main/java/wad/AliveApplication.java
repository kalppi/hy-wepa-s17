package wad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("wad.repository")
public class AliveApplication {

    public static void main(String[] args) {
        SpringApplication.run(AliveApplication.class, args);
    }

    public static String githubUrl() {
        return "https://github.com/kalppi/hy-wepa-s17";
    }

    public static String travisUrl() {
        return "https://travis-ci.org/kalppi/hy-wepa-s17";
    }

    public static String herokuUrl() {
        return "https://hy-wepa-s17.herokuapp.com/";
    }
}
