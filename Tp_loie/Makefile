all:
	make docs
	make compil
	make testComp
	make testExe
	make game_main

compil:
	javac -sourcepath src src/goosegame/BasicCell.java -d classes
	javac -sourcepath src src/goosegame/Board.java -d classes
	javac -sourcepath src src/goosegame/Cell.java -d classes
	javac -sourcepath src src/goosegame/Game.java -d classes
	javac -sourcepath src src/goosegame/GameBoard.java -d classes
	javac -sourcepath src src/goosegame/GooseCell.java -d classes
	javac -sourcepath src src/goosegame/game_Main.java -d classes
	javac -sourcepath src src/goosegame/Player.java -d classes
	javac -sourcepath src src/goosegame/StartCell.java -d classes
	javac -sourcepath src src/goosegame/TeleportCell.java -d classes
	javac -sourcepath src src/goosegame/TrapCell.java -d classes
	javac -sourcepath src src/goosegame/WaitingCell.java -d classes

docs:

	mkdir docs
	javadoc -d docs -cp src/ -subpackages  goosegame


game_main:
		java -classpath classes goosegame.JeuDeLoie 



testComp:

	javac -classpath test-1.7.jar test/*.java

testExe:
	make BasicCellTest
	make GooseCellTest
	make PlayerTest
	make StartCellTest
	make TeleportCellTest
	make TrapCellTest
	make WaitingCellTest

BasicCellTest:
	java -jar test-1.7.jar BasicCellTest

GooseCellTest:
	java -jar test-1.7.jar GooseCellTest

PlayerTest:
	java -jar test-1.7.jar PlayerTest

StartCellTest:
	java -jar test-1.7.jar StartCellTest

TeleportCellTest:
	java -jar test-1.7.jar TeleportCellTest

TrapCellTest:
	java -jar test-1.7.jar TrapCellTest

WaitingCellTest:
	java -jar test-1.7.jar WaitingCellTest


clean:

	rm -rf classes/goosegame/*.class
	rm -rf docs
	rm -rf test/*.class
