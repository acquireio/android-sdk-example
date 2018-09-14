![Acquire](app/src/main/res/drawable/app_icon.png)
Acquire for Android supports API 21 and above.

### Requirements
-------------
- Android Studio 2.2.x
- Gradle 2.2.x
- Android 7.1.1 SDK
- Android device running Android 5.0 or newer (To get fully functioning sdk)

## Installation Instructions:

### Steps to Install Acquire with all required dependencies 

Add the following dependency to your app's `build.gradle` file:
```groovy
dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation 'com.android.support:design:27.1.1'
    implementation 'com.android.support:appcompat-v7:27.1.1'
    implementation 'com.android.support:multidex:1.0.3'
    implementation 'com.android.support:support-emoji-appcompat:27.1.1'
    implementation('io.socket:socket.io-client:1.0.0') {
        exclude group: 'org.json', module: 'json'
    }
    implementation 'com.acquireio:core:1.+'
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

* Our [installation guide](https://developers.acquire.io/integration-sdk) contains full setup and initialisation instructions.
* The [configuration guide](https://developers.acquire.io/initialization-android) provides info on how to configure Acquire for Android.
* Please contact us on [Acquire](https://www.acquire.io/) with any questions you may have, we're only a message away!

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

## Building 
- Make sure you've installed the Android 7.1.1 SDK and upgraded to the latest version of Android Studio
- Make sure you've updated all support repository and Google Play Services repository packages in the Android SDK manager
- See the configuration and clone the environment into your project to run our Acquire chat sdk.

Note : _**If you are using gradle Plugin version 3.0 then use implementation instead of compile**_.         
For release apk if you want to give support to arm-v7 ABI only then use "```'com.acquireio:core-arm-v7a:1.+'```" instead of "```'com.acquireio:core:1.+'```". to reduce apk size.

-------------

And that's it :thumbsup: 
Voila!! You had integrated whole chat module in few minutes.
