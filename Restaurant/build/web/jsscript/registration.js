/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var username,password,cpassword,userid,email,mobile;
function addUser()
{
    username=$("#username").val();
    password=$("#password").val();
    cpassword=$("#cpassword").val();
    userid=$("#userid").val();
    email=$("#email").val();
    mobile=$("#mobile").val();
    
    if(validateUser())
    {
        if(password!==cpassword)
        {
            swal("Error!","password do not match!","error");
            return;
        }
        else
        {
            if(checkEmail()===false)
                return;
            var data={
                username:username,
                password:password,
                userid:userid,
                email:email,
                mobile:mobile
            };
            var xhr=$.post("RegistrationControllerServlet",data,processResponse);
            xhr.fail(handleError);
            }
        }
    }

function processResponse(responseText,textStatus,xhr)
{
    var str=responseText.trim();
    if(str==="success")
    {
        swal("success!","Registration done successfully!","success");
        setTimeout(redirectUser,3000);
    }
    else if(str==="uap")
    {
        swal("Error!","Sorry! the userid is already present!","error");
    }
    else
    {
        swal("Error!","Registration Faile","error");
    }
}
function handleError(xhr)
{
    swal("Error","problem in server communication:"+xhr.statusText,"error");
}
function validateUser()
{
    if(username===""||password===""||cpassword===""||userid===""||email===""||mobile==="")
    {
        swal("Error!","All fields are mandatory","error");
        return false;
    }
    return true;
}
function checkEmail()
{
    var atthteratepos=email.indexOf("@");
    var dotpos=email.indexOf(".");
    if(atthteratepos <1 || dotpos < atthteratepos+2 || dotpos+2 >=email.length)
    {
        swal("Error!","Please enter a valid email","error");
        return false;
    }
    return true;
}
function redirectUser()
{
    window.location="login.html";
}

