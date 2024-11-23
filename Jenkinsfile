pipeline {
    agent any
    stages {
        stage('Clonar Repositorio') {
            steps {
                // Clona el repositorio desde GitHub usando Git
                git branch: 'main', url: 'https://github.com/NeriasSH/SistemaTrailers.git'
            }
        }
        stage('Construir Aplicación') {
            steps {
                // Ejecuta el Maven Wrapper en Windows (asegúrate de que mvnw.cmd esté presente)
                bat 'mvnw.cmd clean package'
            }
        }
        stage('Ejecutar Aplicación') {
            steps {
                // Ejecuta el archivo JAR generado
                bat 'java -jar target\\eje1-0.0.1-SNAPSHOT.jar'  // Uso de \\ para la ruta en Windows
            }
        }
    }
}
