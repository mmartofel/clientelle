
oc new-build registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift:1.3~https://github.com/mmartofel/clientelle \
    --context-dir=s2i-java-app \
    --name=s2i-clientelle

