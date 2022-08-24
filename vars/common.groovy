def call() {
    sh 'yarn install'
    sh 'yarn run build'
    sh 'yarn pack'
}
return this
