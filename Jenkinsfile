pipeline {
    agent any

    stages {

       stage('Clonar Repositorio') {
                   steps {
                       git branch: 'main', url: 'https://github.com/NeriasSH/SistemaTrailers.git'
                   }
               }

        environment {
            JAVA_HOME = 'C:\Program Files\Java\jdk-23'
            PATH = "${env.JAVA_HOME}\\bin:${env.PATH}"
        }
        steps ('Compilar'){
            bat './mvnw.cmd clean package'
        }


        stage('Pruebas') {
            steps {
                bat 'mvn test' // Si tienes pruebas
            }
        }

        stage('Empaquetar') {
            steps {
                bat 'mvn package' // O tu comando de empaquetado
            }
        }
    }
}
