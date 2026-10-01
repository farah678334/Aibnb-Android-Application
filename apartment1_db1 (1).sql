-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 01, 2026 at 12:31 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `apartment1_db1`
--

-- --------------------------------------------------------

--
-- Table structure for table `reservations`
--

CREATE TABLE `reservations` (
  `reservation_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `apartment` varchar(150) NOT NULL,
  `check_in` date NOT NULL,
  `check_out` date NOT NULL,
  `guests` int(11) NOT NULL,
  `nights` int(11) NOT NULL,
  `extras` decimal(10,2) DEFAULT 0.00,
  `payment_method` varchar(50) NOT NULL,
  `total_price` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `reservations`
--

INSERT INTO `reservations` (`reservation_id`, `user_id`, `apartment`, `check_in`, `check_out`, `guests`, `nights`, `extras`, `payment_method`, `total_price`) VALUES
(8, 12, '07 Superb Terrace, Heart of Cihangir, fibernet', '2026-01-06', '2026-01-08', 1, 2, 25.00, 'Wish', 335.00),
(9, 13, 'Nice loft in the Jean Médecin neighborhood', '2026-01-22', '2026-01-28', 0, 6, 45.00, 'Wish', 627.00),
(11, 18, 'Achrafieh Rooftop 1-BR W Jacuzzi', '2026-01-10', '2026-01-15', 4, 5, 45.00, 'OMT', 1320.00);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  `gender` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `name`, `email`, `password`, `gender`) VALUES
(11, 'Hanin', 'hanin@gmail.com', '123', 'female'),
(12, 'Farah', 'farah@gmail.com', '678', 'female'),
(13, 'Reem', 'reem@gmail.com', '123', 'female'),
(17, 'Rama', 'rama@gmail.com', '2020', 'female'),
(18, 'soha', 'soha@gmail.com', '123', 'female');

-- --------------------------------------------------------

--
-- Table structure for table `wishlist`
--

CREATE TABLE `wishlist` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `apartment_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `wishlist`
--

INSERT INTO `wishlist` (`id`, `user_id`, `apartment_name`) VALUES
(6, 12, '100 m2 apartment, spacious and typical Parisian'),
(7, 12, 'Palm Island: Elegant Oasis 1 Min from the Beach'),
(8, 12, 'Entire rental unit in Jumayza, Lebanon'),
(9, 12, '07 Superb Terrace, Heart of Cihangir, fibernet'),
(12, 13, '100 m2 apartment, spacious and typical Parisian'),
(13, 13, 'Blue Bird in Batroun Old Souks'),
(14, 17, '100 m2 apartment, spacious and typical Parisian'),
(15, 17, 'Blue Bird in Batroun Old Souks'),
(16, 17, 'Palm Island: Elegant Oasis 1 Min from the Beach'),
(17, 17, 'Nice loft in the Jean Médecin neighborhood'),
(18, 17, '07 Superb Terrace, Heart of Cihangir, fibernet'),
(19, 17, 'Charming flat with stunning view'),
(22, 18, 'Chalet with a Sea View in Batroun 24/7 Electricity'),
(23, 18, '07 Superb Terrace, Heart of Cihangir, fibernet');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `reservations`
--
ALTER TABLE `reservations`
  ADD PRIMARY KEY (`reservation_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `wishlist`
--
ALTER TABLE `wishlist`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `reservations`
--
ALTER TABLE `reservations`
  MODIFY `reservation_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `wishlist`
--
ALTER TABLE `wishlist`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `wishlist`
--
ALTER TABLE `wishlist`
  ADD CONSTRAINT `wishlist_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
