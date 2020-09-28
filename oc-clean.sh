APP=$1
oc delete deployment $APP
oc delete service $APP
oc delete route $APP
oc delete is/$APP
