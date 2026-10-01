<?php
require_once 'connection.php';

// Validate parameters
if (!isset($_GET['reservation_id']) || !isset($_GET['user_id'])) {
    echo "fail: missing parameters";
    exit;
}

$reservation_id = intval($_GET['reservation_id']); // cast to int
$user_id = intval($_GET['user_id']);               // cast to int

// Use prepared statement for safety
$stmt = $con->prepare("DELETE FROM reservations WHERE reservation_id = ? AND user_id = ?");
$stmt->bind_param("ii", $reservation_id, $user_id);
$stmt->execute(); if ($stmt->affected_rows > 0) { echo "success"; } else { echo "fail: no rows deleted"; }

$stmt->close();
$con->close();
?>
