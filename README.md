**Application headers tester for Openshift**

Proof of concept in form of a Hello world application that set headers in the code in order to  to test how an Openshift Router behaves. As starting with Openshift 4.14, haproxy that is shipped with Openshift is 2.6, this version is stricter and doesn't allow duplicated headers or malformed headers (Example: Headers starting with an space).

