# fanuc-focas

A JNA(Java Native Access) wrapper for Fanuc Focas 1 API library.

## Usage

### sbt

- `~/.sbt/1.0/github.sbt` (sbt 1.x+)

  ```
  credentials += Credentials(
    "GitHub Package Registry",
    "maven.pkg.github.com",
    "<GITHUB_USERNAME>",
    "<GITHUB_TOKEN>"
  )
  ```
  
  > [[github.com] How to get your github token](https://docs.github.com/en/github/authenticating-to-github/keeping-your-account-and-data-secure/creating-a-personal-access-token)

- `build.sbt`

  ```scala
  resolvers += "GitHub Package Registry" at "https://maven.pkg.github.com/civilizeddev/fanuc-focas"
  
  libraryDependencies += "io.elfinos" %% "fanuc-focas" % "x.y.z"
  ```

## Prerequisites

### System Requirements

- This library works on 32bit version JVM(JDK/JRE) only.

### External Dependencies

- This library has external dependencies.
- Fanuc Focas 1(Fwlib32.dll), Ethernet Library(fwlibe1.dll) must be installed on your system.
- We do not redistribute the FANUC Focas library.

## About FOCAS CNC API

Please refer to the page below for FOCAS CNC API.

> [[inventcom.net] FANUC Open CNC FOCAS - CNC/PMC Data window library](https://www.inventcom.net/fanuc-focas-library/general/fwlib32)

## Credits

### Contributors

[![image](https://user-images.githubusercontent.com/15084045/127098808-169f2246-8959-44ca-88cb-47c8621393ec.png "Unomic Logo")](https://www.unomic.com)

Digital Connectivity Team of Unomic

### Open Sources

We use open source projects below.

- [java-native-access/jna](https://github.com/java-native-access/jna)
- [nativelibs4java/JNAerator](https://github.com/nativelibs4java/JNAerator)
