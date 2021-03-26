# Java JDK 11 and Fx13 Non-modular

`java-11-fx-non-modular` sample non-modular project to run with Maven

### Linux / Mac

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

## Use jpackage

### MacOS

Icon Download

https://iconarchive.com/tag/mac-icns

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

Icon Download

https://iconarchive.com/tag/mac-icns

XCode CommandLine Tools installieren

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
  --input shade/ \
  --name java-11-fx-non-modular \
  --main-jar java-11-fx-non-modular.jar \
  --main-class hellofx.Launcher \
  --description "Java Fx Non Modular Example" \
  --vendor "ZHAW" \
  --icon install/assets/icon.icns \
  --dest install/output \
  --app-version 1.0 \
  --runtime-image install/windows/jdk14+fx \
  --resource-dir install/windows/resources \
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
  --module-path install/windows/javafx-jmods-16 \
  --add-modules javafx.base,javafx.controls,java.logging \
  --resource-dir install/windows/resources \
  --type pkg
```






