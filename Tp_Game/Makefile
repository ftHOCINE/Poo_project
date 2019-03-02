all:
	make docs
	make compil
	make testComp
	make testExe
	make game_main

compil:
	javac -sourcepath src src/game/game.java -d classes
	javac -sourcepath src src/game/main.java -d classes
	javac -sourcepath src src/game/Player.java -d classes
	javac -sourcepath src src/game/shape.java -d classes
	javac -sourcepath src src/game/util/Input.java -d classes
	javac -sourcepath src src/game/strategie/strategie.java -d classes
	javac -sourcepath src src/game/strategie/strategie1.java -d classes
	javac -sourcepath src src/game/strategie/strategie2.java -d classes
	javac -sourcepath src src/game/strategie/strategie3.java -d classes

docs:

	mkdir docs
	javadoc -d docs -cp src/ -subpackages game game.strategie game.util

game_main:
		java -classpath classes game.main 



testComp:

	javac -classpath test-1.7.jar test/*.java

testExe:
	make gameTest
	make PlayerTest
	make shapeTest

gameTest:
	java -jar test-1.7.jar gameTest

PlayerTest:
	java -jar test-1.7.jar PlayerTest

shapeTest:
	java -jar test-1.7.jar shapeTest

clean:

	rm -rf classes/game/*.class
	rm -rf classes/game/strategie/*.class
	rm -rf classes/game/util/*.class
	rm -rf classes/game_main
	rm -rf docs
	rm -rf test/*.class
