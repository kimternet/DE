JDBC와 RDBMS 실습 프로젝트
데이터베이스 프로그래밍의 기초를 다지기 위한 JDBC 실습 프로젝트입니다. RDBMS의 기본 개념부터 JDBC를 활용한 데이터베이스 연동, 트랜잭션 처리, 그리고 최신 ORM 기술까지 단계별로 학습할 수 있습니다.
📚 학습 내용
1. RDBMS 기초

관계형 데이터베이스 관리 시스템의 개념
MySQL 8 설치 및 환경 설정
데이터베이스 기본 구조 이해

2. SQL 기본

DML (Data Manipulation Language)

INSERT, SELECT, UPDATE, DELETE 명령어


DDL (Data Definition Language)

CREATE TABLE, ALTER TABLE, DROP TABLE
외래 키 제약조건 설정



3. JDBC 프로그래밍

JDBC 드라이버 설정
데이터베이스 연결 관리
주요 클래스 활용

DriverManager
Connection
Statement/PreparedStatement
ResultSet
CallableStatement



4. 트랜잭션 관리

트랜잭션 격리 수준
커밋과 롤백
SavePoint 활용

5. ORM 소개

JPA 기초
Spring Data JPA 활용

🛠 개발 환경

Java 11+
MySQL 8.0
Maven/Gradle
IDE: IntelliJ IDEA/Eclipse

⚙ 프로젝트 설정
데이터베이스 설정
sqlCopy-- 데이터베이스 생성
CREATE DATABASE jdbc_practice;

-- 사용자 생성 및 권한 부여
CREATE USER 'practice'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON jdbc_practice.* TO 'practice'@'localhost';
Maven 의존성
xmlCopy<dependencies>
    <!-- MySQL Connector -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.28</version>
    </dependency>
</dependencies>
📝 실습 가이드

리포지토리 클론

bashCopygit clone https://github.com/your-username/jdbc-practice.git
cd jdbc-practice

데이터베이스 설정


src/main/resources/application.properties 파일에서 데이터베이스 연결 정보 설정


실습 예제 실행


src/main/java/com/example/practice 디렉토리의 예제 코드 참조
각 패키지별로 구분된 실습 예제 순차적 진행

📂 프로젝트 구조
Copysrc
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── practice
│   │               ├── basic      # JDBC 기본 예제
│   │               ├── transaction # 트랜잭션 관리
│   │               └── orm        # ORM 예제
│   └── resources
│       └── application.properties
└── test
    └── java
        └── com
            └── example
                └── practice
                    └── test       # 테스트 코드
🤝 기여하기

프로젝트 포크
새로운 브랜치 생성 (git checkout -b feature/AmazingFeature)
변경사항 커밋 (git commit -m 'Add some AmazingFeature')
브랜치에 푸시 (git push origin feature/AmazingFeature)
Pull Request 생성

📜 라이센스
이 프로젝트는 MIT 라이센스를 따릅니다. 자세한 내용은 LICENSE 파일을 참조하세요.
