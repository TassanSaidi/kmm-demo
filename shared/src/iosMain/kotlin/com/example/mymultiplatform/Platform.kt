package com.example.mymultiplatform

import platform.CoreBluetooth.CBPeripheral
import platform.UIKit.UIDevice


actual class  Platform actual constructor() {
    actual val platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
    val peri: CBPeripheral = CBPeripheral()

}