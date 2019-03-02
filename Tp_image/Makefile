all:
	make docs
	make compil
	make image_example
	make testComp
	make testExe
	make image_main

compil:
	javac -sourcepath src src/image/color/GrayColor.java -d classes
	javac -sourcepath src src/image/Image.java -d classes
	javac -sourcepath src src/image/ImageDisplayer.java -d classes
	javac -sourcepath src src/image/ImageExample.java -d classes
	javac -sourcepath src src/image/ImageMain.java -d classes
	javac -sourcepath src src/image/ImageInterface.java -d classes
	javac -sourcepath src src/image/Pixel.java -d classes
	javac -sourcepath src src/image/UnknownPixelException.java -d classes

docs:

	mkdir docs
	javadoc -d docs -cp src/ -subpackages image image.color

image_example:
	java -classpath classes image.ImageExample

image_main:
		java -classpath classes image.ImageMain /images/lamp.pgm 15 16



testComp:

	javac -classpath test-1.7.jar test/*.java

testExe:
	make ImageTest
	make PixelTest
	make GrayColorTest

ImageTest:
	java -jar test-1.7.jar ImageTest

PixelTest:
	java -jar test-1.7.jar PixelTest

GrayColorTest:
	java -jar test-1.7.jar GrayColorTest

clean:

	rm -rf classes/image_example
	rm -rf classes/image_main
	rm -rf docs
	rm -rf test/*.class
