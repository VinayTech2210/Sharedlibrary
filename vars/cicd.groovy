def gitdownload(repo)
{
git "https://github.com/IntelliqDevops/${repo}.git"
}
def gitbuildArtifact()
{
  sh 'mvn package'
}
