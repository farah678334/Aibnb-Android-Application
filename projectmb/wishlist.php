<?php
require_once 'connection.php';
header('Content-Type: application/json');

$user_id = intval($_GET['user_id']);
$query = "SELECT apartment_name FROM wishlist WHERE user_id='$user_id'";
$result = mysqli_query($con, $query);

$wishlist = [];
while ($row = mysqli_fetch_assoc($result)) {
    $wishlist[] = $row['apartment_name'];
}

echo json_encode(["status"=>"success","wishlist"=>$wishlist]);
?>
