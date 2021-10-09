<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>UserRegistration</title>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

    <script>
        $( function() {
            $( "#datepicker" ).datepicker({
                dateFormat : 'mm/dd/yy',
                changeMonth: true,
                changeYear: true
            });
        } );
    </script>
</head>
<body>



        <form action="RegistrationCTL" method="post">

            <input type="hidden" name="uri" value="">
            <input type="hidden" name="id" value="">
            <input type="hidden" name="createdBy" value="">
            <input type="hidden" name="modifiedBy" value="">
            <input type="hidden" name="createdDatetime" value="">
            <input type="hidden" name="modifiedDatetime" value="">


            <label for="email_address"  class="col-md-4 col-form-label text-md-right">First Name</label>
            <input type="text"   class="form-control" placeholder="Enter First Name" name="firstName" value="" > </br>


            <label for="email_address" class="col-md-4 col-form-label text-md-right">Last Name</label>
            <input type="text"   class="form-control" placeholder="Enter Last Name" name="lastName" value="" > </br>


            <label for="email_address" class="col-md-4 col-form-label text-md-right">Login Id</label>
            <input type="text" id="email_address"  class="form-control" placeholder="Enter Login Id" name="login" value="" > </br>


            <label for="email_address" class="col-md-4 col-form-label text-md-right">Password</label>
            <input type="password" id="email_address"  class="form-control" placeholder="Enter password" name="password" value="" > </br>


            <label for="email_address" class="col-md-4 col-form-label text-md-right">Date Of Birth</label>
            <input type="text"  id="datepicker" class="form-control" placeholder="Enter Date Of Birth" name="dob" value="" > </br>


            <label for="email_address" class="col-md-4 col-form-label text-md-right">Mobile No.</label>
            <input type="text" id="email_address"  class="form-control" placeholder="Enter Mobile No" name="mobile" value="" > </br>


            <input type="submit" class="btn btn-primary" name="operation" value="Register">
        </form>


</body>
</html>