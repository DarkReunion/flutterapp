package com.example.flutterapp

import android.app.Activity
import io.flutter.FlutterInjector

fun findAppBundlePath(): String {
  return FlutterInjector.instance().flutterLoader().findAppBundlePath()
}

val Activity.app: AndroidWindowApplication?
  get() {
    return application as? AndroidWindowApplication
  }
