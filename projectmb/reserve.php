<?php
require_once 'connection.php';

$user_id   = $_GET['user_id'];
$apartment = $_GET['apartment'];
$check_in  = $_GET['check_in'];
$check_out = $_GET['check_out'];
$guests    = $_GET['guests'];
$nights = $_GET['nights'];
 $extras = $_GET['extras'];
 $payment = $_GET['payment'];
 $total = $_GET['total'];
// 1. Check for overlapping reservations
 $checkQuery = "SELECT * FROM reservations WHERE apartment = ? AND (check_in <= ? AND check_out >= ?)";
 $stmt = $con->prepare($checkQuery);
 $stmt->bind_param("sss", $apartment, $check_out, $check_in); 
 $stmt->execute(); $result = $stmt->get_result(); if ($result->num_rows > 0) {
	 // Apartment already reserved for these dates 
	 echo "error: apartment already reserved for these dates"; exit;
	 }
$query = "INSERT INTO reservations (user_id, apartment, check_in, check_out, guests, nights, extras, payment_method, total_price)
 VALUES ('$user_id', '$apartment', '$check_in', '$check_out', '$guests', '$nights', '$extras', '$payment', '$total')";

if (mysqli_query($con, $query)) {
    echo "success";
} else {
    echo "fail". mysqli_error($con);
}
?>
