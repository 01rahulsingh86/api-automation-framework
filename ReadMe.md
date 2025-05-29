# 🧪 API Automation Framework (Maven + TestNG + Rest Assured)

This repository is a modular, maintainable, and scalable **API Automation Framework** built using:

- Java (JDK 1.8+)
- Maven
- TestNG
- Rest Assured
- Log4j2
- Jackson (for JSON serialization/deserialization)

---

## 📁 Project Structure

com.framework.api/
├── base/ # Base classes (Abstract classes & configs)
├── config/ # Environment config classes
├── constants/ # Constants and enums
├── filters/ # Request/Response filters for logging/tracing
├── listeners/ # TestNG listeners for enhanced reporting
├── models/ # POJO model classes for serialization/deserialization
├── services/ # Service Object Model classes (encapsulate API logic)
├── tests/ # Test classes (TestNG)
├── utils/ # Utility/helper methods (random data, assertions, etc.)
├── testng.xml # TestNG suite configuration
├── log4j2.xml # Logging configuration
└── pom.xml # Project dependencies and plugins


---

## 🧱 Key Components

### 🔧 Service Object Model (SOM)
- Each API endpoint is abstracted into a `Service` class under `services/`
- Promotes code reusability, readability, and clean test separation
- Example: `LoginService`, `ProductService`

---

### 📦 Serialization & Deserialization
- `models/` package contains POJOs that map JSON requests/responses
- Uses **Jackson Databind** for conversion
- Example:

```java
LoginRequest req = new LoginRequest("username", "password");
LoginResponse res = new ObjectMapper().readValue(response.asString(), LoginResponse.class);
🪝 Filters
Located under filters/

Custom filters log every request and response (headers, URI, payload)

Can be extended for request validation or correlation IDs

🧾 Loggers
Configured via log4j2.xml

Captures:

Request/Response logs

Test execution flow

Errors and stack traces

Multiple appenders supported: console + file output

🧱 Abstract Classes
BaseTest and BaseService classes contain reusable setup methods

Enforces consistent setup for all tests (e.g., setting base URI, filters)

👂 Listeners
TestListener implements TestNG's ITestListener

Logs test start, pass, fail, and skip events

Can be extended to capture screenshots or logs for failed API tests

🚀 Test Runners
Uses Maven Surefire Plugin to run tests via testng.xml

Command to run:

bash
Copy
Edit
mvn clean test -Dsuite=testng.xml
🧪 TestNG & Assertions
Test cases are grouped in @Test classes with @BeforeClass setup

Assertions verify HTTP status codes, payload data, and headers

🧬 Model Classes
Located in models/
Represent request and response bodies
Follows JavaBeans convention (getters, setters, @JsonProperty as needed)

🏗️ Build & Run
🔧 Prerequisites
Java 1.8 or above

Maven 3.6+

🧪 Run Tests

mvn clean test -Dsuite=testng.xml
🔒 Logging Example (from log4j2.xml)
xml
<Configuration status="WARN">
  <Appenders>
    <Console name="Console" target="SYSTEM_OUT">
      <PatternLayout pattern="%d{HH:mm:ss} %-5level %logger{36} - %msg%n"/>
    </Console>
    <File name="File" fileName="logs/api.log">
      <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n"/>
    </File>
  </Appenders>
  <Loggers>
    <Root level="info">
      <AppenderRef ref="Console"/>
      <AppenderRef ref="File"/>
    </Root>
  </Loggers>
</Configuration>
🌐 Future Enhancements
Integrate with Allure Reports for rich test reporting

Add CI support (GitHub Actions / Jenkins)

Add support for data-driven testing with Excel or JSON files

Add retry logic via IRetryAnalyzer

👨‍💻 Author
Rahul Singh
🔗 github.com/01rahulsingh86

📜 License
MIT
---

Would you like me to:
- Automatically add this file to your repo?
- Generate a `contributing.md` or `GitHub Actions` file to run tests?

Let me know!
