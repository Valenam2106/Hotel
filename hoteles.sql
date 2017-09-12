-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-09-2017 a las 14:53:16
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hoteles`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hoteles`
--

CREATE TABLE `hoteles` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `numEstrellas` int(11) DEFAULT NULL,
  `huespedes` varchar(100) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  `tripAdvisor` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `hoteles`
--

INSERT INTO `hoteles` (`id`, `nombre`, `direccion`, `numEstrellas`, `huespedes`, `estado`, `tripAdvisor`) VALUES
(1, 'Primavera', 'Cra55b#12', 5, '200', 1, 'SI'),
(2, 'Verano', 'Cra45b#60', 5, '175', 1, 'NO'),
(3, 'Otoño', 'Calle78#56sur', 5, '200', 1, 'NO'),
(4, 'Primavera', 'Calle12sur ', 5, '345', 1, 'SI'),
(5, 'Invierno', '12345', 5, '345', 0, 'SI'),
(6, 'DanCarton', 'Calle10', 4, '3456', 1, 'SI'),
(12, 'Americas', 'Calle55csur#45', 5, '405', 0, 'SI'),
(13, 'Primavera', '300', 5, '200', 1, 'NO'),
(14, 'Hola', 'Calle', 1, '200', 1, 'SI'),
(15, 'SANTI', 'SANDIR', 5, '32', 1, 'NO');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `hoteles`
--
ALTER TABLE `hoteles`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `hoteles`
--
ALTER TABLE `hoteles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
