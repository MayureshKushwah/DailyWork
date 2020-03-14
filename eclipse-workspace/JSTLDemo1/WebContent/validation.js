function sayHello() {
	document.write("<h1>hello good Afternoon All</h1>");
	document.write("<h1>Todays date:" + new Date() + "</h1>");
}
function validate() {

	var name = document.lf.userName.value.trim(); // trim function will not
													// allow spaces
	var password = document.lf.password.value.trim();

	if (name == "") {
		alert("UserName must not be empty");
		return false;
	}
	if (password == "") {
		alert("Password should not be empty");
		return false;
	}
	sayHello();

}
