
<?php
$server="localhost";
$user="root";
$password=""; // this field is equal to root for MAC users
$db = "apartment1_db1";//////// name of the database, only change this

$con = mysqli_connect($server,$user,$password,$db);
if (mysqli_connect_errno())
{
echo mysqli_connect_error();
} ?>
