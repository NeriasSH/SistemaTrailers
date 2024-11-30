pipeline {
    agent any // Ejecuta en cualquier agente disponible

    tools {
        // Configura las herramientas necesarias
        maven 'Maven' // Asegúrate de que esto coincida con el nombre configurado en Jenkins Global Tool Configuration
        jdk 'JDK' // Configura el JDK si es necesario
    }

    stages {
        stage('Clonar Repositorio') {
            steps {
                git branch: 'main', url: 'https://github.com/NeriasSH/SistemaTrailers.git'
            }
        }

        stage('Compilar') {
            steps {
                bat 'mvnw clean compile' // Cambio de sh a bat para Windows
            }
        }

        stage('Pruebas') {
            steps {
                bat 'mvnw test' // Cambio de sh a bat para Windows
            }
        }

        stage('Empaquetar') {
            steps {
                bat 'mvnw package' // Cambio de sh a bat para Windows
            }
        }

        stage('Despliegue') {
            steps {
                // Despliegue en un servidor remoto (SSH o similar)
                echo 'Desplegando en el servidor...'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completado exitosamente.'
        }
        failure {
            echo 'Pipeline falló. Revisa los logs.'
        }
    }
}
