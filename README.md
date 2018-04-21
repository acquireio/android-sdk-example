![Tagove](app/src/main/res/drawable/app_icon.png)
Tagove for Android supports API 21 and above.

### Requirements
-------------
- Android Studio 2.2.x
- Gradle 2.2.x
- Android 7.1.1 SDK
- Android device running Android 5.0 or newer (To get fully functioning sdk)

## Installation Instructions:

### Steps to Install Tagove with all required dependencies 

Add the following dependency to your app's `build.gradle` file:
```groovy
dependencies {
    compile 'com.android.support:appcompat-v7:26.1.0'
    compile('io.socket:socket.io-client:1.0.0') {
        exclude group: 'org.json', module: 'json'
    }
    compile 'com.android.support:multidex:1.0.2'
    compile 'com.android.support:design:26.1.0'
    compile 'com.mikhaellopez:circularimageview:2.1.1'
    compile 'andhradroid.dev:aFilechooser:1.0.1'
    compile 'com.tagove.sdk:core:1.+'
}
```

For our sdk you will need to add these lines to your project's `build.gradle`.
```javascript
// Add these lines to your project gradle:
   
allprojects {
    repositories {
        maven {
            url "http://107.155.116.28:8086/artifactory/libs-release-local"
        }
    }
}
```

## Setup and Configuration

* Our [installation guide](https://developers.tagove.com/android-sdk-api.php) contains full setup and initialisation instructions.
* The [configuration guide](https://developers.tagove.com/android-sdk-api.php) provides info on how to configure Tagove for Android.
* Please contact us on [Tagove](https://www.tagove.com/) with any questions you may have, we're only a message away!

## Permissions

We include the [INTERNET](http://developer.android.com/reference/android/Manifest.permission.html#INTERNET) permission by default as we need it to make network requests:

```xml
<uses-permission android:name="android.permission.INTERNET"/>
```  

Run-time permissions:

```xml
<uses-permission android:name="android.permission.CAMERA" />
<uses-permission android:name="android.permission.RECORD_AUDIO" />
```
It will ask audio/video permissions when required to make a video call.

```xml
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
```
These permissions needed when an attachment is selected to share from the app.

## Dependency graph

Here is our complete dependency graph:

### tagove-sdk-core
```
# Transitive (shared with your app)
+--- com.android.support:appcompat-v7:26.1.0
+--- io.socket:socket.io-client:0.8.3
+--- com.android.support:design:26.1.0
+--- com.mikhaellopez:circularimageview:2.1.1
+--- andhradroid.dev:aFilechooser:1.0.1

# Repackaged (not shared with your app)
+--- com.jakewharton.picasso:picasso2-okhttp3-downloader:1.1.0
+--- com.squareup.picasso:picasso:2.5.2
+--- com.google.code.gson:gson:2.8.1
```

## Building 
- Make sure you've installed the Android 7.1.1 SDK and upgraded to the latest version of Android Studio
- Make sure you've updated all support repository and Google Play Services repository packages in the Android SDK manager
- Check out or Download nilayTagove/DemoApp project for easy setup for your project.
- See the configuration and clone the environment into your project to run our Tagove chat sdk.

Note : _**If you are using gradle Plugin version 3.0 then use implementation instead of compile**_.         
For release apk if you want to give support to arm-v7 ABI only then use "```'com.tagove.sdk:core-arm-v7a:1.+'```" instead of "```'com.tagove.sdk:core:1.+'```". to reduce apk size.

-------------

If you are using proguard then add these lines into your proguard-rules.pro
```javascript
-dontwarn com.squareup.**
-dontwarn okio.**

-keep class org.webrtc.** {*;}
-keep class com.tagove.sdk**
-keep class com.tagove.sdk.activities**
-keep class com.squareup**
-keep class com.jakewharton**
-keepattributes Signature
-keep class sun.misc.Unsafe { *; }

-keep class com.crashlytics.** { *; }
-dontwarn com.crashlytics.**

-keepclassmembers class com.tagove.sdk** {*;}
-keepclassmembers class com.squareup** {*;}
-keepclassmembers class com.jakewharton** {*;}

-keep public class com.tagove.sdk.** {
  public protected *;
}
-keep public class io.socket.** {
  public protected *;
}
-keep public class com.mikhaellopez.** {
  public protected *;
}
```
And that's it :thumbsup: 
Voila!! You had integrated whole chat module in few minutes.

To Enable Debug Mode Please tap on Text chat button on top for 5 times.
