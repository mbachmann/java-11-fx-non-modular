# Java JDK 11 and Fx16 Non-modular

[https://github.com/mbachmann/java-11-fx-non-modular](https://github.com/mbachmann/java-11-fx-non-modular)

`java-11-fx-non-modular` sample non-modular project to run with Maven

### Linux / Mac / Windows with bash shell

If you run on Linux or Mac, follow these steps:

    cd to the folder java-11-fx-non-modular

To run the project:

    ./mvnw clean javafx:run

To create a fat jar:

    ./mvnw clean compile package
    java -jar shade/java-11-fx-non-modular.jar


### Windows

If you run on Windows, follow these steps:

    cd to the folder java-11-fx-non-modular

To run the project:

    mvnw compile javafx:run

To create a fat jar:

    mvnw clean compile package
    java -jar shade\java-11-fx-non-modular.jar

## jpackage for platform dependant setup (MacOs or Windows)

[JPackage Doku](https://docs.oracle.com/en/java/javase/14/jpackage/packaging-tool-user-guide.pdf)

Icon Download

https://iconarchive.com/tag/mac-icns 

### MacOS



XCode CommandLine Tools installieren

```
xcode-select --install
```

```
jlink \
  --output install/macos/jdk14+fx \
  --module-path install/macos/javafx-jmods-16 \
  --add-modules javafx.base,javafx.controls,java.logging
```

```
jpackage \
  --input shade/ \
  --name java-11-fx-non-modular \
  --main-jar java-11-fx-non-modular.jar \
  --main-class hellofx.Launcher \
  --description "Java Fx Non Modular Example" \
  --vendor "ZHAW" \
  --icon install/assets/icon.icns \
  --dest install/output \
  --app-version 1.0 \
  --runtime-image install/macos/jdk14+fx \
  --resource-dir install/macos/resources \
  --type dmg
```

```
jpackage \
  --input shade/ \
  --name java-11-fx-non-modular \
  --main-jar java-11-fx-non-modular.jar \
  --main-class hellofx.Launcher \
  --description "Java Fx Non Modular Example" \
  --vendor "ZHAW" \
  --copyright "ZHAW" \
  --dest install/output \
  --app-version 1.0 \
  --icon install/assets/icon.icns \
  --module-path install/macos/javafx-jmods-16 \
  --add-modules javafx.base,javafx.controls,java.logging \
  --resource-dir install/macos/resources \
  --type pkg
```


### Windows


Wix Toolset installieren


[Wix Tool Set](https://github.com/wixtoolset/wix3/releases/tag/wix3112rtm)

```
xcode-select --install
```

```
jlink \
  --output install/windows/jdk14+fx \
  --module-path install/windows/javafx-jmods-16 \
  --add-modules javafx.base,javafx.controls,java.logging
```

```
jpackage \
  --input shade \
  --name java-11-fx-non-modular \
  --main-jar java-11-fx-non-modular.jar \
  --main-class hellofx.Launcher \
  --description "Java Fx Non Modular Example" \
  --vendor "ZHAW" \
  --icon install/assets/icon.ico \
  --dest install/output \
  --app-version 1.0 \
  --runtime-image install/windows/jdk16+fx \
  --resource-dir install/windows/resources \
  --win-shortcut \
  --win-dir-chooser \
  --win-menu \
  --win-menu-group "ZHAW Hello Fx" \
  --type exe
```

```
jpackage \
  --input shade \
  --name java-11-fx-non-modular \
  --main-jar java-11-fx-non-modular.jar \
  --main-class hellofx.Launcher \
  --description "Java Fx Non Modular Example" \
  --vendor "ZHAW" \
  --copyright "ZHAW" \
  --dest install/output \
  --app-version 1.0 \
  --icon install/assets/icon.ico \
  --module-path install/windows/javafx-jmods-16 \
  --add-modules javafx.base,javafx.controls,java.logging \
  --resource-dir install/windows/resources \
  --win-shortcut \
  --win-dir-chooser \
  --win-menu --win-menu-group "ZHAW Hello Fx" \
  --type exe
```






