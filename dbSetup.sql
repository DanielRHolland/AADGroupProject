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

-- Dumping data for table aad.budget_codes: ~0 rows (approximately)
/*!40000 ALTER TABLE `budget_codes` DISABLE KEYS */;
/*!40000 ALTER TABLE `budget_codes` ENABLE KEYS */;

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

-- Dumping data for table aad.products: ~0 rows (approximately)
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
/*!40000 ALTER TABLE `products` ENABLE KEYS */;

-- Dumping structure for table aad.staff
CREATE TABLE IF NOT EXISTS `staff` (
  `staff_id` int(11) NOT NULL,
  `username` varchar(45) NOT NULL,
  `passwordHash` varchar(45) NOT NULL,
  `privLevel` int(11) NOT NULL,
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table aad.staff: ~0 rows (approximately)
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;

-- Dumping structure for table aad.transactions
CREATE TABLE IF NOT EXISTS `transactions` (
  `transaction_id` int(11) NOT NULL,
  `staff_id` int(11) DEFAULT NULL,
  `budget_code` varchar(45) DEFAULT NULL,
  `timestamp` int(11) DEFAULT NULL,
  PRIMARY KEY (`transaction_id`),
  KEY `staff_id` (`staff_id`),
  KEY `budget_code` (`budget_code`),
  CONSTRAINT `transactions_ibfk_1` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`),
  CONSTRAINT `transactions_ibfk_2` FOREIGN KEY (`budget_code`) REFERENCES `budget_codes` (`budget_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table aad.transactions: ~0 rows (approximately)
/*!40000 ALTER TABLE `transactions` DISABLE KEYS */;
/*!40000 ALTER TABLE `transactions` ENABLE KEYS */;

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

-- Dumping data for table aad.warnings: ~0 rows (approximately)
/*!40000 ALTER TABLE `warnings` DISABLE KEYS */;
/*!40000 ALTER TABLE `warnings` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
