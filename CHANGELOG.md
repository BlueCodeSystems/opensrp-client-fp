
# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/en/1.0.0/)
and this project adheres to [Semantic Versioning](http://semver.org/spec/v2.0.0.html).

## [2.1.0] - 2025-09-04

- New features: Add pagination controls and due filter state icons with supporting resources (strings, colors, styles, IDs) to enable paginated register UI and align visuals with Material components.
- Bug fixes: Remove unreachable catch to simplify error handling and avoid masking exceptions in edge cases.
- Dependencies: Bump EventBus to 3.3.1; upgrade Android Gradle Plugin to 8.2.2, Gradle Wrapper to 8.6, and JaCoCo to 0.8.11.
- Build: Migrate to AGP 8 DSLs, set Java 17 compatibility, update javadoc bootClasspath accessors, adjust manifest exported flags, disable debug unit test coverage to avoid instrumentation issues, and improve JitPack build by publishing Maven publication to local Maven during CI.

## [2.0.0] - 2025-09-03

- Breaking changes: Increase `minSdk` to 28; migrate to AndroidX and update compile/target SDK to 34. Consumers must use AndroidX and ensure compatible build tooling.
- New features: Add `startFormActivity(String, String, Map<String,String>)` overload in `HomeRegisterActivity` and update callers to avoid overload ambiguity.
- Bug fixes: Correct imports for `org.smartregister.domain.Client` and `Event` to match updated core library; mark long health content strings as `formatted="false"` to prevent runtime format parsing.
- Dependencies: Replace legacy support libraries with AndroidX (`material`, `recyclerview`, `cardview`); update OpenSRP libraries to `opensrp-client-core:6.2.0`, `opensrp-client-configurable-views:v2.0.1`, `opensrp-client-native-form-new:3.1.3`; add `timber`, `volley`, `play-services-vision`, `androidx.sqlite`, `opensrp-plan-evaluator`, and `opensrp-client-opd`; pin Jackson to `2.13.5` and align duplicate/alias coordinates.
- Build: Remove multidex and core library desugaring (not needed at `minSdk 28+`); drop obsolete `dexOptions`.

[2.0.0]: https://github.com/OpenSRP/opensrp-client-fp/releases/tag/v2.0.0
[2.1.0]: https://github.com/OpenSRP/opensrp-client-fp/releases/tag/v2.1.0
