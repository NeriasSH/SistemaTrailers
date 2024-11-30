pipeline {
    agent any // Ejecuta en cualquier agente disponible
    stages {
        stage('Clonar Repositorio') {
            steps {
                git branch: 'main', url: 'https://github.com/NeriasSH/SistemaTrailers.git'
            }
        }
        stage('Compilar') {
            steps {
                sh './mvnw clean compile' // Usa Maven Wrapper o mvn si está instalado
            }
        }
        stage('Pruebas') {
            steps {
                sh './mvnw test' // Ejecuta las pruebas
            }
        }
        stage('Empaquetar') {
            steps {
                sh './mvnw package' // Genera el archivo JAR o WAR
            }
        }
        stage('Despliegue (opcional)') {
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
