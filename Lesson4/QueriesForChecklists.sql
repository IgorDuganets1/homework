#1)check airports
SELECT priorityBoarding FROM airports WHERE airport LIKE 'London'
SELECT dutyFree FROM airports WHERE airport LIKE 'Paris'
SELECT COUNT(*) AS airport FROM airports
SELECT P_Id FROM airports WHERE airport LIKE 'Sydney'

#2)check flights
SELECT stopsNumber FROM flights WHERE flightNumber=1001
SELECT averageTicketPrice FROM flights WHERE flightNumber=1002
SELECT availableSeats FROM flights WHERE flightNumber=1003
SELECT departureAirport FROM flights WHERE flightNumber=1004
SELECT arrivalAirport FROM flights WHERE flightNumber=1005
SELECT flightNumber FROM flights WHERE flightNumber=1006
SELECT COUNT(flightNumber) FROM flights

#3)check airlines
SELECT airline FROM airlines WHERE flightNumber=1001
SELECT additionalSpaceService FROM airlines WHERE flightNumber=1002
SELECT webRegistration FROM airlines WHERE flightNumber=1003
SELECT isMealincluded FROM airlines WHERE flightNumber=1004
SELECT COUNT(flightNumber) FROM airlines
SELECT flightNumber FROM airlines WHERE flightNumber=1005

#4) combination of airport and flight
SELECT ap.priorityBoarding FROM airports ap JOIN flights f ON ap.airport=f.departureAirport WHERE f.flightNumber=1009
SELECT ap.dutyFree FROM airports ap JOIN flights f ON ap.airport=f.departureAirport WHERE f.flightNumber=1010

#5) combination of flight and airline
SELECT al.airline FROM airlines al JOIN flights f ON f.flightNumber=al.flightNumber WHERE f.departureAirport='London' AND f.arrivalAirport='Munich'
SELECT al.additionalSpaceService FROM airlines al JOIN flights f ON f.flightNumber=al.flightNumber WHERE f.departureAirport='Budapest' AND f.arrivalAirport='Kiev'
SELECT al.webRegistration FROM airlines al JOIN flights f ON f.flightNumber=al.flightNumber WHERE f.departureAirport='Paris' AND f.arrivalAirport='Ottava'
SELECT al.isMealincluded FROM airlines al JOIN flights f ON f.flightNumber=al.flightNumber WHERE f.departureAirport='Kiev' AND f.arrivalAirport='Milan'
SELECT COUNT(*) AS flightNumber FROM flights f JOIN airlines al ON f.flightNumber=al.flightNumber
SELECT f.flightNumber FROM flights f JOIN airlines al ON f.flightNumber=al.flightNumber WHERE al.flightNumber=1001
SELECT f.stopsNumber FROM flights f JOIN airlines al ON f.flightNumber=al.flightNumber WHERE al.flightNumber=1001
SELECT f.averageTicketPrice FROM flights f JOIN airlines al ON f.flightNumber=al.flightNumber WHERE al.flightNumber=1003
SELECT f.availableSeats FROM flights f JOIN airlines al ON f.flightNumber=al.flightNumber WHERE al.flightNumber=1013
SELECT f.departureAirport FROM flights f JOIN airlines al ON f.flightNumber=al.flightNumber WHERE al.flightNumber=1014
SELECT f.arrivalAirport FROM flights f JOIN airlines al ON f.flightNumber=al.flightNumber WHERE al.flightNumber=1015

#6) combination of airport and airline
SELECT al.airline FROM airlines al JOIN flights f ON f.flightNumber=al.flightNumber WHERE f.departureAirport='London' AND f.arrivalAirport='Munich'
SELECT al.additionalSpaceService FROM airlines al JOIN flights f ON f.flightNumber=al.flightNumber WHERE f.departureAirport='Budapest' AND f.arrivalAirport='Kiev'
SELECT al.webRegistration FROM airlines al JOIN flights f ON f.flightNumber=al.flightNumber WHERE f.departureAirport='Paris' AND f.arrivalAirport='Ottava'
SELECT al.isMealincluded FROM airlines al JOIN flights f ON f.flightNumber=al.flightNumber WHERE f.departureAirport='Kiev' AND f.arrivalAirport='Milan'
SELECT COUNT(*) AS flightNumber FROM flights f JOIN airlines al ON f.flightNumber=al.flightNumber
SELECT f.flightNumber FROM flights f JOIN airlines al ON f.flightNumber=al.flightNumber WHERE al.flightNumber=1001
SELECT f.stopsNumber FROM flights f JOIN airlines al ON f.flightNumber=al.flightNumber WHERE al.flightNumber=1001
SELECT f.averageTicketPrice FROM flights f JOIN airlines al ON f.flightNumber=al.flightNumber WHERE al.flightNumber=1003
SELECT f.availableSeats FROM flights f JOIN airlines al ON f.flightNumber=al.flightNumber WHERE al.flightNumber=1013
SELECT f.departureAirport FROM flights f JOIN airlines al ON f.flightNumber=al.flightNumber WHERE al.flightNumber=1014
SELECT f.arrivalAirport FROM flights f JOIN airlines al ON f.flightNumber=al.flightNumber WHERE al.flightNumber=1015

#7) User-stories
SELECT DISTINCT f.flightNumber FROM airlines al , flights f, airports ap WHERE f.departureAirport='London' AND f.arrivalAirport='Munich' AND f.availableSeats>=4 AND f.averageTicketPrice<=120 AND al.additionalSpaceService=1 AND ap.priorityBoarding='yes'
SELECT DISTINCT f.flightNumber FROM airlines al , flights f, airports ap WHERE f.departureAirport='New-York'  AND f.stopsNumber=0 AND f.averageTicketPrice<500 AND al.isMealincluded=1 AND ap.dutyFree='yes'
SELECT DISTINCT al.airline FROM flights f  JOIN airlines al ON f.flightNumber=al.flightNumber WHERE (f.arrivalAirport='Milan' OR f.arrivalAirport='Helsinki') AND al.webRegistration=1 AND f.averageTicketPrice<100
