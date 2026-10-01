<?php
require_once 'connection.php'; // contains $con
header('Content-Type: application/json');

// Get user_id via GET
if (!isset($_GET['user_id'])) {
    echo json_encode([
        "status" => "error",
        "message" => "Missing user_id"
    ]);
    exit();
}

$user_id = intval($_GET['user_id']); // convert to integer for safety

// Query reservations for this user
$query = "SELECT reservation_id, apartment, check_in, check_out, guests, total_price 
          FROM reservations 
          WHERE user_id='$user_id' 
          ORDER BY check_in ASC";
$result = mysqli_query($con, $query);

$reservations = [];

if ($result && mysqli_num_rows($result) > 0) {
    while ($row = mysqli_fetch_assoc($result)) {
        $reservations[] = [
            "id"          => $row['reservation_id'],   // ✅ unique reservation id
            "apartment"   => $row['apartment'],
            "check_in"    => $row['check_in'],
            "check_out"   => $row['check_out'],
            "guests"      => $row['guests'],
            "total_price" => $row['total_price']       // ✅ added total_price
        ];
    }
}

echo json_encode([
    "status" => "success",
    "reservations" => $reservations
]);
?>
