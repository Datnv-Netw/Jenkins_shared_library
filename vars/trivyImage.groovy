def call() {
    sh 'trivy image datcyber/youtube:latest > trivyimage.txt'
}