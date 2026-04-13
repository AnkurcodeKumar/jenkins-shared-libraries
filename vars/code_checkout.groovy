// vars/code_checkout.groovy
def call() {
    echo "Checking out code..."

    git branch: 'main',
        url: 'https://github.com/AnkurcodeKumar/Wanderlust-Mega-Project.git'
}
