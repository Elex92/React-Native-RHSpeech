# React-Native-RHSpeech[![npm version](https://img.shields.io/npm/v/react-native-rhspeech.svg?style=flat)](https://www.npmjs.com/package/react-native-rhspeech)
## **瑞昊RN项目定位组件**
Android基于百度语音合成V2.3.3，支持离线或在线播报。


iOS基于百度语音合成V2.3.6，支持离线或在线播报。

## Install 安装

* npm install react-native-rhspeech --save

## Import 导入

### 自动导入

* react-native link react-native-rhspeech

### 手动配置

#### Android Studio
1. 配置 AndroidManifest.xml 文件

 ##### 	  添加权限
		<uses-permission android:name="android.permission.INTERNET" />
		<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
		<uses-permission android:name="android.permission.MODIFY_AUDIO_SETTINGS" />
		<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
		<uses-permission android:name="android.permission.WRITE_SETTINGS" />
		<uses-permission android:name="android.permission.READ_PHONE_STATE" />
		<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
		<uses-permission android:name="android.permission.CHANGE_WIFI_STATE" />

2. 配置百度语音合成参数

	在android/src/SpeechModule.java中配置 APP_ID、API_KEY、SECRET_KEY三个值


3. 新增so文件
	将node_modules/react-native-rhspeech目录下jniLibs文件夹中so文件，拷贝到自己Android工程下android/app/src/main中。

#### Xcode

1. 在工程下TARGETS->Build Phases->Link Binary With Libraries 中添加libiconv.2.4.0.tbd、libsqlite3.0.tbd

2. 配置百度语音合成参数
	在RCTSpeechModule.xcodeproj->RCTSpeechModule->SpeechManager->SpeechManager.m中配置APP_ID、API_KEY、SECRET_KEY三个值

### 使用方法

	import  SpeechModule from 'react-native-rhspeech';


 	SpeechModule.speakText('');





