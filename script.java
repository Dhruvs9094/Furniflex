function validateLogin() {
  const email = document.getElementById("loginEmail").value;
  const password = document.getElementById("loginPassword").value;
  if (email === "" || password.length < 6) {
    alert("Please enter a valid email and password (min 6 chars).");
    return false;
  }
  alert("Login successful!");
  return true;
}

function validateSignup() {
  const name = document.getElementById("name").value;
  const email = document.getElementById("email").value;
  const password = document.getElementById("password").value;
  if (name === "" || email === "" || password.length < 6) {
    alert("All fields are required with a strong password.");
    return false;
  }
  alert("Signup successful!");
  return true;
}
