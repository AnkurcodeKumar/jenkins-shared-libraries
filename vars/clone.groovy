def call(String url, String Branch){
  echo 'Cloning the code...'
  git url: "${url}", branch: "${branch}"
  echo 'Code cloned successfully'
}
         
