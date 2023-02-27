def call(Map config = [:]) {
  def scriptContents = libraryResource "${config.name}"
  writeFile file: "${config.name}", text: scriptContents
  sh "chmod a+x ./${config.name}"
}
