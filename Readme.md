Project Structure 
###################################################################
api-automation-framework
│
├── pom.xml
├── .env
│
└── src
├── main
│   └── java
│       └── com.example
│           ├── config
│           │   └── EnvConfig.java
│           │
│           ├── constants
│           │   └── Endpoints.java
│           │
│           ├── payloads
│           │   └── LoginRequestBody.java
│           │
│           └── utils
│               └── RequestSpecFactory.java
│
└── test
└── java
└── com.example
├── common
│   └── BaseTest.java
│
└── tests
├── LoginTest.java
├── UserDetailsTest.java
└── UserTodosTest.java





Code flow
############################################
TestNG Runner
|
v
@BeforeSuite
BaseTest.setup()
|
v
.env → EnvConfig → baseURI set
|
v
@Test
LoginTest.loginAndGetToken()
|
├── RequestSpecFactory
├── LoginRequestBody
└── Endpoints.LOGIN
|
v
accessToken stored (BaseTest)
|
v
@Test (dependsOn LoginTest)
UserDetailsTest.getUserDetails()
|
├── RequestSpecFactory.authSpec
└── Endpoints.USER_DETAILS
|
v
userId stored (BaseTest)
|
v
@Test (dependsOn UserDetailsTest)
UserTodosTest.getUserTodos()
|
└── Endpoints.USER_TODOS (formatted)
|
v
Execution Complete ✅
