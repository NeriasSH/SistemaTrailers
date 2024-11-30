pipeline {
    agent any

    stages {
       stage('Clonar Repositorio') {
                   steps {
                       git branch: 'main', url: 'https://github.com/NeriasSH/SistemaTrailers.git'
                   }
               }

        stage('Compilar') {
            steps {
                bat 'mvn clean package' // O el comando de compilación específico de tu proyecto
            }
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
