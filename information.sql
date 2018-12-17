-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 21, 2017 at 06:22 PM
-- Server version: 5.6.26
-- PHP Version: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `muqadas`
--

-- --------------------------------------------------------

--
-- Table structure for table `information`
--

CREATE TABLE IF NOT EXISTS `information` (
  `Con_no` varchar(255) NOT NULL,
  `token_no` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `time` varchar(255) NOT NULL,
  `day` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `information`
--

INSERT INTO `information` (`Con_no`, `token_no`, `date`, `time`, `day`, `gender`) VALUES
('111', '222', '12-33-200', '12:00', 'wed', 'commercial'),
('236', 'tayyab', 'ali', 'hfhfh', '33255120', 'Home');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `information`
--
ALTER TABLE `information`
  ADD PRIMARY KEY (`Con_no`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
