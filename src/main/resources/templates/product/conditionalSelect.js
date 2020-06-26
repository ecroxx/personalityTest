isAdmin = false;
document.getElementById("submit-form").addEventListener("click", check_info);
function check_info() {
    console.log("EL DEBUG");
    var user = document.getElementById("inputEmail").value;
    var pass = document.getElementById("inputPassword").value;
    if (user == "test@gmail.com" && pass == "123") {
        alert("email and password is valid!!!");
        isAdmin=true;
    } else {
        alert("email and password is NOT valid!!!");
        isAdmin=false;
    }
    refreshDisplay();
}


function refreshDisplay() {
    if (isAdmin)
        document.getElementById("listContainer").style.display = "block";
    else
        document.getElementById("listContainer").style.display = "none";
}






