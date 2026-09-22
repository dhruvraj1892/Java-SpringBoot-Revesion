//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//   ApplicationContext context=ClassPathXmlApplicationContext("spring.xml");
        // Loads the spring.xml and creates the spring ioc container
//   Alien obj=(Alien) context.getBean("alien");
//
//        	@ConstructorProperties({"age","lap"})
//	public Alien(int age,Laptop lap) {
//            System.out.println("Para Constructor Called");
//            this.age = age;
//            this.lap = lap;
//
// constructor injection
// An inner bean is simply a Spring bean that is defined inside another bean's configuration,
// instead of having its own separate bean ID.

//  Bro, lazy initialization means:
//
//  Spring does NOT create the bean when the application starts. It creates the bean only when
//  you actually ask for it.


//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Spring finds the Desktop object from the configuration/component scanning and gives it to dt.
//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();
//
//        @Component and @Bean both tell Spring to create and manage an object, but they are used
//    differently: @Component is placed directly on a class, and Spring automatically detects it through
//        component scanning, so you typically use it for your own classes like @Component class Alien {}.
//        @Bean is placed on a method inside a @Configuration class, and the object returned by that method
//        becomes a Spring bean, so it's useful when you need more control over object creation or when you're
//        configuring a class you didn't write, such as a third-party library class.
//
//        import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//        @Component
//        @Scope("prototype")
//        public class Alien {
//
//            public void code() {
//                System.out.println("Coding...");
//            }
//    }

//         Setter Injection
//
//        public class Alien {
//            private Laptop laptop;
//
//            public void setLaptop(Laptop laptop) {
//                this.laptop = laptop;
//            }
//        }
//        Spring XML:
//<bean id="laptop" class="com.telusko.Laptop"/>
//
//                <bean id="alien" class="com.telusko.Alien">
//                <property name="laptop" ref="laptop"/>
//                </bean>

//        1. Constructor Injection
//        public class Alien {
//            private Laptop laptop;
//
//            public Alien(Laptop laptop) {
//                this.laptop = laptop;
//            }
//        }
//        Spring XML:
//<bean id="laptop" class="com.telusko.Laptop"/>
//
//                <bean id="alien" class="com.telusko.Alien">
//                <constructor-arg ref="laptop"/>
//                </bean>

//
//        @Autowired
//        public void setJdbc(JdbcTemplate jdbc) {
//            this.jdbc = jdbc;
//        }
        // what autowired is doing is find a jdbc template and pass it to this method

// jdbc is used for connecting and interacting with the database
    }
}