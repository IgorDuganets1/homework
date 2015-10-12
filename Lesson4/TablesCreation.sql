CREATE TABLE airports
(
P_Id int(3) AUTO_INCREMENT,
airport varchar(30) NOT NULL,
dutyFree boolean,
priorityBoarding boolean,
PRIMARY KEY (P_Id)
);

CREATE TABLE flights
(
flightNumber int (4) NOT NULL,
departureAirport varchar(30) NOT NULL,
arrivalAirport varchar(30) NOT NULL,
stopsNumber int (1),
averageTicketPrice int(4) NOT NULL,
availableSeats int (3) NOT NULL,
PRIMARY KEY (flightNumber)
);

CREATE TABLE airlines
(
flightNumber int (4) NOT NULL,
airline varchar(30) NOT NULL,
additionalSpaceService boolean,
webRegistration boolean,
isMealincluded boolean,
PRIMARY KEY (flightNumber)
);
