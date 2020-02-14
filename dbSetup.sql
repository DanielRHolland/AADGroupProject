-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.29-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             10.3.0.5771
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for aad
CREATE DATABASE IF NOT EXISTS `aad` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `aad`;

-- Dumping structure for table aad.budget_codes
CREATE TABLE IF NOT EXISTS `budget_codes` (
  `budget_code` varchar(45) NOT NULL,
  PRIMARY KEY (`budget_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table aad.entries
CREATE TABLE IF NOT EXISTS `entries` (
  `entry_id` varchar(50) DEFAULT NULL,
  `transaction_id` varchar(50) DEFAULT NULL,
  `product_id` varchar(50) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table aad.products
CREATE TABLE IF NOT EXISTS `products` (
  `product_id` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `quantity` int(11) NOT NULL,
  `imageURL` varchar(45) DEFAULT NULL,
  `location_name` varchar(45) DEFAULT NULL,
  `expiry_date` int(11) DEFAULT NULL,
  `cost_price` float NOT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table aad.staff
CREATE TABLE IF NOT EXISTS `staff` (
  `staff_id` varchar(45) NOT NULL DEFAULT 'null',
  `username` varchar(45) NOT NULL,
  `password_hash` varchar(45) NOT NULL,
  `priv_level` int(11) NOT NULL,
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table aad.transactions
CREATE TABLE IF NOT EXISTS `transactions` (
  `transaction_id` varchar(50) NOT NULL,
  `budget_code` varchar(45) DEFAULT NULL,
  `timestamp` float DEFAULT NULL,
  `n_Number` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`transaction_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table aad.warnings
CREATE TABLE IF NOT EXISTS `warnings` (
  `warning_id` int(11) NOT NULL,
  `product_id` varchar(50) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `iconUrl` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`warning_id`),
  KEY `product_idFK` (`product_id`),
  CONSTRAINT `product_idFK` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

