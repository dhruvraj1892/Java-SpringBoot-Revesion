//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        The filter chain is a sequence of filters that handle
//        requests before they reach the controller. These filters process
//        authentication, authorization, and other security-related tasks.

//        Spring security used multiple filters like DefaultSecurityFilterChain,
//                WebAsyncManagerIntegrationFilter, SecurityContextHolderFilter,
//                LogoutFilter, etc.

//        HTTP REQUEST
//                      │
//                      ▼
//              ┌───────────────┐
//              │    Tomcat     │
//              │    Server     │
//              └───────┬───────┘
//                      │
//                      ▼
//          ┌──────────────────────┐
//          │  Servlet Container   │
//          │                      │
//          │  ┌────────────────┐  │
//          │  │     Filter     │  │
//          │  └───────┬────────┘  │
//          │          │           │
//          │          ▼           │
//          │  ┌────────────────┐  │
//          │  │ Dispatcher     │  │
//          │  │ Servlet        │  │
//          │  └───────┬────────┘  │
//          │          │           │
//          └──────────┼───────────┘
//                     │
//                     ▼
//        Spring MVC
//                     │
//                     ▼
//              ┌─────────────┐
//              │  Controller  │
//              └──────┬──────┘
//                     │
//                     ▼
//               ┌───────────┐
//               │  Service  │
//               └─────┬─────┘
//                     │
//                     ▼
//               ┌───────────┐
//               │ Repository│
//               └─────┬─────┘
//                     │
//                     ▼
//        DATABASE

//        CSRF (Cross-Site Request Forgery) is a web security vulnerability that tricks a
//        user into performing an unwanted action on a website they are currently
//        authenticated to.
//        Imagine you're logged into your bank's website. A malicious website might contain
//        a hidden form that attempts to transfer money from your account to the attacker's
//        account. If you visit the malicious website, the form is submitted in the
//        background, and your bank might unknowingly process the transaction.

        // prevention
//        Same-Site Cookies: Browsers now support the "SameSite" attribute for
//        cookies, which restricts cookies to only be sent with requests from the same
//        origin as the one that set the cookie.

//● CSRF Tokens: Implementing CSRF tokens adds a unique, unpredictable
//        value to every request. The server checks this token to ensure the request
//        originated from the expected source.

//● HTTP Strict Transport Security (HSTS): Enforces HTTPS connections,
// making it harder for attackers to intercept and modify requests.
//
//        Browser
//   │
//   │ POST /transfer
//   │
//   ▼
//        Tomcat
//   │
//   ▼
//        Security Filters
//   │
//   ├── CSRF check
//   │       │
//   │       ├── Token valid → continue ✅
//   │       │
//   │       └── Token missing/invalid → reject ❌
//   │
//   ▼
//        DispatcherServlet
//   │
//   ▼
//        Controller

//        By default, when you add Spring Security and use its normal form login, Spring Security
//        uses session-based authentication, not JWT.

        // another way of prevention is not to allow other websites to use your session id
//        http
//                .csrf(customizer -> customizer.disable())
//                .authorizeHttpRequests(request -> request.anyRequest().authenticated())
//                .httpBasic(Customizer.withDefaults())
//                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

//        return http.build();

//        UserDetailsService is the bridge between your database and Spring Security. When a user tries to
//        log in, Spring Security needs to find that user's stored username, password hash, and
//    authorities/roles. UserDetailsService provides that information by loading the user, usually from your
//        UserRepository.
    }
}
