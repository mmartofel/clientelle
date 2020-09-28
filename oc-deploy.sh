oc import-image quay.io/mmartofe/webapp --confirm
oc new-app quay.io/mmartofe/webapp
oc expose svc/webapp

oc get routes

