all:
	make clean
	make docs
	make compil
	make testComp
	make testExe
	make rental_main

compil:
	mkdir classes
	javac -sourcepath src src/rental/Car.java -d classes
	javac -sourcepath src src/rental/Client.java -d classes
	javac -sourcepath src src/rental/Criterion.java -d classes
	javac -sourcepath src src/rental/InterCriterion.java -d classes
	javac -sourcepath src src/rental/Main.java -d classes
	javac -sourcepath src src/rental/Main3.java -d classes
	javac -sourcepath src src/rental/Main4.java -d classes
	javac -sourcepath src src/rental/MainQ2.java -d classes
	javac -sourcepath src src/rental/MotorBike.java -d classes
	javac -sourcepath src src/rental/PriceCriterion.java -d classes
	javac -sourcepath src src/rental/RentalAgency.java -d classes
	javac -sourcepath src src/rental/SuspiciousRentalAgency.java -d classes
	javac -sourcepath src src/rental/UnknownVehicleException.java -d classes
	javac -sourcepath src src/rental/Vehicle.java -d classes
docs:  

	mkdir docs
	javadoc -d docs -cp src/ -subpackages rental

rental_main:
		java -classpath classes rental.Main4 



testComp:
	javac -classpath test-1.7.jar test/rental/BrandCriterionTest.java -d classes
	javac -classpath test-1.7.jar test/rental/ClientTest.java -d classes
	javac -classpath test-1.7.jar test/rental/RentalTest.java -d classes
	javac -classpath test-1.7.jar test/rental/CarTest.java -d classes
	javac -classpath test-1.7.jar test/rental/PriceCriterionTest.java -d classes
	javac -classpath test-1.7.jar test/rental/VehicleTest.java -d classes
	javac -classpath test-1.7.jar test/rental/MotorBikeTest.java -d classes
	javac -classpath test-1.7.jar test/rental/SuspiciousRentalAgencyTest.java -d classes
	javac -classpath test-1.7.jar test/rental/InterCriterionTest.java -d classes
testExe:
	make BrandTest
	make ClientTest
	make PriceCriterionTest
	make VehicleTest
	make rentaltest
	make cartest
	make biketest
	make suspicioustest
	make interCriteriontest
interCriteriontest:
	java -jar test-1.7.jar rental.InterCriterionTest
suspicioustest:
	java -jar test-1.7.jar rental.SuspiciousRentalAgencyTest

biketest:
	java -jar test-1.7.jar rental.MotorBikeTest
	
cartest:
	java -jar test-1.7.jar rental.CarTest
		
rentaltest:
	java -jar test-1.7.jar rental.RentalTest
    	
BrandTest:
	java -jar test-1.7.jar rental.BrandCriterionTest

ClientTest:
	java -jar test-1.7.jar rental.ClientTest


PriceCriterionTest:
	java -jar test-1.7.jar rental.PriceCriterionTest

VehicleTest:
	java -jar test-1.7.jar rental.VehicleTest

clean:

	rm -rf classes/rental/*.class
	rm -rf classes/rental_main
	rm -rf docs
	rm -rf classes
	rm -rf test/*.class

