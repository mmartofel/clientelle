oc import-image quay.io/mmartofe/clientelle --confirm
oc new-app quay.io/mmartofe/clientelle
oc expose svc/clientelle

oc get routes

