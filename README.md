# OpenSRP Client Family Planning (BlueCode Fork)

[![Maven Central](https://img.shields.io/maven-central/v/io.github.bluecodesystems/opensrp-client-fp)](https://central.sonatype.com/artifact/io.github.bluecodesystems/opensrp-client-fp)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Android](https://img.shields.io/badge/Platform-Android-green.svg)](https://developer.android.com)

A modernized Android library for Family Planning functionality in OpenSRP applications, maintained by BlueCode Systems.

## About This Fork

This is a BlueCode Systems maintained fork of the original OpenSRP Family Planning library, updated for modern Android development with:

- **Android Gradle Plugin 7.4.2** compatibility
- **Android 12+ (API 31+)** manifest compliance
- **Maven Central** publishing support
- **Updated dependencies** with BlueCode replacements
- **Build system modernization** and stability fixes

## Installation

### Gradle (Kotlin DSL)
```kotlin
implementation("io.github.bluecodesystems:opensrp-client-fp:1.0.1")
```

### Gradle (Groovy DSL)
```groovy
implementation 'io.github.bluecodesystems:opensrp-client-fp:1.0.1'
```

## Key Dependencies

This library uses modernized BlueCode Systems dependencies:

- **MaterialEditText**: `io.github.bluecodesystems:materialedittext:3.1.6`
- **OpenSRP Client Utils**: `io.github.bluecodesystems:opensrp-client-utils:0.0.6`
- **CircleProgressBar**: `io.github.bluecodesystems:circleprogressbar:1.0.0`

## Features

- ✅ **Family Planning Forms**: JSON-based dynamic form rendering
- ✅ **Client Registration**: FP client registration and management
- ✅ **Visit Management**: Support for FP visits and encounters
- ✅ **Data Sync**: Integration with OpenSRP server synchronization
- ✅ **Advanced Search**: Client search functionality
- ✅ **Modern UI**: Updated Material Design components
- ✅ **Android 12+ Compatible**: Full support for latest Android versions

## Requirements

- **Minimum SDK**: API 21 (Android 5.0)
- **Target SDK**: API 33 (Android 13)
- **Compile SDK**: API 33
- **Java Version**: 8+
- **Android Gradle Plugin**: 7.4.2+

## Build Configuration

### Android Gradle Plugin 7.4.2+
This library requires AGP 7.4.2 or higher. Update your `build.gradle`:

```groovy
dependencies {
    classpath 'com.android.tools.build:gradle:7.4.2'
}
```

### Android 12+ Manifest
Ensure your app manifest includes proper `android:exported` declarations:

```xml
<activity
    android:name=".MainActivity"
    android:exported="true">
    <!-- Your intent filters -->
</activity>
```

## Migration from Original Library

If migrating from the original OpenSRP Family Planning library:

1. **Update Maven coordinates**:
   ```groovy
   // Old
   implementation 'org.smartregister:opensrp-client-fp:x.x.x'
   
   // New
   implementation 'io.github.bluecodesystems:opensrp-client-fp:1.0.1'
   ```

2. **Update imports** (if needed):
   ```java
   // Package names remain the same
   import org.smartregister.fp.common.library.FPLibrary;
   ```

3. **Verify dependencies**: Remove old SNAPSHOT dependencies that may conflict

## Version History

### v1.0.1 (Latest)
- ✅ Modernized build system with AGP 7.4.2
- ✅ Android 12+ manifest compatibility
- ✅ Updated to BlueCode maintained dependencies
- ✅ Maven Central publishing ready
- ✅ Resolved all compilation errors
- ✅ Reference app build fixes

## Development

### Building the Library
```bash
# Build library
./gradlew :opensrp-fp:assembleRelease

# Run tests
./gradlew :opensrp-fp:testDebugUnitTest

# Build reference app
./gradlew :reference-app:assembleRelease
```

### Maven Central Publishing
```bash
# Generate signed bundle for Maven Central
./gradlew :opensrp-fp:zipCentralBundle -PcentralBundle=true -PcentralRelease=true -PuseGpgCmd=true -PVERSION_NAME=1.0.1

# Bundle location: opensrp-fp/build/distributions/central-bundle-opensrp-client-fp-1.0.1.zip
```

## Contributing

1. Fork the repository
2. Create a feature branch: `git checkout -b feature/my-feature`
3. Make your changes and test thoroughly
4. Commit with descriptive messages: `git commit -m "feat: add new feature"`
5. Push to your fork: `git push origin feature/my-feature`
6. Create a Pull Request

## License

```
Copyright 2023 BlueCode Systems

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

## Support

- **Issues**: [GitHub Issues](https://github.com/BlueCodeSystems/opensrp-client-fp/issues)
- **Email**: engineering@bluecodeltd.org
- **Original Project**: [OpenSRP](https://github.com/OpenSRP/opensrp-client-fp)

## Acknowledgments

- Original OpenSRP development team
- BlueCode Systems engineering team
- OpenSRP community contributors

---

**Maintained by [BlueCode Systems](https://github.com/BlueCodeSystems)** | **Based on [OpenSRP](https://github.com/OpenSRP)**