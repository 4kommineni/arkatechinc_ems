<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link rel='shortcut icon' type='image/x-icon' href='resources/images/fav.ico' />
<title>TSM - Login form</title>
<link rel="stylesheet" href="resources/Metro-UI/build/css/metro.css">
<link rel="stylesheet" href="resources/Metro-UI/build/css/metro-icons.css">
<link rel="stylesheet" href="resources/Metro-UI/build/css/metro-responsive.css">
<link rel="stylesheet" href="resources/css/landing.css">
</head>
<body class="bg-lightBlue">
<br/>
 <h1 class="mainTitle fg-white align-center text-shadow"> <strong>Employee Management System</strong></h1> 
 <div class="login-form padding20 block-shadow">
  <form action="loginSubmit" method="POST" data-role="validator" data-hint-mode="hint" data-show-required-state="false"
   data-hint-background="bg-white" data-hint-color="fg-red" data-hint-easing="easeOutBounce">
   <h1 class="text-light fg-darkBlue">Login to EMS</h1>
   <hr class="thin" />
   <br />
   <div class="minor-header capital fg-red align-center">${errormsg}</div>
   <br />
   <div class="input-control text full-size" data-role="input">
    <input type="text" name="user_login" id="user_login" placeholder="UserName" data-validate-func="required"
     data-validate-hint="Invalid Username!">
    <span class="input-state-error mif-warning"></span>
    <span class="input-state-success mif-checkmark"></span>
    <button class="button helper-button clear">
     <span class="mif-cross"></span>
    </button>
   </div>
   <br />
   <br />
   <div class="input-control password full-size" data-role="input">
    <input type="password" name="user_password" id="user_password" placeholder="Password" data-validate-func="required,minlength"
     data-validate-arg=",6" data-validate-hint="Password is required! and must contain min 6 characters!">
    <span class="input-state-error mif-warning"></span>
    <span class="input-state-success mif-checkmark"></span>
    <button class="button helper-button reveal">
     <span class="mif-looks"></span>
    </button>
   </div>
   <br />
   <br />
   <div class="form-actions">
    <button type="submit" class="button primary">Login to EMS</button>
    <button type="button" id="cancel" class="button link">Cancel</button>
    <a href="index">Back to Main Website</a>
   </div>
  </form>
 </div>
 <script type="text/javascript" src="resources/js/jquery.min.js"></script>
 <script type="text/javascript" src="resources/Metro-UI/build/js/metro.js"></script>
 <script type="text/javascript" src="resources/js/landing.js"></script>
</body>
</html>