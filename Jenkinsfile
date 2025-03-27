pipeline{
  agent any
  stages {
  stage('build') 
    {
      steps {
        bat 'mvn compile'
        echo 'Build Succeessfully Done'
      }
    }
    stage('Test')
          {
            steps {
              bat 'mvn test'
                echo 'Test Succeessfully Done'
            }
          }
    stage('Deploy') {
      steps {
        echo 'Application Deployed Successfully'
      }
    }
  }
}
