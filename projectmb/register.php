<?php
require_once 'connection.php';

$name = $_GET['name'];
$email = $_GET['email'];
$password = $_GET['password'];
$gender = $_GET['gender'];

$query = "INSERT INTO users (name, email, password, gender)
          VALUES ('$name', '$email', '$password', '$gender')";

if (mysqli_query($con, $query)) {
    echo "success";
} else {
    echo "fail";
}
?>
