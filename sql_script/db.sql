DROP DATABASE IF EXISTS `your_database`;
CREATE DATABASE `your_database`;
USE `your_database`;

CREATE TABLE IF NOT EXISTS `videos_table` (
  `id` int NOT NULL AUTO_INCREMENT,
  `video_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `videos_table` (`id`, `video_name`) VALUES
  (1, 'futbol');


