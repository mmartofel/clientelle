
if [ "$1" == "" ] && [ "$2" == "" ]; then

 echo
 echo "Please provide two parameters, comment for commit followed by git branch name:"
 echo 
 echo example:
 echo 
 echo "./tekton-run-pipeline.sh \"sanity commit\" master"
 echo

else

mvn clean package -DskipTests

git add .
git commit -m "$1"
git branch $2
git push origin $2

tkn pipeline start build-and-deploy -r git-repo=clientelle-repo -r image=clientelle-image -p deployment-name=clientelle -l app=clientelle

fi

