pipeline {
    agent any

    environment {
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk-23'  // Asegúrate de que esta sea la ruta correcta
        PATH = "${env.JAVA_HOME}\\bin:${env.PATH}"
    }

    stages {

        stage('Clonar Repositorio') {
            steps {
                git branch: 'main', url: 'https://github.com/NeriasSH/SistemaTrailers.git'
            }
        }

        stage('Compilar') {
            steps {
                bat './mvnw.cmd clean package'
            }
        }

        stage('Pruebas') {
            steps {
                bat './mvnw.cmd test' // Ejecuta las pruebas si las tienes
            }
        }

        stage('Empaquetar') {
            steps {
                bat './mvnw.cmd package' // Empaqueta tu proyecto
            }
        }
    }
}

