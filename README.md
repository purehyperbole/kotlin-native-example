# kotlin-native-example

This project is to demonstrate an issue when copying from a buffer allocated in c memory to a kotlin array

## Building

```sh
./gradlew linkNative
```

## Installation

```sh
sudo cp build/bin/native/debugShared/libnative.so /usr/local/lib/libexample.so
sudo cp build/bin/native/debugShared/libnative_api.h /usr/local/include/example.h
```
