//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // AOP is aspect oriented programming
        // Aspect-> for example transaction management, security, login etc, the class where you keep all
        // your cross cutting concerns
        // Join Point-> when you want it to happen
        // Point cut

        // Before Advice -> public class LoggingAspect{
//
//        private static final logger LOGGER=LoggerFactory.getLogger(loggingAspect.class);
//
//         return type,class name, method name, args
//        @Before("execution(*,*,*,(..))")
//                public void logMethodcalled {
//         LOGGER.info("mrthod called")
//        }
//        }

        // before Advice, after Advice , around advice

//        Spring AOP (Aspect-Oriented Programming) is a feature of Spring that lets you separate common
//        functionality from your main business logic. For example, things like logging, security,
//        transaction management, performance monitoring, and exception handling are needed across many
//        methods, but you don't want to write the same code inside every method. With AOP, you define
//    this common logic in an Aspect, and Spring automatically executes it at specific points called Join
//    Points (such as before or after a method runs). The rules that decide where the aspect should be applied
//        are called Pointcuts, and the actual code that runs is called Advice
//        (@Before, @After, @Around, etc.). In simple terms, AOP allows you to add common behavior
//        to multiple methods without modifying those methods themselves.
//
//        A Join Point in Spring AOP is a specific point during the execution of your program where an
//        aspect can be applied. In Spring AOP, a join point is typically a method execution. For example,
//        if you have addUser(), deleteUser(), and updateUser() methods, each method's execution is a join
//        point. You can then use a Pointcut to select which of these join points should have extra behavior,
//                such as logging or security checks. For example, a pointcut can say “apply this logging code
//        before every method in the service layer”, causing the same aspect to run before addUser(),
//                deleteUser(), and updateUser() without changing those methods.

//        Method execution = Join Point
//        Which methods to choose = Pointcut
//        Extra code to run = Advice

    }
}