// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$521 {

    static final FunctionDescriptor FindFirstPrinterChangeNotification$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindFirstPrinterChangeNotification$MH = RuntimeHelper.downcallHandle(
        "FindFirstPrinterChangeNotification",
        constants$521.FindFirstPrinterChangeNotification$FUNC
    );
    static final FunctionDescriptor FindNextPrinterChangeNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindNextPrinterChangeNotification$MH = RuntimeHelper.downcallHandle(
        "FindNextPrinterChangeNotification",
        constants$521.FindNextPrinterChangeNotification$FUNC
    );
    static final FunctionDescriptor FreePrinterNotifyInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreePrinterNotifyInfo$MH = RuntimeHelper.downcallHandle(
        "FreePrinterNotifyInfo",
        constants$521.FreePrinterNotifyInfo$FUNC
    );
    static final FunctionDescriptor FindClosePrinterChangeNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindClosePrinterChangeNotification$MH = RuntimeHelper.downcallHandle(
        "FindClosePrinterChangeNotification",
        constants$521.FindClosePrinterChangeNotification$FUNC
    );
    static final FunctionDescriptor PrinterMessageBoxA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PrinterMessageBoxA$MH = RuntimeHelper.downcallHandle(
        "PrinterMessageBoxA",
        constants$521.PrinterMessageBoxA$FUNC
    );
    static final FunctionDescriptor PrinterMessageBoxW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PrinterMessageBoxW$MH = RuntimeHelper.downcallHandle(
        "PrinterMessageBoxW",
        constants$521.PrinterMessageBoxW$FUNC
    );
}


