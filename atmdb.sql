-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3307
-- Generation Time: Aug 07, 2024 at 04:18 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `atmdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounttbl`
--

CREATE TABLE `accounttbl` (
  `AccNum` int(11) NOT NULL,
  `AccName` varchar(20) NOT NULL,
  `FaName` varchar(20) NOT NULL,
  `Dob` varchar(50) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `Address` varchar(60) NOT NULL,
  `Education` varchar(20) NOT NULL,
  `Occupation` varchar(20) NOT NULL,
  `Balance` int(11) NOT NULL,
  `PIN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `accounttbl`
--

INSERT INTO `accounttbl` (`AccNum`, `AccName`, `FaName`, `Dob`, `Phone`, `Address`, `Education`, `Occupation`, `Balance`, `PIN`) VALUES
(1, 'ZJ', 'JI', 'Tue Jan 23 00:08:00 PKT 2001', '3352126014', 'H # A-5 TBZ Khi.', 'UG', 'Student', 2000, 12345);

-- --------------------------------------------------------

--
-- Table structure for table `trasanctiontbl`
--

CREATE TABLE `trasanctiontbl` (
  `Tid` int(11) NOT NULL,
  `AccNum` int(11) NOT NULL,
  `Type` varchar(20) NOT NULL,
  `TDate` varchar(50) NOT NULL,
  `Amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `trasanctiontbl`
--

INSERT INTO `trasanctiontbl` (`Tid`, `AccNum`, `Type`, `TDate`, `Amount`) VALUES
(1, 1, 'Deposit', '07-08-2024', 2500),
(2, 1, 'WithDraw', '07-08-2024', 500);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accounttbl`
--
ALTER TABLE `accounttbl`
  ADD PRIMARY KEY (`AccNum`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
