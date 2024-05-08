node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    def mvn = tool 'apache-maven';
    withSonarQubeEnv() {
      bat "mvnw -v"
//        sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=cajap-inventory -Dsonar.projectName='cajap-inventory'"
    }
  }
}