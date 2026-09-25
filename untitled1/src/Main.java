//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//                Model → Represents the data and business logic of the application.
//                View → Represents the UI/presentation shown to the user.
//                Controller → Handles user requests, interacts with the Model, and decides what response/View
//                to return.
//        @ModelAttribute User user
//
//        This tells Spring:
//
//        "Take the submitted form fields and put them into this User object."
//
//        @PostMapping("/users")
//        public String createUser(@ModelAttribute User user) {
//            // user.getName()
//            // user.getEmail()
//        }

//        @Controller
//        public class HelloController {
//
//            @GetMapping("/hello")
//            public String hello() {
//                return "welcome";
//            }
//        }
// configuration of a view resolver it resolves the controller texts to html pages
//        @Configuration
//        @EnableWebMvc
//        public class WebConfig implements WebMvcConfigurer {
//
//            @Bean
//            public InternalResourceViewResolver viewResolver() {
//                InternalResourceViewResolver resolver =
//                        new InternalResourceViewResolver();
//
//                resolver.setPrefix("/WEB-INF/views/");
//                resolver.setSuffix(".jsp");
//
//                return resolver;
//            }
       // }
//
//        Prefix → tells Spring where the view files are located.
//
///WEB-INF/views/
//
//                Suffix → tells Spring what file extension to add.jsp

//        @PathVariable gets a value directly from the URL path, like /users/25, while @RequestParam gets
//        a value from the query parameter, like /users?id=25. In short: PathVariable → /users/{id},
//                RequestParam → /users?id=value.
//
//        REST (Representational State Transfer) is an architectural style for building APIs where
//        resources are identified by URLs and manipulated using standard HTTP methods like GET, POST, PUT,
//                and DELETE. It is significant because it provides a simple, stateless, and standardized way
//        for clients (like React) and servers (like Spring Boot) to communicate.

//        REST is stateless because the server does not store information about the client's previous request.
//        Each request must contain everything the server needs to process it.
//
//        Object-relational mapping (ORM) is a programming technique used to map
//        objects in object-oriented programming languages to relational databases.
//● It allows developers to work with databases using objects rather than writing
//        SQL queries directly.

        // JPA stands for java persistance API
//        public interface UserRepository extends JpaRepository<User, Long> {

        }

    }
}