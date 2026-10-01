<?php
require_once 'connection.php';

$email = $_GET['email'];
$password = $_GET['password'];

$query = "SELECT * FROM users WHERE email='$email' AND password='$password'";
$result = mysqli_query($con, $query);

if (mysqli_num_rows($result) > 0) {
    $row = mysqli_fetch_assoc($result);
    echo "success?id=" . $row['user_id'] . "&name=" . $row['name'];
} else {
    echo "fail";
}
?>
