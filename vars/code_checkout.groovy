// vars/code_checkout.groovy
def call(String repo, String branch) {
    git branch: branch, url: repo
}
