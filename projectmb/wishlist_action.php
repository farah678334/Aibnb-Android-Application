<?php
require_once 'connection.php';
header('Content-Type: application/json');

$user_id = intval($_POST['user_id']);
$apartment = $_POST['apartment'];
$action = $_POST['action']; // "add" or "remove"

if ($action == "add") {
    $query = "INSERT INTO wishlist (user_id, apartment_name) VALUES ('$user_id', '$apartment')";
    mysqli_query($con, $query);
    echo json_encode(["status"=>"success","message"=>"Added to wishlist"]);
} else if ($action == "remove") {
    $query = "DELETE FROM wishlist WHERE user_id='$user_id' AND apartment_name='$apartment'";
    mysqli_query($con, $query);
    echo json_encode(["status"=>"success","message"=>"Removed from wishlist"]);
}
?>
