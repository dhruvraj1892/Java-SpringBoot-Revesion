//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Maven is a Java build automation and dependency management tool that manages project dependencies, compilation, testing,
//        packaging, and the build lifecycle through a pom.xml file
//        Maven lifecycle is a predefined sequence of phases that Maven executes to build, test, package, install, and deploy a project.
        // maven project has a pom.xml file

//        Maven is a build automation and dependency management tool for Java projects. It reads the pom.xml file,
//        manages project dependencies, compiles the source code, runs tests, packages the application into a JAR/WAR, and can install or
//        deploy the package. Maven follows predefined lifecycles such as clean and

//        Maven archetypes are templates used to generate the basic structure of a Maven project automatically. Instead of manually creating folders
//        such as src/main/java, src/test/java, and the pom.xml, we can use an archetype to generate them.
//
//        Maven integrates easily with IDEs like IntelliJ IDEA and Eclipse. When you open or import a Maven project, the IDE detects
//        the pom.xml file and automatically reads the dependencies, downloads any missing libraries, and adds them to the project's classpath.
//        You can also run Maven lifecycle commands such as clean, compile, test, and package directly from the IDE. If you modify pom.xml`, the IDE can
//        reload the Maven project and update the dependencies automatically.

        //  "The default dependency scope in Maven is compile, which makes the dependency available during compilation, testing, and runtime."

       // JDBC (Java Database Connectivity) is a Java API used to connect a Java application with a database and perform operations like:CRUD
        // it acts a bridge between a java application and databse

//        String url = "jdbc:postgresql://localhost:5432/demo";
//        String uname = "postgres";
//        String pass = "6031";
//        // String sql = "insert into student values (5, 'John', 48)";
//        // String sql = "update student set sname = 'Max' where sid = 5";
//        String sql = "delete from student where sid = 5";
//        // Class.forName("org.postgresql.Driver");
//        Connection con = DriverManager.getConnection(url, uname, pass);
//        System.out.println("Connection established");
//        Statement st = con.createStatement();
//        st.execute(sql);
//        con.close();

      //  A JDBC driver enables Java application to communicate with a particular database.

     // PreparedStatement improves performance by allowing the database to prepare the SQL statement once and reuse it with different parameter values,
        // reducing repeated parsing and compilation overhead. It also provides protection against SQL injection.
//        String url = "jdbc:postgresql://localhost:5432/demo";
//        String username = "postgres";
//        String password = "6031";
//
//        String sql = "SELECT * FROM student";
//
//        try (Connection con = DriverManager.getConnection(url, username, password);
//             PreparedStatement ps = con.prepareStatement(sql);
//             ResultSet rs = ps.executeQuery()) {
//
//            while (rs.next()) {
//                int id = rs.getInt("sid");
//                String name = rs.getString("sname");
//                int marks = rs.getInt("marks");
//
//                System.out.println(id + " " + name + " " + marks);
//            }
//        }

        //"I use try-with-resources to manage JDBC resources such as Connection, PreparedStatement, and ResultSet. It automatically closes these
        // resources after use, even if an exception occurs, preventing resource leaks."

//        Hibernate is a Java ORM (Object-Relational Mapping) framework that helps your Java application interact with a database without having to
//        write lots of SQL and JDBC code manually. It maps Java classes to database tables, objects to rows, and fields to columns. For example, instead
//        of writing an SQL INSERT query and setting parameters using JDBC, you can simply give a Student object to Hibernate, and Hibernate generates
//        and executes the required SQL behind the scenes. So basically, Hibernate acts as a bridge between Java objects and database tables, making
//        database operations like insert, update, delete, and fetch much easier.

//        Student s1 = new Student();
//
//
//        s1.setRollNo(106);
//        s1.setsName("Avni");
//        s1.setsAge(21);
//
//
//        SessionFactory sf = new Configuration()
//                .configure()
//                .addAnnotatedClass(com.telusko.Student.class)
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        session.persist(s1);
//
//
//        transaction.commit();
//        session.close();
//        sf.close();
//        System.out.println(s1);

        // Lazy Loading: Related entities are loaded only when accessed
        //Aspect             LazyLoading               EagerLoading
        //When                Loaded On-demand          Immediately
        //Performance         Faster initial load       Slower initial load
        //Memory Usage        Lower                     Higher

//        HQL (Hibernate Query Language) is an object-orientated query language similar to SQL but
//        operates on Hibernate entity objects rather than database tables
//
//        L1 cache is session-level, enabled by default, and available only within a particular Session. L2 cache is
//        SessionFactory-level, can be shared across sessions, and needs to be explicitly configured.

//        if you fetch the same entity by the same identifier again, Hibernate normally gets it from the L1 (first-level) cache instead of hitting
//        the database again.

//        IoC is a design principle in which the control of object creation and
//        management is transferred from the application code to a framework or container.
//        This allows developers to focus on the core business logic while the framework
//        takes care of the lifecycle and interactions of the objects.

//        Dependency Injection (DI) is a design pattern where an object’s required dependencies are provided to it from outside instead of
//        the object creating them itself.

//        Autowiring is a feature in the Spring Framework that allows the Spring container
//        to automatically inject dependencies into a bean.

//        ApplicationContext context= SpringApplication.run(SpringBootFirstApplication.class, args);
//        Think of ApplicationContext as a container that stores and manages Spring objects (beans).

//        Alien obj;
//        obj = context.getBean(Alien.class);
        // get the object from spring

//        Alien obj = context.getBean(Alien.class);
//        Alien obj1 = context.getBean(Alien.class);
//
//        by default, both references point to same object because the scope is singelton by default

        // component annotation tells that the class is managed springboot

//        @SpringBootApplication internally includes
//
//        @SpringBootConfiguration
//        @EnableAutoConfiguration
//        @ComponentScan

//        @SpringBootConfiguration → Tells Spring Boot "this is the main configuration class of my application." It is basically a specialized
//        form of @Configuration.

//        @EnableAutoConfiguration → Tells Spring Boot to automatically configure the application based on the dependencies present. For example,
//        if you add the web starter, it configures the web-related components.

//        @ComponentScan → Tells Spring to scan packages for classes annotated with @Component, @Service, @Repository, @Controller, etc. and register
//        them as Spring beans.

//        Spring Boot sees that you're building a web application and automatically configures things like the embedded Tomcat server, Spring MVC,
//        and related beans, so you don't have to configure them manually.

//         A Servlet is a Java class that runs on a web server and handles HTTP requests and responses
//         Tomcat receives it and passes it to DispatcherServlet, which then figures out which controller method should handle /students.
    }

}