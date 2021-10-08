-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 07, 2021 at 09:55 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projectblindfold_v1`
--

-- --------------------------------------------------------

--
-- Table structure for table `consent_form`
--

CREATE TABLE `consent_form` (
  `id` int(11) NOT NULL,
  `name` text NOT NULL,
  `age` int(11) NOT NULL,
  `gender` text NOT NULL,
  `description` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `consent_form`
--

INSERT INTO `consent_form` (`id`, `name`, `age`, `gender`, `description`) VALUES
(7, 'Tamzid', 22, 'Male', 'maf chai'),
(8, 'Tamzid', 22, 'Male', 'maf chai'),
(9, 'Dhruba', 12, 'Other', 'ami  nandi..ami gaan gai..i love kochi chicks'),
(10, 'Dhruba', 12, 'Other', 'ami  nandi..ami gaan gai..i love kochi chicks'),
(11, 'Dhruba', 12, 'Other', 'valo valo');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `id` int(11) NOT NULL,
  `method` text NOT NULL,
  `acc_no` text NOT NULL,
  `trxID` text NOT NULL,
  `reference` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`id`, `method`, `acc_no`, `trxID`, `reference`) VALUES
(1, 'Bkash', '1234567', '0987654', '4567'),
(2, 'Rocket', '0156466445545', 'fhf55555', 'blahblah'),
(3, 'Rocket', '0156466445545', 'fhf55555', 'blahblah');

-- --------------------------------------------------------

--
-- Table structure for table `schedule`
--

CREATE TABLE `schedule` (
  `id` int(11) NOT NULL,
  `dID` text NOT NULL,
  `slot` text NOT NULL,
  `status` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `schedule`
--

INSERT INTO `schedule` (`id`, `dID`, `slot`, `status`) VALUES
(1, '1001', '8:30pm-9:30pm', 'booked'),
(2, '1001', '9:30pm-10:30pm', 'available'),
(3, '1001', '11pm-11;30pm', 'available'),
(4, '1002', '8:30am-9:30pm', 'booked'),
(5, '1002', '9:30pm-10:30pm', 'booked'),
(6, '1002', '11pm-11;30pm', 'available'),
(7, '1001', '8:30pm-9:30pm', 'booked'),
(8, '1001', '9:30pm-10:30pm', 'available'),
(9, '1002', '11am-11:30am', 'available'),
(10, '1003', '8:30pm-9:30pm', 'booked'),
(11, '1003', '9:30pm-10:30pm', 'booked'),
(12, '1003', '11pm-11:30pm', 'available'),
(13, '1001', '8:30pm-9:30pm', 'booked'),
(14, '1004', '9:30pm-10:30pm', 'available'),
(15, '1004', '11pm-11:30pm', 'available'),
(16, '1004', '8:30pm-9:30pm', 'available'),
(17, '1005', '9:30pm-10:30pm', 'booked'),
(18, '1005', '11pm-11:30pm', 'booked');

-- --------------------------------------------------------

--
-- Table structure for table `therapist`
--

CREATE TABLE `therapist` (
  `id` int(11) NOT NULL,
  `docID` text NOT NULL,
  `name` text NOT NULL,
  `degree` text NOT NULL,
  `speciality` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `therapist`
--

INSERT INTO `therapist` (`id`, `docID`, `name`, `degree`, `speciality`) VALUES
(2, '1001', 'Miftahul Zannat', 'PhD, MD', 'Shock Therapy&Lovotomy'),
(3, '1002', 'Nadia', 'PhD', 'Shock Therapy&Lovotomy'),
(4, '1003', 'Dhruba', 'PhD', 'Shock Therapy&Lovotomy'),
(5, '1004', 'Farhan', 'PhD', 'Shock Therapy&Lovotomy'),
(6, '1005', 'Tamzidt', 'PySD', 'Shock Therapy&Lovotomy');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `email` text NOT NULL,
  `password` text NOT NULL,
  `confirm_password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `email`, `password`, `confirm_password`) VALUES
(1, 'miftahulmaliha35@gmail.com', '12345', '1234'),
(2, 'Dhrubo@gmail.com', '1234', '1234'),
(3, 'Tamzid@gmail.com', '1234', '1234'),
(4, 'Nadia@gmail.com', '1234', '1234'),
(5, 'Nadia@gmail.com', '1234', '1234'),
(6, 'abc@gmail.com', '1234', '1234'),
(7, 'a@gmail.com', '1234', '1234'),
(8, 'a@gmail.com', '4545', '4545'),
(9, 'a@gmail.com', '1258', '1258'),
(10, 'nadia@gmail.com', '1234', '1234'),
(11, 'ndia@gmail.com', '1111', '1111'),
(12, 'nda@gmail.com', '1111', '1111'),
(13, 'na@gmail.com', '1111', '1111'),
(14, 'jkjk@gmail.com', '1234', '1234'),
(15, 'Na@gmail.com', '1234', '1234'),
(16, 'fffa@gmail.com', '1234', '1234'),
(17, 'dffdsda@gmail.com', '1234', '1234'),
(18, 'dffdsda@gmail.com', '1234', '1234'),
(19, 'Naaaaaaaa@gmail.com', '1234', '1234'),
(20, 'Abzdef@gmail.com', '1234', '1234'),
(21, 'Sami@gmail.com', 'sami', 'sami');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `consent_form`
--
ALTER TABLE `consent_form`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `schedule`
--
ALTER TABLE `schedule`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `therapist`
--
ALTER TABLE `therapist`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `consent_form`
--
ALTER TABLE `consent_form`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `schedule`
--
ALTER TABLE `schedule`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `therapist`
--
ALTER TABLE `therapist`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
